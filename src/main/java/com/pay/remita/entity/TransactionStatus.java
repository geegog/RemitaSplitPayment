/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.entity;

/**
 *
 * @author Onuche
 */
public class TransactionStatus {
    
    private String statusmessage;
    private String merchantId;
    private String status;
    private String RRR;
    private String transactiontime;
    private String orderId;

    /**
     * @return the statusmessage
     */
    public String getStatusmessage() {
        return statusmessage;
    }

    /**
     * @param statusmessage the statusmessage to set
     */
    public void setStatusmessage(String statusmessage) {
        this.statusmessage = statusmessage;
    }

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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the RRR
     */
    public String getRRR() {
        return RRR;
    }

    /**
     * @param RRR the RRR to set
     */
    public void setRRR(String RRR) {
        this.RRR = RRR;
    }

    /**
     * @return the transactiontime
     */
    public String getTransactiontime() {
        return transactiontime;
    }

    /**
     * @param transactiontime the transactiontime to set
     */
    public void setTransactiontime(String transactiontime) {
        this.transactiontime = transactiontime;
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
    
}
