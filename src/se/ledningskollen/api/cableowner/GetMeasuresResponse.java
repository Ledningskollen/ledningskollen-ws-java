
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
 *         &lt;element name="GetMeasuresResult" type="{http://ella.ledningskollen.se/}ArrayOfMeasure" minOccurs="0"/>
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
    "getMeasuresResult"
})
@XmlRootElement(name = "GetMeasuresResponse")
public class GetMeasuresResponse {

    @XmlElement(name = "GetMeasuresResult")
    protected ArrayOfMeasure getMeasuresResult;

    /**
     * Gets the value of the getMeasuresResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeasure }
     *     
     */
    public ArrayOfMeasure getGetMeasuresResult() {
        return getMeasuresResult;
    }

    /**
     * Sets the value of the getMeasuresResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeasure }
     *     
     */
    public void setGetMeasuresResult(ArrayOfMeasure value) {
        this.getMeasuresResult = value;
    }

}
