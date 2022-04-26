
package com.bancodebogota.customers.product.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.product.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductInfo_QNAME = new QName("urn://bancodebogota.com/customers/product/v1/", "ProductInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.product.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductInfoType }
     * 
     */
    public ProductInfoType createProductInfoType() {
        return new ProductInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/product/v1/", name = "ProductInfo")
    public JAXBElement<ProductInfoType> createProductInfo(ProductInfoType value) {
        return new JAXBElement<ProductInfoType>(_ProductInfo_QNAME, ProductInfoType.class, null, value);
    }

}
