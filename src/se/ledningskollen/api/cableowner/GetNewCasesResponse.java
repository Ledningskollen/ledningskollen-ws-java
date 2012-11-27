
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
 *         &lt;element name="GetNewCasesResult" type="{http://ella.ledningskollen.se/}ArrayOfCase" minOccurs="0"/>
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
    "getNewCasesResult"
})
@XmlRootElement(name = "GetNewCasesResponse")
public class GetNewCasesResponse {

    @XmlElement(name = "GetNewCasesResult")
    protected ArrayOfCase getNewCasesResult;

    /**
     * Gets the value of the getNewCasesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCase }
     *     
     */
    public ArrayOfCase getGetNewCasesResult() {
        return getNewCasesResult;
    }

    /**
     * Sets the value of the getNewCasesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCase }
     *     
     */
    public void setGetNewCasesResult(ArrayOfCase value) {
        this.getNewCasesResult = value;
    }

}
