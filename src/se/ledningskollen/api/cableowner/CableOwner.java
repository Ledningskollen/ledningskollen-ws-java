
package se.ledningskollen.api.cableowner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CableOwner", targetNamespace = "http://ella.ledningskollen.se/", wsdlLocation = "https://ella.ledningskollen.se/cableowner/CableOwner.asmx?wsdl")
public class CableOwner
    extends Service
{

    private final static URL CABLEOWNER_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(se.ledningskollen.api.cableowner.CableOwner.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = se.ledningskollen.api.cableowner.CableOwner.class.getResource(".");
            url = new URL(baseUrl, "https://ella.ledningskollen.se/cableowner/CableOwner.asmx?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://ella.ledningskollen.se/cableowner/CableOwner.asmx?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CABLEOWNER_WSDL_LOCATION = url;
    }

    public CableOwner(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CableOwner() {
        super(CABLEOWNER_WSDL_LOCATION, new QName("http://ella.ledningskollen.se/", "CableOwner"));
    }

    /**
     * 
     * @return
     *     returns CableOwnerSoap
     */
    @WebEndpoint(name = "CableOwnerSoap")
    public CableOwnerSoap getCableOwnerSoap() {
        return super.getPort(new QName("http://ella.ledningskollen.se/", "CableOwnerSoap"), CableOwnerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CableOwnerSoap
     */
    @WebEndpoint(name = "CableOwnerSoap")
    public CableOwnerSoap getCableOwnerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ella.ledningskollen.se/", "CableOwnerSoap"), CableOwnerSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns CableOwnerSoap
     */
    @WebEndpoint(name = "CableOwnerSoap12")
    public CableOwnerSoap getCableOwnerSoap12() {
        return super.getPort(new QName("http://ella.ledningskollen.se/", "CableOwnerSoap12"), CableOwnerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CableOwnerSoap
     */
    @WebEndpoint(name = "CableOwnerSoap12")
    public CableOwnerSoap getCableOwnerSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://ella.ledningskollen.se/", "CableOwnerSoap12"), CableOwnerSoap.class, features);
    }

}