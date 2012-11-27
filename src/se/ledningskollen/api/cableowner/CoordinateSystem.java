
package se.ledningskollen.api.cableowner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordinateSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CoordinateSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WGS84"/>
 *     &lt;enumeration value="RT90"/>
 *     &lt;enumeration value="SWEREF99"/>
 *     &lt;enumeration value="SWEREF99_1200"/>
 *     &lt;enumeration value="SWEREF99_1330"/>
 *     &lt;enumeration value="SWEREF99_1500"/>
 *     &lt;enumeration value="SWEREF99_1630"/>
 *     &lt;enumeration value="SWEREF99_1800"/>
 *     &lt;enumeration value="SWEREF99_1415"/>
 *     &lt;enumeration value="SWEREF99_1545"/>
 *     &lt;enumeration value="SWEREF99_1715"/>
 *     &lt;enumeration value="SWEREF99_1845"/>
 *     &lt;enumeration value="SWEREF99_2015"/>
 *     &lt;enumeration value="SWEREF99_2145"/>
 *     &lt;enumeration value="SWEREF99_2315"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CoordinateSystem")
@XmlEnum
public enum CoordinateSystem {

    @XmlEnumValue("WGS84")
    WGS_84("WGS84"),
    @XmlEnumValue("RT90")
    RT_90("RT90"),
    @XmlEnumValue("SWEREF99")
    SWEREF_99("SWEREF99"),
    @XmlEnumValue("SWEREF99_1200")
    SWEREF_99_1200("SWEREF99_1200"),
    @XmlEnumValue("SWEREF99_1330")
    SWEREF_99_1330("SWEREF99_1330"),
    @XmlEnumValue("SWEREF99_1500")
    SWEREF_99_1500("SWEREF99_1500"),
    @XmlEnumValue("SWEREF99_1630")
    SWEREF_99_1630("SWEREF99_1630"),
    @XmlEnumValue("SWEREF99_1800")
    SWEREF_99_1800("SWEREF99_1800"),
    @XmlEnumValue("SWEREF99_1415")
    SWEREF_99_1415("SWEREF99_1415"),
    @XmlEnumValue("SWEREF99_1545")
    SWEREF_99_1545("SWEREF99_1545"),
    @XmlEnumValue("SWEREF99_1715")
    SWEREF_99_1715("SWEREF99_1715"),
    @XmlEnumValue("SWEREF99_1845")
    SWEREF_99_1845("SWEREF99_1845"),
    @XmlEnumValue("SWEREF99_2015")
    SWEREF_99_2015("SWEREF99_2015"),
    @XmlEnumValue("SWEREF99_2145")
    SWEREF_99_2145("SWEREF99_2145"),
    @XmlEnumValue("SWEREF99_2315")
    SWEREF_99_2315("SWEREF99_2315");
    private final String value;

    CoordinateSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CoordinateSystem fromValue(String v) {
        for (CoordinateSystem c: CoordinateSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
