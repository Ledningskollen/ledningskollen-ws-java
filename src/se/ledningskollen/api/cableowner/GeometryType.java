
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeometryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLYGON"/>
 *     &lt;enumeration value="LINESTRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeometryType")
@XmlEnum
public enum GeometryType {

    POLYGON,
    LINESTRING;

    public String value() {
        return name();
    }

    public static GeometryType fromValue(String v) {
        return valueOf(v);
    }

}
