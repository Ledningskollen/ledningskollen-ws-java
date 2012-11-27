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

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import se.ledningskollen.api.cableowner.AreaOfInterest1;
import se.ledningskollen.api.cableowner.ArrayOfAreaOfInterest1;
import se.ledningskollen.api.cableowner.CableOwner;
import se.ledningskollen.api.cableowner.CableOwnerSoap;
import se.ledningskollen.api.login.AuthenticateWebServiceUser;
import se.ledningskollen.api.login.AuthenticateWebServiceUserSoap;

public class Client {
	private String baseURI;
	private String username;
	private String password;
	private CookieManager cookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
	
	public Client(String baseURI, String username, String password) {
		this.baseURI = baseURI;
		this.username = username;
		this.password = password;
	}
	
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
	
	public boolean logout() {
		return true;
	}
	
	public void initService(BindingProvider service) throws IOException, URISyntaxException {
		setupURI(service);
		setCookies(service);
	}
	
	private void setupURI(BindingProvider service) {
		Map<String, Object> requestContext = service.getRequestContext();
		String uri = ((String) requestContext.get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY))
			.replace("https://ella.ledningskollen.se/", baseURI);
		
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, uri);
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
			System.out.println("Set cookies:");
			for (HttpCookie cookie : client.cookieManager.getCookieStore().getCookies()) {
				System.out.println("\t" + cookie.getName() + "=" + cookie.getValue());
			}
			
			CableOwner cableOwnerService = new CableOwner();
			CableOwnerSoap cableOwnerSoap = cableOwnerService.getCableOwnerSoap();
			client.initService((BindingProvider) cableOwnerSoap);
			
			System.out.println("Areas of interest:");
			ArrayOfAreaOfInterest1 areasOfInterest = cableOwnerSoap.getAllAreasOfInterestWithData();
			for (AreaOfInterest1 areaOfInterest : areasOfInterest.getAreaOfInterest1()) {
				System.out.println("\t" + areaOfInterest.getName());
			}
		}
	}
}
