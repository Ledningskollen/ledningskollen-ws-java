
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
 *         &lt;element name="GetAllAreasOfInterestWithDataResult" type="{http://ella.ledningskollen.se/}ArrayOfAreaOfInterest1" minOccurs="0"/>
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
    "getAllAreasOfInterestWithDataResult"
})
@XmlRootElement(name = "GetAllAreasOfInterestWithDataResponse")
public class GetAllAreasOfInterestWithDataResponse {

    @XmlElement(name = "GetAllAreasOfInterestWithDataResult")
    protected ArrayOfAreaOfInterest1 getAllAreasOfInterestWithDataResult;

    /**
     * Gets the value of the getAllAreasOfInterestWithDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAreaOfInterest1 }
     *     
     */
    public ArrayOfAreaOfInterest1 getGetAllAreasOfInterestWithDataResult() {
        return getAllAreasOfInterestWithDataResult;
    }

    /**
     * Sets the value of the getAllAreasOfInterestWithDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAreaOfInterest1 }
     *     
     */
    public void setGetAllAreasOfInterestWithDataResult(ArrayOfAreaOfInterest1 value) {
        this.getAllAreasOfInterestWithDataResult = value;
    }

}
