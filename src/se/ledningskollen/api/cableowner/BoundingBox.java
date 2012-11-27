
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaxX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MinY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaxY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBox", propOrder = {
    "minX",
    "maxX",
    "minY",
    "maxY"
})
public class BoundingBox {

    @XmlElement(name = "MinX")
    protected double minX;
    @XmlElement(name = "MaxX")
    protected double maxX;
    @XmlElement(name = "MinY")
    protected double minY;
    @XmlElement(name = "MaxY")
    protected double maxY;

    /**
     * Gets the value of the minX property.
     * 
     */
    public double getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     */
    public void setMinX(double value) {
        this.minX = value;
    }

    /**
     * Gets the value of the maxX property.
     * 
     */
    public double getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     */
    public void setMaxX(double value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     */
    public double getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     */
    public void setMinY(double value) {
        this.minY = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     */
    public double getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     */
    public void setMaxY(double value) {
        this.maxY = value;
    }

}
