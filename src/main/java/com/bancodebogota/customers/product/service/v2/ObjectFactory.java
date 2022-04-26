
package com.bancodebogota.customers.product.service.v2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancodebogota.customers.product.service.v2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancodebogota.customers.product.service.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTokenInfoRequest }
     * 
     */
    public GetTokenInfoRequest createGetTokenInfoRequest() {
        return new GetTokenInfoRequest();
    }

    /**
     * Create an instance of {@link GetTokenInfoResponse }
     * 
     */
    public GetTokenInfoResponse createGetTokenInfoResponse() {
        return new GetTokenInfoResponse();
    }

    /**
     * Create an instance of {@link GetTokenInfoFault }
     * 
     */
    public GetTokenInfoFault createGetTokenInfoFault() {
        return new GetTokenInfoFault();
    }

    /**
     * Create an instance of {@link SetSendOtpRequest }
     * 
     */
    public SetSendOtpRequest createSetSendOtpRequest() {
        return new SetSendOtpRequest();
    }

    /**
     * Create an instance of {@link SetSendOtpResponse }
     * 
     */
    public SetSendOtpResponse createSetSendOtpResponse() {
        return new SetSendOtpResponse();
    }

    /**
     * Create an instance of {@link SetSendOtpFault }
     * 
     */
    public SetSendOtpFault createSetSendOtpFault() {
        return new SetSendOtpFault();
    }

    /**
     * Create an instance of {@link GetTokenValidationRequest }
     * 
     */
    public GetTokenValidationRequest createGetTokenValidationRequest() {
        return new GetTokenValidationRequest();
    }

    /**
     * Create an instance of {@link GetTokenValidationResponse }
     * 
     */
    public GetTokenValidationResponse createGetTokenValidationResponse() {
        return new GetTokenValidationResponse();
    }

    /**
     * Create an instance of {@link GetTokenValidationFault }
     * 
     */
    public GetTokenValidationFault createGetTokenValidationFault() {
        return new GetTokenValidationFault();
    }

}
