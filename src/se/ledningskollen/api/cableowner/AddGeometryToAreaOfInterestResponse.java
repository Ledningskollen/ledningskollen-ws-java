
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
 *         &lt;element name="AddGeometryToAreaOfInterestResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "addGeometryToAreaOfInterestResult"
})
@XmlRootElement(name = "AddGeometryToAreaOfInterestResponse")
public class AddGeometryToAreaOfInterestResponse {

    @XmlElement(name = "AddGeometryToAreaOfInterestResult")
    protected String addGeometryToAreaOfInterestResult;

    /**
     * Gets the value of the addGeometryToAreaOfInterestResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddGeometryToAreaOfInterestResult() {
        return addGeometryToAreaOfInterestResult;
    }

    /**
     * Sets the value of the addGeometryToAreaOfInterestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddGeometryToAreaOfInterestResult(String value) {
        this.addGeometryToAreaOfInterestResult = value;
    }

}
