package se.ledningskollen.example.client;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import se.ledningskollen.api.cableowner.AreaOfInterest1;
import se.ledningskollen.api.cableowner.ArrayOfAreaOfInterest1;
import se.ledningskollen.api.cableowner.CableOwner;
import se.ledningskollen.api.cableowner.CableOwnerSoap;
import se.ledningskollen.api.login.AuthenticateWebServiceUser;
import se.ledningskollen.api.login.AuthenticateWebServiceUserSoap;

/**
 * <p>This is an example of a client for Ledningskollen's web service API.
 * It illustrates how a client can be written using JAX WS, which is
 * bundled with Java 6 and forward.</p>
 * 
 * <p>This is quite straight forward JAX WS, except for the login and
 * authentication handling, which is a little bit tricky since Ledningskollen's
 * web services rely on cookie authentication, and the authentication
 * cookies should be shared by more than one service endpoint. JAX WS in
 * itself does not support this, so the cookie handling must be implemented
 * manually.</p>
 * 
 * <p>The client class has methods for logging in and out (<code>login</code>
 * and <code>logout</code>). After a successful login, the client instance's
 * <code>initService</code> method can be used to initialize a service (a
 * JAX WS Port/proxy) with the required authentication cookies.
 * 
 * <p>The class' <code>main</code> method shows an example of how the class
 * is intended to be used.</p>
 * 
 * @author Per Liedman
 *
 */
public class Client {
	private String baseURI;
	private String username;
	private String password;
	private CookieManager cookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);

	/**
	 * <p>Creates a new client instance with the specified authentication
	 * credentials.</p>
	 * 
	 * @param username
	 * @param password
	 */
	public Client(String username, String password) {
		this(null, username, password);
	}

	/**
	 * <p>Creates a new client instance with the specified authentication
	 * credentials and service base URI.</p>
	 * 
	 * The service base URI can be used to access other deployments of
	 * Ledningskollen, like specifically the test instance of Ledningskollen
	 * (base URI <code>https://test.ledningskollen.se/ella/</code>). If not
	 * specified, Ledningskollen's production URI will be used.
	 * 
	 * @param baseURI The base URI to use when initializing services
	 * @param username
	 * @param password
	 */
	public Client(String baseURI, String username, String password) {
		this.baseURI = baseURI;
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Attempts to authenticate the instance's username and password
	 * against Ledningskollen.
	 * @return <code>true</code> if the authentication is successful
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws SOAPException if an authentication error occurs
	 */
	public boolean login() throws IOException, URISyntaxException {
		AuthenticateWebServiceUser loginService = new AuthenticateWebServiceUser();
		AuthenticateWebServiceUserSoap authenticateWebServiceUserSoap = loginService.getAuthenticateWebServiceUserSoap();		
		BindingProvider bindingProvider = (BindingProvider)authenticateWebServiceUserSoap;
		setupURI(bindingProvider);
		
		String login = authenticateWebServiceUserSoap.login(username, password);
		boolean success = login.equals("");
		if (success) {
			Map<String, List<String>> responseHeaders = 
				(Map<String, List<String>>) bindingProvider.getResponseContext().get(MessageContext.HTTP_RESPONSE_HEADERS);
			String serviceUri = 
				(String)bindingProvider.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
			cookieManager.put(new URI(serviceUri), responseHeaders);
		}
		
		return success;
	}
	
	public boolean logout() throws IOException, URISyntaxException {
		AuthenticateWebServiceUser loginService = new AuthenticateWebServiceUser();
		AuthenticateWebServiceUserSoap authenticateWebServiceUserSoap = loginService.getAuthenticateWebServiceUserSoap();		
		initService((BindingProvider) authenticateWebServiceUserSoap);
		
		boolean success = authenticateWebServiceUserSoap.logOut().equals("");
		return success;
	}
	
	public void initService(BindingProvider service) throws IOException, URISyntaxException {
		setupURI(service);
		setCookies(service);
	}
	
	private void setupURI(BindingProvider service) {
		if (baseURI != null) {
			Map<String, Object> requestContext = service.getRequestContext();
			String uri = ((String) requestContext.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY))
				.replace("https://ella.ledningskollen.se/", baseURI);
			
			requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, uri);
		}
	}

	private void setCookies(BindingProvider b) throws IOException, URISyntaxException {
		Map<String, Object> requestContext = b.getRequestContext();
		String serviceUri = 
			(String)requestContext.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
		Map<String, List<String>> requestHeaders = new HashMap<String, List<String>>();
		Map<String, List<String>> cookieHeaders = cookieManager.get(new URI(serviceUri), requestHeaders);

		if (cookieHeaders.size() > 0) {
			for (String cookieHeader : cookieHeaders.keySet()) {
				List<String> headers = cookieHeaders.get(cookieHeader);
				
				List<String> cookieValue = new ArrayList<String>();
				StringBuffer currentCookie = new StringBuffer(cookieValue.size() > 0 ? cookieValue.get(0) : "");
				for (String header : headers) {
					currentCookie.append(header)
						.append(";");
				}
				requestHeaders.put(cookieHeader, Collections.singletonList(currentCookie.toString()));
			}
			
			requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
		}
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		if (args.length != 3) {
			System.err.println("Expected three arguments:\n\n\tBASEURI USERNAME PASSWORD");
			System.exit(1);
		}
		
		String baseURI = args[0];
		String login = args[1];
		String password = args[2];
		
		Client client = new Client(baseURI, login, password);
		
		if (!client.login()) {
			System.err.println("Authentication failed, login returned: \"" + login + "\".");
			System.exit(1);
		} else {
			System.out.println("Successfully authenticated as \"" + login + "\".");
			
			CableOwner cableOwnerService = new CableOwner();
			CableOwnerSoap cableOwnerSoap = cableOwnerService.getCableOwnerSoap();
			client.initService((BindingProvider) cableOwnerSoap);
			
			System.out.println("Areas of interest:");
			ArrayOfAreaOfInterest1 areasOfInterest = cableOwnerSoap.getAllAreasOfInterestWithData();
			for (AreaOfInterest1 areaOfInterest : areasOfInterest.getAreaOfInterest1()) {
				System.out.println("\t" + areaOfInterest.getName());
			}
			
			if (client.logout()) {
				System.out.println("Logged out.");
			} else {
				System.out.println("Logout failed.");
			}
		}
	}
}
