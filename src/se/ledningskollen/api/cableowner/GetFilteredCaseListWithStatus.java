
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="includeOpen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeClosed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includePreliminary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cableOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquirer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeFetchedCases" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "includeOpen",
    "includeClosed",
    "includePreliminary",
    "cableOwner",
    "inquirer",
    "creationStartDate",
    "creationEndDate",
    "workStartDate",
    "workEndDate",
    "includeFetchedCases"
})
@XmlRootElement(name = "GetFilteredCaseListWithStatus")
public class GetFilteredCaseListWithStatus {

    protected boolean includeOpen;
    protected boolean includeClosed;
    protected boolean includePreliminary;
    protected String cableOwner;
    protected String inquirer;
    protected String creationStartDate;
    protected String creationEndDate;
    protected String workStartDate;
    protected String workEndDate;
    protected boolean includeFetchedCases;

    /**
     * Gets the value of the includeOpen property.
     * 
     */
    public boolean isIncludeOpen() {
        return includeOpen;
    }

    /**
     * Sets the value of the includeOpen property.
     * 
     */
    public void setIncludeOpen(boolean value) {
        this.includeOpen = value;
    }

    /**
     * Gets the value of the includeClosed property.
     * 
     */
    public boolean isIncludeClosed() {
        return includeClosed;
    }

    /**
     * Sets the value of the includeClosed property.
     * 
     */
    public void setIncludeClosed(boolean value) {
        this.includeClosed = value;
    }

    /**
     * Gets the value of the includePreliminary property.
     * 
     */
    public boolean isIncludePreliminary() {
        return includePreliminary;
    }

    /**
     * Sets the value of the includePreliminary property.
     * 
     */
    public void setIncludePreliminary(boolean value) {
        this.includePreliminary = value;
    }

    /**
     * Gets the value of the cableOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableOwner() {
        return cableOwner;
    }

    /**
     * Sets the value of the cableOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableOwner(String value) {
        this.cableOwner = value;
    }

    /**
     * Gets the value of the inquirer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirer() {
        return inquirer;
    }

    /**
     * Sets the value of the inquirer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirer(String value) {
        this.inquirer = value;
    }

    /**
     * Gets the value of the creationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationStartDate() {
        return creationStartDate;
    }

    /**
     * Sets the value of the creationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationStartDate(String value) {
        this.creationStartDate = value;
    }

    /**
     * Gets the value of the creationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationEndDate() {
        return creationEndDate;
    }

    /**
     * Sets the value of the creationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationEndDate(String value) {
        this.creationEndDate = value;
    }

    /**
     * Gets the value of the workStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStartDate() {
        return workStartDate;
    }

    /**
     * Sets the value of the workStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStartDate(String value) {
        this.workStartDate = value;
    }

    /**
     * Gets the value of the workEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEndDate() {
        return workEndDate;
    }

    /**
     * Sets the value of the workEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEndDate(String value) {
        this.workEndDate = value;
    }

    /**
     * Gets the value of the includeFetchedCases property.
     * 
     */
    public boolean isIncludeFetchedCases() {
        return includeFetchedCases;
    }

    /**
     * Sets the value of the includeFetchedCases property.
     * 
     */
    public void setIncludeFetchedCases(boolean value) {
        this.includeFetchedCases = value;
    }

}
