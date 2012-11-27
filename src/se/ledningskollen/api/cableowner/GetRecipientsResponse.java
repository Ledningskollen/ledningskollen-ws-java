
package se.ledningskollen.api.cableowner;

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
 *         &lt;element name="GetRecipientsResult" type="{http://ella.ledningskollen.se/}ArrayOfRecipient" minOccurs="0"/>
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
    "getRecipientsResult"
})
@XmlRootElement(name = "GetRecipientsResponse")
public class GetRecipientsResponse {

    @XmlElement(name = "GetRecipientsResult")
    protected ArrayOfRecipient getRecipientsResult;

    /**
     * Gets the value of the getRecipientsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public ArrayOfRecipient getGetRecipientsResult() {
        return getRecipientsResult;
    }

    /**
     * Sets the value of the getRecipientsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipient }
     *     
     */
    public void setGetRecipientsResult(ArrayOfRecipient value) {
        this.getRecipientsResult = value;
    }

}
