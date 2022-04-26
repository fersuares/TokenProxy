
package com.bancodebogota.customers.token.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.product.v1.ProductInfoType;
import com.bancodebogota.ifx.base.v1.SvcRqType;


/**
 * <p>Clase Java para TokenInfoInqRq_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TokenInfoInqRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRq_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/product/v1/}ProductInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}SafePhone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenInfoInqRq_Type", propOrder = {
    "productInfo",
    "safePhone"
})
public class TokenInfoInqRqType
    extends SvcRqType
{

    @XmlElement(name = "ProductInfo", namespace = "urn://bancodebogota.com/customers/product/v1/")
    protected ProductInfoType productInfo;
    @XmlElement(name = "SafePhone", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String safePhone;

    /**
     * Obtiene el valor de la propiedad productInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfoType }
     *     
     */
    public ProductInfoType getProductInfo() {
        return productInfo;
    }

    /**
     * Define el valor de la propiedad productInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoType }
     *     
     */
    public void setProductInfo(ProductInfoType value) {
        this.productInfo = value;
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

}
