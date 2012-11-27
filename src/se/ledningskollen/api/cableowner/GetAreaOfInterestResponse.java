
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
 *         &lt;element name="GetAreaOfInterestResult" type="{http://ella.ledningskollen.se/}AreaOfInterest1" minOccurs="0"/>
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
    "getAreaOfInterestResult"
})
@XmlRootElement(name = "GetAreaOfInterestResponse")
public class GetAreaOfInterestResponse {

    @XmlElement(name = "GetAreaOfInterestResult")
    protected AreaOfInterest1 getAreaOfInterestResult;

    /**
     * Gets the value of the getAreaOfInterestResult property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterest1 }
     *     
     */
    public AreaOfInterest1 getGetAreaOfInterestResult() {
        return getAreaOfInterestResult;
    }

    /**
     * Sets the value of the getAreaOfInterestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterest1 }
     *     
     */
    public void setGetAreaOfInterestResult(AreaOfInterest1 value) {
        this.getAreaOfInterestResult = value;
    }

}
