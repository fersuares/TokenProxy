
package com.bancodebogota.customers.token.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.ifx.base.v1.SvcRsType;


/**
 * <p>Clase Java para TokenValInqRs_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TokenValInqRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRs_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AuthCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenValInqRs_Type", propOrder = {
    "authCode"
})
public class TokenValInqRsType
    extends SvcRsType
{

    @XmlElement(name = "AuthCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String authCode;

    /**
     * Obtiene el valor de la propiedad authCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Define el valor de la propiedad authCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

}
