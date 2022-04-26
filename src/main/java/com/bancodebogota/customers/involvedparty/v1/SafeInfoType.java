
package com.bancodebogota.customers.involvedparty.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SafeInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SafeInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SafePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SafeEmailAddr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeInfo_Type", propOrder = {
    "safePhone",
    "safeEmailAddr"
})
public class SafeInfoType {

    @XmlElement(name = "SafePhone", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String safePhone;
    @XmlElement(name = "SafeEmailAddr", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String safeEmailAddr;

    /**
     * 
     * 						En este campo se parametriza el celular seguro.
     * 					
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
     * 
     * 						En este campo se parametriza el Email Seguro
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeEmailAddr() {
        return safeEmailAddr;
    }

    /**
     * Define el valor de la propiedad safeEmailAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeEmailAddr(String value) {
        this.safeEmailAddr = value;
    }

}
