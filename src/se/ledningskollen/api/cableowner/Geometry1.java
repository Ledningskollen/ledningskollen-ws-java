
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Geometry1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometry1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://ella.ledningskollen.se/}GeometryType"/>
 *         &lt;element name="BoundingBox" type="{http://ella.ledningskollen.se/}BoundingBox" minOccurs="0"/>
 *         &lt;element name="Geometry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometry1", propOrder = {
    "id",
    "type",
    "boundingBox",
    "geometry",
    "createdWith"
})
public class Geometry1 {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Type", required = true)
    protected GeometryType type;
    @XmlElement(name = "BoundingBox")
    protected BoundingBox boundingBox;
    @XmlElement(name = "Geometry")
    protected String geometry;
    @XmlElement(name = "CreatedWith")
    protected String createdWith;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryType }
     *     
     */
    public GeometryType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryType }
     *     
     */
    public void setType(GeometryType value) {
        this.type = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBox }
     *     
     */
    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBox }
     *     
     */
    public void setBoundingBox(BoundingBox value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometry(String value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the createdWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedWith() {
        return createdWith;
    }

    /**
     * Sets the value of the createdWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedWith(String value) {
        this.createdWith = value;
    }

}
