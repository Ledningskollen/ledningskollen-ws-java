
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PHONE"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="POSTAL"/>
 *     &lt;enumeration value="FAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddressType")
@XmlEnum
public enum AddressType {

    PHONE,
    EMAIL,
    POSTAL,
    FAX;

    public String value() {
        return name();
    }

    public static AddressType fromValue(String v) {
        return valueOf(v);
    }

}
