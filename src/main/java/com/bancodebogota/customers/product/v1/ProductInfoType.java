
package com.bancodebogota.customers.product.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProductInfo_Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProductInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}ProductNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctDomain" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}AcctCur" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn://bancodebogota.com/ifx/base/v1/}OTP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInfo_Type", propOrder = {
    "productId",
    "productCode",
    "productNum",
    "acctType",
    "acctSubType",
    "acctName",
    "acctDomain",
    "acctCur",
    "statusCode",
    "otp"
})
public class ProductInfoType {

    @XmlElement(name = "ProductId", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String productId;
    @XmlElement(name = "ProductCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String productCode;
    @XmlElement(name = "ProductNum", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String productNum;
    @XmlElement(name = "AcctType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctType;
    @XmlElement(name = "AcctSubType", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctSubType;
    @XmlElement(name = "AcctName", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctName;
    @XmlElement(name = "AcctDomain", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctDomain;
    @XmlElement(name = "AcctCur", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String acctCur;
    @XmlElement(name = "StatusCode", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String statusCode;
    @XmlElement(name = "OTP", namespace = "urn://bancodebogota.com/ifx/base/v1/")
    protected String otp;

    /**
     * Obtiene el valor de la propiedad productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define el valor de la propiedad productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtiene el valor de la propiedad productCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Define el valor de la propiedad productCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Obtiene el valor de la propiedad productNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * Define el valor de la propiedad productNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNum(String value) {
        this.productNum = value;
    }

    /**
     * Obtiene el valor de la propiedad acctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Define el valor de la propiedad acctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSubType() {
        return acctSubType;
    }

    /**
     * Define el valor de la propiedad acctSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSubType(String value) {
        this.acctSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Define el valor de la propiedad acctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Obtiene el valor de la propiedad acctDomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDomain() {
        return acctDomain;
    }

    /**
     * Define el valor de la propiedad acctDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDomain(String value) {
        this.acctDomain = value;
    }

    /**
     * Obtiene el valor de la propiedad acctCur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCur() {
        return acctCur;
    }

    /**
     * Define el valor de la propiedad acctCur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCur(String value) {
        this.acctCur = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad otp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP() {
        return otp;
    }

    /**
     * Define el valor de la propiedad otp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP(String value) {
        this.otp = value;
    }

}
