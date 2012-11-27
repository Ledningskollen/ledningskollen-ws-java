
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
 *         &lt;element name="aoiId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="geometry" type="{http://ella.ledningskollen.se/}Geometry" minOccurs="0"/>
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
    "aoiId",
    "geometry"
})
@XmlRootElement(name = "AddGeometryToAreaOfInterest")
public class AddGeometryToAreaOfInterest {

    protected int aoiId;
    protected Geometry geometry;

    /**
     * Gets the value of the aoiId property.
     * 
     */
    public int getAoiId() {
        return aoiId;
    }

    /**
     * Sets the value of the aoiId property.
     * 
     */
    public void setAoiId(int value) {
        this.aoiId = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

}
