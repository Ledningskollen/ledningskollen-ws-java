
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
 *         &lt;element name="GetFilteredCaseListResult" type="{http://ella.ledningskollen.se/}ArrayOfCase" minOccurs="0"/>
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
    "getFilteredCaseListResult"
})
@XmlRootElement(name = "GetFilteredCaseListResponse")
public class GetFilteredCaseListResponse {

    @XmlElement(name = "GetFilteredCaseListResult")
    protected ArrayOfCase getFilteredCaseListResult;

    /**
     * Gets the value of the getFilteredCaseListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCase }
     *     
     */
    public ArrayOfCase getGetFilteredCaseListResult() {
        return getFilteredCaseListResult;
    }

    /**
     * Sets the value of the getFilteredCaseListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCase }
     *     
     */
    public void setGetFilteredCaseListResult(ArrayOfCase value) {
        this.getFilteredCaseListResult = value;
    }

}
