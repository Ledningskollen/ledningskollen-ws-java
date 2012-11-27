
package se.ledningskollen.api.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogOutResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logOutResult"
})
@XmlRootElement(name = "LogOutResponse")
public class LogOutResponse {

    @XmlElement(name = "LogOutResult")
    protected String logOutResult;

    /**
     * Gets the value of the logOutResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogOutResult() {
        return logOutResult;
    }

    /**
     * Sets the value of the logOutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogOutResult(String value) {
        this.logOutResult = value;
    }

}
