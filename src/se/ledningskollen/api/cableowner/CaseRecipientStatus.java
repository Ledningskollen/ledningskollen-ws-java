
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseRecipientStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseRecipientStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="REQUIRES_MANUAL_REVIEW"/>
 *     &lt;enumeration value="UNDER_REVIEW"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseRecipientStatus")
@XmlEnum
public enum CaseRecipientStatus {

    NEW,
    REQUIRES_MANUAL_REVIEW,
    UNDER_REVIEW,
    CONFIRMED,
    CANCELED;

    public String value() {
        return name();
    }

    public static CaseRecipientStatus fromValue(String v) {
        return valueOf(v);
    }

}
