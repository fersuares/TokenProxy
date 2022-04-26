
package com.bancodebogota.customers.token.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.RefInfoType;
import com.bancodebogota.ifx.base.v1.SvcRqType;


/**
 * <p>Clase Java para SendOtpAddRq_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SendOtpAddRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRq_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}RefInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SafePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}Phone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOtpAddRq_Type", propOrder = {
    "refInfo",
    "safePhone",
    "phone"
})
public class SendOtpAddRqType
    extends SvcRqType
{

    @XmlElement(name = "RefInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected RefInfoType refInfo;
    @XmlElement(name = "SafePhone", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String safePhone;
    @XmlElement(name = "Phone", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String phone;

    /**
     * Obtiene el valor de la propiedad refInfo.
     * 
     * @return
     *     possible object is
     *     {@link RefInfoType }
     *     
     */
    public RefInfoType getRefInfo() {
        return refInfo;
    }

    /**
     * Define el valor de la propiedad refInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RefInfoType }
     *     
     */
    public void setRefInfo(RefInfoType value) {
        this.refInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad safePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafePhone() {
        return safePhone;
    }

    /**
     * Define el valor de la propiedad safePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafePhone(String value) {
        this.safePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define el valor de la propiedad phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
