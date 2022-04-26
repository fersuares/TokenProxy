
package com.bancodebogota.customers.product.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.token.event.TokenValInqRsType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/token/event/}TokenValInqRs"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenValInqRs"
})
@XmlRootElement(name = "getTokenValidationResponse")
public class GetTokenValidationResponse {

    @XmlElement(name = "TokenValInqRs", namespace = "urn://bancodebogota.com/customers/token/event/", required = true)
    protected TokenValInqRsType tokenValInqRs;

    /**
     * Obtiene el valor de la propiedad tokenValInqRs.
     * 
     * @return
     *     possible object is
     *     {@link TokenValInqRsType }
     *     
     */
    public TokenValInqRsType getTokenValInqRs() {
        return tokenValInqRs;
    }

    /**
     * Define el valor de la propiedad tokenValInqRs.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenValInqRsType }
     *     
     */
    public void setTokenValInqRs(TokenValInqRsType value) {
        this.tokenValInqRs = value;
    }

}
