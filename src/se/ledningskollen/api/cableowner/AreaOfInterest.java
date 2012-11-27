
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaOfInterest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaOfInterest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Geometries" type="{http://ella.ledningskollen.se/}ArrayOfGeometry" minOccurs="0"/>
 *         &lt;element name="Recipients" type="{http://ella.ledningskollen.se/}ArrayOfPurposeRecipient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaOfInterest", propOrder = {
    "name",
    "geometries",
    "recipients"
})
public class AreaOfInterest {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Geometries")
    protected ArrayOfGeometry geometries;
    @XmlElement(name = "Recipients")
    protected ArrayOfPurposeRecipient recipients;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the geometries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeometry }
     *     
     */
    public ArrayOfGeometry getGeometries() {
        return geometries;
    }

    /**
     * Sets the value of the geometries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeometry }
     *     
     */
    public void setGeometries(ArrayOfGeometry value) {
        this.geometries = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPurposeRecipient }
     *     
     */
    public ArrayOfPurposeRecipient getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPurposeRecipient }
     *     
     */
    public void setRecipients(ArrayOfPurposeRecipient value) {
        this.recipients = value;
    }

}
