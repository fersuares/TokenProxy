
package com.bancodebogota.customers.product.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.token.event.TokenValInqRqType;


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
 *         &lt;element ref="{urn://bancodebogota.com/customers/token/event/}TokenValInqRq"/&gt;
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
    "tokenValInqRq"
})
@XmlRootElement(name = "getTokenValidationRequest")
public class GetTokenValidationRequest {

    @XmlElement(name = "TokenValInqRq", namespace = "urn://bancodebogota.com/customers/token/event/", required = true)
    protected TokenValInqRqType tokenValInqRq;

    /**
     * Obtiene el valor de la propiedad tokenValInqRq.
     * 
     * @return
     *     possible object is
     *     {@link TokenValInqRqType }
     *     
     */
    public TokenValInqRqType getTokenValInqRq() {
        return tokenValInqRq;
    }

    /**
     * Define el valor de la propiedad tokenValInqRq.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenValInqRqType }
     *     
     */
    public void setTokenValInqRq(TokenValInqRqType value) {
        this.tokenValInqRq = value;
    }

}
