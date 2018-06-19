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
 * <p>Java class for InquiryRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}TransactionID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}ChannelID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}TerminalID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}TransactionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}CompanyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}CustomerKey1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}CustomerKey2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}CustomerKey3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}AdditionalData1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}AdditionalData2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}AdditionalData3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://CIMB3rdParty/BillPaymentWS}AdditionalData4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryRq", propOrder = {
    "transactionID",
    "channelID",
    "terminalID",
    "transactionDate",
    "companyCode",
    "customerKey1",
    "customerKey2",
    "customerKey3",
    "additionalData1",
    "additionalData2",
    "additionalData3",
    "additionalData4"
})
public class InquiryRq {

    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "ChannelID")
    protected String channelID;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "TransactionDate")
    protected String transactionDate;
    @XmlElement(name = "CompanyCode")
    protected String companyCode;
    @XmlElement(name = "CustomerKey1")
    protected String customerKey1;
    @XmlElement(name = "CustomerKey2")
    protected String customerKey2;
    @XmlElement(name = "CustomerKey3")
    protected String customerKey3;
    @XmlElement(name = "AdditionalData1")
    protected String additionalData1;
    @XmlElement(name = "AdditionalData2")
    protected String additionalData2;
    @XmlElement(name = "AdditionalData3")
    protected String additionalData3;
    @XmlElement(name = "AdditionalData4")
    protected String additionalData4;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the channelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Sets the value of the channelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the customerKey1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey1() {
        return customerKey1;
    }

    /**
     * Sets the value of the customerKey1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey1(String value) {
        this.customerKey1 = value;
    }

    /**
     * Gets the value of the customerKey2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey2() {
        return customerKey2;
    }

    /**
     * Sets the value of the customerKey2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey2(String value) {
        this.customerKey2 = value;
    }

    /**
     * Gets the value of the customerKey3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey3() {
        return customerKey3;
    }

    /**
     * Sets the value of the customerKey3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey3(String value) {
        this.customerKey3 = value;
    }

    /**
     * Gets the value of the additionalData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData1() {
        return additionalData1;
    }

    /**
     * Sets the value of the additionalData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData1(String value) {
        this.additionalData1 = value;
    }

    /**
     * Gets the value of the additionalData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData2() {
        return additionalData2;
    }

    /**
     * Sets the value of the additionalData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData2(String value) {
        this.additionalData2 = value;
    }

    /**
     * Gets the value of the additionalData3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData3() {
        return additionalData3;
    }

    /**
     * Sets the value of the additionalData3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData3(String value) {
        this.additionalData3 = value;
    }

    /**
     * Gets the value of the additionalData4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData4() {
        return additionalData4;
    }

    /**
     * Sets the value of the additionalData4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData4(String value) {
        this.additionalData4 = value;
    }

}
