
package se.ledningskollen.api.cableowner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAreaOfInterest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAreaOfInterest1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaOfInterest1" type="{http://ella.ledningskollen.se/}AreaOfInterest1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAreaOfInterest1", propOrder = {
    "areaOfInterest1"
})
public class ArrayOfAreaOfInterest1 {

    @XmlElement(name = "AreaOfInterest1", nillable = true)
    protected List<AreaOfInterest1> areaOfInterest1;

    /**
     * Gets the value of the areaOfInterest1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaOfInterest1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaOfInterest1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaOfInterest1 }
     * 
     * 
     */
    public List<AreaOfInterest1> getAreaOfInterest1() {
        if (areaOfInterest1 == null) {
            areaOfInterest1 = new ArrayList<AreaOfInterest1>();
        }
        return this.areaOfInterest1;
    }

}
