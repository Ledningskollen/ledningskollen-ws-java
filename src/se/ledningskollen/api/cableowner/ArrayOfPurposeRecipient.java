
package se.ledningskollen.api.cableowner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPurposeRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPurposeRecipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurposeRecipient" type="{http://ella.ledningskollen.se/}PurposeRecipient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPurposeRecipient", propOrder = {
    "purposeRecipient"
})
public class ArrayOfPurposeRecipient {

    @XmlElement(name = "PurposeRecipient", nillable = true)
    protected List<PurposeRecipient> purposeRecipient;

    /**
     * Gets the value of the purposeRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purposeRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurposeRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurposeRecipient }
     * 
     * 
     */
    public List<PurposeRecipient> getPurposeRecipient() {
        if (purposeRecipient == null) {
            purposeRecipient = new ArrayList<PurposeRecipient>();
        }
        return this.purposeRecipient;
    }

}
