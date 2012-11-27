
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="aoi" type="{http://ella.ledningskollen.se/}AreaOfInterest" minOccurs="0"/>
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
    "aoi"
})
@XmlRootElement(name = "AddAreaOfInterest")
public class AddAreaOfInterest {

    protected AreaOfInterest aoi;

    /**
     * Gets the value of the aoi property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterest }
     *     
     */
    public AreaOfInterest getAoi() {
        return aoi;
    }

    /**
     * Sets the value of the aoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterest }
     *     
     */
    public void setAoi(AreaOfInterest value) {
        this.aoi = value;
    }

}
