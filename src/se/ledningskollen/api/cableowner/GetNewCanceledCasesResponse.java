
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
 *         &lt;element name="GetNewCanceledCasesResult" type="{http://ella.ledningskollen.se/}ArrayOfCase" minOccurs="0"/>
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
    "getNewCanceledCasesResult"
})
@XmlRootElement(name = "GetNewCanceledCasesResponse")
public class GetNewCanceledCasesResponse {

    @XmlElement(name = "GetNewCanceledCasesResult")
    protected ArrayOfCase getNewCanceledCasesResult;

    /**
     * Gets the value of the getNewCanceledCasesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCase }
     *     
     */
    public ArrayOfCase getGetNewCanceledCasesResult() {
        return getNewCanceledCasesResult;
    }

    /**
     * Sets the value of the getNewCanceledCasesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCase }
     *     
     */
    public void setGetNewCanceledCasesResult(ArrayOfCase value) {
        this.getNewCanceledCasesResult = value;
    }

}
