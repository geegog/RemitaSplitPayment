/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.service;

/**
 *
 * @author Onuche
 */
public abstract class RemitaConfigParams {

    public static final String MERCHANTID = "2547916";
    public static final String SERVICETYPEID = "4430731";
    public static final String APIKEY = "1946";
    public static final String GATEWAYURL = "http://www.remitademo.net/remita/ecomm/split/init.reg";
    public static final String GATEWAYRRRPAYMENTURL = "http://www.remitademo.net/remita/ecomm/finalize.reg";
    public static final String CHECKSTATUSURL = "http://www.remitademo.net/remita/ecomm";
    public static final String RESPONSEURL = "http://localhost:8080/RemitaSplitPayment/result";

}
