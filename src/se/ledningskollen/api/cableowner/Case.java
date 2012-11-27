
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Case complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Case">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://ella.ledningskollen.se/}CaseStatus"/>
 *         &lt;element name="Inquirer" type="{http://ella.ledningskollen.se/}User" minOccurs="0"/>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Purpose" type="{http://ella.ledningskollen.se/}Purpose" minOccurs="0"/>
 *         &lt;element name="Geometries" type="{http://ella.ledningskollen.se/}ArrayOfGeometry1" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://ella.ledningskollen.se/}ArrayOfAttributes" minOccurs="0"/>
 *         &lt;element name="ExcavatingDepth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://ella.ledningskollen.se/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TypeOfWork" type="{http://ella.ledningskollen.se/}ArrayOfTypeOfWork" minOccurs="0"/>
 *         &lt;element name="Regions" type="{http://ella.ledningskollen.se/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InquirerCaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientStatus" type="{http://ella.ledningskollen.se/}CaseRecipientStatus"/>
 *         &lt;element name="Confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SWEREF99" type="{http://ella.ledningskollen.se/}ArrayOfDouble" minOccurs="0"/>
 *         &lt;element name="RT90" type="{http://ella.ledningskollen.se/}ArrayOfDouble" minOccurs="0"/>
 *         &lt;element name="WGS84" type="{http://ella.ledningskollen.se/}ArrayOfDouble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Case", propOrder = {
    "id",
    "number",
    "status",
    "inquirer",
    "creationTime",
    "startDate",
    "endDate",
    "purpose",
    "geometries",
    "attributes",
    "excavatingDepth",
    "attachments",
    "typeOfWork",
    "regions",
    "name",
    "inquirerCaseName",
    "recipientStatus",
    "confirmed",
    "sweref99",
    "rt90",
    "wgs84"
})
public class Case {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Status", required = true)
    protected CaseStatus status;
    @XmlElement(name = "Inquirer")
    protected User inquirer;
    @XmlElement(name = "CreationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "StartDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Purpose")
    protected Purpose purpose;
    @XmlElement(name = "Geometries")
    protected ArrayOfGeometry1 geometries;
    @XmlElement(name = "Attributes")
    protected ArrayOfAttributes attributes;
    @XmlElement(name = "ExcavatingDepth")
    protected String excavatingDepth;
    @XmlElement(name = "Attachments")
    protected ArrayOfString attachments;
    @XmlElement(name = "TypeOfWork")
    protected ArrayOfTypeOfWork typeOfWork;
    @XmlElement(name = "Regions")
    protected ArrayOfString regions;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "InquirerCaseName")
    protected String inquirerCaseName;
    @XmlElement(name = "RecipientStatus", required = true)
    protected CaseRecipientStatus recipientStatus;
    @XmlElement(name = "Confirmed")
    protected boolean confirmed;
    @XmlElement(name = "SWEREF99")
    protected ArrayOfDouble sweref99;
    @XmlElement(name = "RT90")
    protected ArrayOfDouble rt90;
    @XmlElement(name = "WGS84")
    protected ArrayOfDouble wgs84;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CaseStatus }
     *     
     */
    public CaseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseStatus }
     *     
     */
    public void setStatus(CaseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the inquirer property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getInquirer() {
        return inquirer;
    }

    /**
     * Sets the value of the inquirer property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setInquirer(User value) {
        this.inquirer = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose }
     *     
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose }
     *     
     */
    public void setPurpose(Purpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the geometries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeometry1 }
     *     
     */
    public ArrayOfGeometry1 getGeometries() {
        return geometries;
    }

    /**
     * Sets the value of the geometries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeometry1 }
     *     
     */
    public void setGeometries(ArrayOfGeometry1 value) {
        this.geometries = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttributes }
     *     
     */
    public ArrayOfAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttributes }
     *     
     */
    public void setAttributes(ArrayOfAttributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the excavatingDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcavatingDepth() {
        return excavatingDepth;
    }

    /**
     * Sets the value of the excavatingDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcavatingDepth(String value) {
        this.excavatingDepth = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAttachments(ArrayOfString value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the typeOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeOfWork }
     *     
     */
    public ArrayOfTypeOfWork getTypeOfWork() {
        return typeOfWork;
    }

    /**
     * Sets the value of the typeOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeOfWork }
     *     
     */
    public void setTypeOfWork(ArrayOfTypeOfWork value) {
        this.typeOfWork = value;
    }

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRegions(ArrayOfString value) {
        this.regions = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inquirerCaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirerCaseName() {
        return inquirerCaseName;
    }

    /**
     * Sets the value of the inquirerCaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirerCaseName(String value) {
        this.inquirerCaseName = value;
    }

    /**
     * Gets the value of the recipientStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CaseRecipientStatus }
     *     
     */
    public CaseRecipientStatus getRecipientStatus() {
        return recipientStatus;
    }

    /**
     * Sets the value of the recipientStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseRecipientStatus }
     *     
     */
    public void setRecipientStatus(CaseRecipientStatus value) {
        this.recipientStatus = value;
    }

    /**
     * Gets the value of the confirmed property.
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the sweref99 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getSWEREF99() {
        return sweref99;
    }

    /**
     * Sets the value of the sweref99 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setSWEREF99(ArrayOfDouble value) {
        this.sweref99 = value;
    }

    /**
     * Gets the value of the rt90 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getRT90() {
        return rt90;
    }

    /**
     * Sets the value of the rt90 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setRT90(ArrayOfDouble value) {
        this.rt90 = value;
    }

    /**
     * Gets the value of the wgs84 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getWGS84() {
        return wgs84;
    }

    /**
     * Sets the value of the wgs84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setWGS84(ArrayOfDouble value) {
        this.wgs84 = value;
    }

}
