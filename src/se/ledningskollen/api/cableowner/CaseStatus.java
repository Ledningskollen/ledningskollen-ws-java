
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRELIMINARY"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="CONFIRMED_BY_INQUIRER"/>
 *     &lt;enumeration value="CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaseStatus")
@XmlEnum
public enum CaseStatus {

    PRELIMINARY,
    OPEN,
    CLOSED,
    CONFIRMED_BY_INQUIRER,
    CANCELED;

    public String value() {
        return name();
    }

    public static CaseStatus fromValue(String v) {
        return valueOf(v);
    }

}
