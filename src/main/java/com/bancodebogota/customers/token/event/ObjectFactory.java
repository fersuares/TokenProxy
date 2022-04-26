
package com.bancodebogota.customers.token.event;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.token.event package. 
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

    private final static QName _TokenInfoInqRq_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "TokenInfoInqRq");
    private final static QName _TokenInfoInqRs_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "TokenInfoInqRs");
    private final static QName _SendOtpAddRq_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "SendOtpAddRq");
    private final static QName _SendOtpAddRs_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "SendOtpAddRs");
    private final static QName _TokenValInqRq_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "TokenValInqRq");
    private final static QName _TokenValInqRs_QNAME = new QName("urn://bancodebogota.com/customers/token/event/", "TokenValInqRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.token.event
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TokenInfoInqRqType }
     * 
     */
    public TokenInfoInqRqType createTokenInfoInqRqType() {
        return new TokenInfoInqRqType();
    }

    /**
     * Create an instance of {@link TokenInfoInqRsType }
     * 
     */
    public TokenInfoInqRsType createTokenInfoInqRsType() {
        return new TokenInfoInqRsType();
    }

    /**
     * Create an instance of {@link SendOtpAddRqType }
     * 
     */
    public SendOtpAddRqType createSendOtpAddRqType() {
        return new SendOtpAddRqType();
    }

    /**
     * Create an instance of {@link SendOtpAddRsType }
     * 
     */
    public SendOtpAddRsType createSendOtpAddRsType() {
        return new SendOtpAddRsType();
    }

    /**
     * Create an instance of {@link TokenValInqRqType }
     * 
     */
    public TokenValInqRqType createTokenValInqRqType() {
        return new TokenValInqRqType();
    }

    /**
     * Create an instance of {@link TokenValInqRsType }
     * 
     */
    public TokenValInqRsType createTokenValInqRsType() {
        return new TokenValInqRsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenInfoInqRqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenInfoInqRqType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "TokenInfoInqRq")
    public JAXBElement<TokenInfoInqRqType> createTokenInfoInqRq(TokenInfoInqRqType value) {
        return new JAXBElement<TokenInfoInqRqType>(_TokenInfoInqRq_QNAME, TokenInfoInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenInfoInqRsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenInfoInqRsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "TokenInfoInqRs")
    public JAXBElement<TokenInfoInqRsType> createTokenInfoInqRs(TokenInfoInqRsType value) {
        return new JAXBElement<TokenInfoInqRsType>(_TokenInfoInqRs_QNAME, TokenInfoInqRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOtpAddRqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendOtpAddRqType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "SendOtpAddRq")
    public JAXBElement<SendOtpAddRqType> createSendOtpAddRq(SendOtpAddRqType value) {
        return new JAXBElement<SendOtpAddRqType>(_SendOtpAddRq_QNAME, SendOtpAddRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendOtpAddRsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendOtpAddRsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "SendOtpAddRs")
    public JAXBElement<SendOtpAddRsType> createSendOtpAddRs(SendOtpAddRsType value) {
        return new JAXBElement<SendOtpAddRsType>(_SendOtpAddRs_QNAME, SendOtpAddRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenValInqRqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenValInqRqType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "TokenValInqRq")
    public JAXBElement<TokenValInqRqType> createTokenValInqRq(TokenValInqRqType value) {
        return new JAXBElement<TokenValInqRqType>(_TokenValInqRq_QNAME, TokenValInqRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenValInqRsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TokenValInqRsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn://bancodebogota.com/customers/token/event/", name = "TokenValInqRs")
    public JAXBElement<TokenValInqRsType> createTokenValInqRs(TokenValInqRsType value) {
        return new JAXBElement<TokenValInqRsType>(_TokenValInqRs_QNAME, TokenValInqRsType.class, null, value);
    }

}
