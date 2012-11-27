
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
 *         &lt;element name="GetPurposesResult" type="{http://ella.ledningskollen.se/}ArrayOfPurpose" minOccurs="0"/>
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
    "getPurposesResult"
})
@XmlRootElement(name = "GetPurposesResponse")
public class GetPurposesResponse {

    @XmlElement(name = "GetPurposesResult")
    protected ArrayOfPurpose getPurposesResult;

    /**
     * Gets the value of the getPurposesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurpose }
     *     
     */
    public ArrayOfPurpose getGetPurposesResult() {
        return getPurposesResult;
    }

    /**
     * Sets the value of the getPurposesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurpose }
     *     
     */
    public void setGetPurposesResult(ArrayOfPurpose value) {
        this.getPurposesResult = value;
    }

}
