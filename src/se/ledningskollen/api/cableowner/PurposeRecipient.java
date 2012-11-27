
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurposeRecipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurposeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecipientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurposeRecipient", propOrder = {
    "purposeId",
    "recipientId"
})
public class PurposeRecipient {

    @XmlElement(name = "PurposeId")
    protected int purposeId;
    @XmlElement(name = "RecipientId")
    protected int recipientId;

    /**
     * Gets the value of the purposeId property.
     * 
     */
    public int getPurposeId() {
        return purposeId;
    }

    /**
     * Sets the value of the purposeId property.
     * 
     */
    public void setPurposeId(int value) {
        this.purposeId = value;
    }

    /**
     * Gets the value of the recipientId property.
     * 
     */
    public int getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the value of the recipientId property.
     * 
     */
    public void setRecipientId(int value) {
        this.recipientId = value;
    }

}
