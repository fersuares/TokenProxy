
package com.bancodebogota.customers.token.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bancodebogota.customers.product.v1.ProductInfoType;
import com.bancodebogota.ifx.base.v1.ContactInfoType;
import com.bancodebogota.ifx.base.v1.SvcRsType;


/**
 * <p>Clase Java para TokenInfoInqRs_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TokenInfoInqRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn://bancodebogota.com/ifx/base/v1/}SvcRs_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}MaxRec" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}NumRec" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/customers/product/v1/}ProductInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ContactInfo" minOccurs="0"/&gt;
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
@XmlType(name = "TokenInfoInqRs_Type", propOrder = {
    "maxRec",
    "numRec",
    "productInfo",
    "contactInfo",
    "safePhone"
})
public class TokenInfoInqRsType
    extends SvcRsType
{

    @XmlElement(name = "MaxRec", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected Long maxRec;
    @XmlElement(name = "NumRec", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected Long numRec;
    @XmlElement(name = "ProductInfo", namespace = "urn://bancodebogota.com/customers/product/v1/")
    protected List<ProductInfoType> productInfo;
    @XmlElement(name = "ContactInfo", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "SafePhone", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String safePhone;

    /**
     * Obtiene el valor de la propiedad maxRec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRec() {
        return maxRec;
    }

    /**
     * Define el valor de la propiedad maxRec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRec(Long value) {
        this.maxRec = value;
    }

    /**
     * Obtiene el valor de la propiedad numRec.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumRec() {
        return numRec;
    }

    /**
     * Define el valor de la propiedad numRec.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumRec(Long value) {
        this.numRec = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInfoType }
     * 
     * 
     */
    public List<ProductInfoType> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<ProductInfoType>();
        }
        return this.productInfo;
    }

    /**
     * Obtiene el valor de la propiedad contactInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Define el valor de la propiedad contactInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
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
