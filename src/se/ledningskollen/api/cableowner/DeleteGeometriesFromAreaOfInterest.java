
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
 *         &lt;element name="geometryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "geometryId"
})
@XmlRootElement(name = "DeleteGeometriesFromAreaOfInterest")
public class DeleteGeometriesFromAreaOfInterest {

    protected int aoiId;
    protected int geometryId;

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
     * Gets the value of the geometryId property.
     * 
     */
    public int getGeometryId() {
        return geometryId;
    }

    /**
     * Sets the value of the geometryId property.
     * 
     */
    public void setGeometryId(int value) {
        this.geometryId = value;
    }

}
