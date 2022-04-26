
package com.bancodebogota.customers.product.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.token.event.SendOtpAddRqType;


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
 *         &lt;element ref="{urn://bancodebogota.com/customers/token/event/}SendOtpAddRq"/&gt;
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
    "sendOtpAddRq"
})
@XmlRootElement(name = "setSendOtpRequest")
public class SetSendOtpRequest {

    @XmlElement(name = "SendOtpAddRq", namespace = "urn://bancodebogota.com/customers/token/event/", required = true)
    protected SendOtpAddRqType sendOtpAddRq;

    /**
     * Obtiene el valor de la propiedad sendOtpAddRq.
     * 
     * @return
     *     possible object is
     *     {@link SendOtpAddRqType }
     *     
     */
    public SendOtpAddRqType getSendOtpAddRq() {
        return sendOtpAddRq;
    }

    /**
     * Define el valor de la propiedad sendOtpAddRq.
     * 
     * @param value
     *     allowed object is
     *     {@link SendOtpAddRqType }
     *     
     */
    public void setSendOtpAddRq(SendOtpAddRqType value) {
        this.sendOtpAddRq = value;
    }

}
