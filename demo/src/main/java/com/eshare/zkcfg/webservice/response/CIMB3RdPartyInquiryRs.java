//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.13 at 12:42:00 PM CST 
//


package com.eshare.zkcfg.webservice.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIMB3rdParty_InquiryRs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMB3rdParty_InquiryRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}InquiryRs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMB3rdParty_InquiryRs", propOrder = {
    "inquiryRs"
})
public class CIMB3RdPartyInquiryRs {

    @XmlElement(name = "InquiryRs")
    protected InquiryRs inquiryRs;

    /**
     * Gets the value of the inquiryRs property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryRs }
     *     
     */
    public InquiryRs getInquiryRs() {
        return inquiryRs;
    }

    /**
     * Sets the value of the inquiryRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryRs }
     *     
     */
    public void setInquiryRs(InquiryRs value) {
        this.inquiryRs = value;
    }

}