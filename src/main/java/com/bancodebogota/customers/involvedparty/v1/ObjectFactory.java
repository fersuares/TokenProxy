
package com.bancodebogota.customers.involvedparty.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.involvedparty.v1 package. 
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

    private final static QName _SafeInfo_QNAME = new QName("urn://bancodebogota.com/customers/involvedparty/v1/", "SafeInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.involvedparty.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SafeInfoType }
     * 
     */
    public SafeInfoType createSafeInfoType() {
        return new SafeInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SafeInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/involvedparty/v1/", name = "SafeInfo")
    public JAXBElement<SafeInfoType> createSafeInfo(SafeInfoType value) {
        return new JAXBElement<SafeInfoType>(_SafeInfo_QNAME, SafeInfoType.class, null, value);
    }

}
