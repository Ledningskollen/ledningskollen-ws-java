
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
 *         &lt;element name="GetAllCasesResult" type="{http://ella.ledningskollen.se/}ArrayOfCase" minOccurs="0"/>
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
    "getAllCasesResult"
})
@XmlRootElement(name = "GetAllCasesResponse")
public class GetAllCasesResponse {

    @XmlElement(name = "GetAllCasesResult")
    protected ArrayOfCase getAllCasesResult;

    /**
     * Gets the value of the getAllCasesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCase }
     *     
     */
    public ArrayOfCase getGetAllCasesResult() {
        return getAllCasesResult;
    }

    /**
     * Sets the value of the getAllCasesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCase }
     *     
     */
    public void setGetAllCasesResult(ArrayOfCase value) {
        this.getAllCasesResult = value;
    }

}
