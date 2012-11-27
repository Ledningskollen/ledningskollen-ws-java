
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
 *         &lt;element name="GetCaseResult" type="{http://ella.ledningskollen.se/}Case" minOccurs="0"/>
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
    "getCaseResult"
})
@XmlRootElement(name = "GetCaseResponse")
public class GetCaseResponse {

    @XmlElement(name = "GetCaseResult")
    protected Case getCaseResult;

    /**
     * Gets the value of the getCaseResult property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getGetCaseResult() {
        return getCaseResult;
    }

    /**
     * Sets the value of the getCaseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public void setGetCaseResult(Case value) {
        this.getCaseResult = value;
    }

}
