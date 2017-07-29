/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.entity;

import java.util.List;

/**
 *
 * @author root
 */
public class Payment {
    
    private String merchantId;
    private String serviceTypeId;
    private String totalAmount;
    private String hash;
    private String orderId;
    private String responseurl;
    private String payerName;
    private String payerEmail;
    private String payerPhone;
    private List<Account> lineItems;

    /**
     * @return the merchantId
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * @param merchantId the merchantId to set
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * @return the serviceTypeId
     */
    public String getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * @param serviceTypeId the serviceTypeId to set
     */
    public void setServiceTypeId(String serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * @return the totalAmount
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * @param hash the hash to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * @return the payerName
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * @param payerName the payerName to set
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    /**
     * @return the payerEmail
     */
    public String getPayerEmail() {
        return payerEmail;
    }

    /**
     * @param payerEmail the payerEmail to set
     */
    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    /**
     * @return the payerPhone
     */
    public String getPayerPhone() {
        return payerPhone;
    }

    /**
     * @param payerPhone the payerPhone to set
     */
    public void setPayerPhone(String payerPhone) {
        this.payerPhone = payerPhone;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the responseurl
     */
    public String getResponseurl() {
        return responseurl;
    }

    /**
     * @param responseurl the responseurl to set
     */
    public void setResponseurl(String responseurl) {
        this.responseurl = responseurl;
    }

    /**
     * @return the lineItems
     */
    public List<Account> getLineItems() {
        return lineItems;
    }

    /**
     * @param lineItems the lineItems to set
     */
    public void setLineItems(List<Account> lineItems) {
        this.lineItems = lineItems;
    }
    
}
