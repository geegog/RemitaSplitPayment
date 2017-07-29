/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.entity;

/**
 *
 * @author root
 */
public class Account {
    
    private String lineItemsId;
    private String beneficiaryName;
    private String beneficiaryAccount;
    private String bankCode;
    private String beneficiaryAmount;
    private String deductFeeFrom;

    /**
     * @return the lineItemsId
     */
    public String getLineItemsId() {
        return lineItemsId;
    }

    /**
     * @param lineItemsId the lineItemsId to set
     */
    public void setLineItemsId(String lineItemsId) {
        this.lineItemsId = lineItemsId;
    }

    /**
     * @return the beneficiaryName
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * @param beneficiaryName the beneficiaryName to set
     */
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    /**
     * @return the beneficiaryAccount
     */
    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    /**
     * @param beneficiaryAccount the beneficiaryAccount to set
     */
    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    /**
     * @return the bankCode
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * @param bankCode the bankCode to set
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * @return the beneficiaryAmount
     */
    public String getBeneficiaryAmount() {
        return beneficiaryAmount;
    }

    /**
     * @param beneficiaryAmount the beneficiaryAmount to set
     */
    public void setBeneficiaryAmount(String beneficiaryAmount) {
        this.beneficiaryAmount = beneficiaryAmount;
    }

    /**
     * @return the deductFeeFrom
     */
    public String getDeductFeeFrom() {
        return deductFeeFrom;
    }

    /**
     * @param deductFeeFrom the deductFeeFrom to set
     */
    public void setDeductFeeFrom(String deductFeeFrom) {
        this.deductFeeFrom = deductFeeFrom;
    }
    
}
