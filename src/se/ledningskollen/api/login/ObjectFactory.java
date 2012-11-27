
package se.ledningskollen.api.login;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.ledningskollen.api.login package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.ledningskollen.api.login
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginAsUserResponse }
     * 
     */
    public LoginAsUserResponse createLoginAsUserResponse() {
        return new LoginAsUserResponse();
    }

    /**
     * Create an instance of {@link LogOut }
     * 
     */
    public LogOut createLogOut() {
        return new LogOut();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginAsUser }
     * 
     */
    public LoginAsUser createLoginAsUser() {
        return new LoginAsUser();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LogOutResponse }
     * 
     */
    public LogOutResponse createLogOutResponse() {
        return new LogOutResponse();
    }

}
