/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.controller;

import com.google.gson.Gson;
import com.pay.remita.entity.Account;
import com.pay.remita.entity.Payment;
import com.pay.remita.entity.RemitaResponse;
import com.pay.remita.service.ApiPost;
import com.pay.remita.service.RemitaConfigParams;
import com.pay.remita.util.Utility;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Onuche
 */
public class RemitaResponsePaymentController extends ControllerBase {

    public RemitaResponsePaymentController(HttpServletRequest request, HttpServletResponse response) {
        super(request, response);
    }

    public Payment payment() {

        Payment payment = new Payment();
        Account accountFirst = new Account();
        Account accountSecond = new Account();
        Account accountThird = new Account();
        List<Account> accounts = new ArrayList<>();
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyMMddHHmmss");
        String stringDate = f.format(date);

        String orderId = Utility.uniqueID(stringDate).toUpperCase();

        //Value hard coded here
        String amount = "100000";
        
        String value = RemitaConfigParams.MERCHANTID + RemitaConfigParams.SERVICETYPEID 
                + orderId + amount + RemitaConfigParams.RESPONSEURL + RemitaConfigParams.APIKEY;

        accountFirst.setLineItemsId("itemid1" + stringDate);
        accountFirst.setBeneficiaryName("Micheal Jackson");
        accountFirst.setBeneficiaryAccount("6020067886");
        accountFirst.setBeneficiaryAmount("40000");
        accountFirst.setBankCode("011");
        accountFirst.setDeductFeeFrom("1");
        accounts.add(accountFirst);

        accountSecond.setLineItemsId("34444" + stringDate);
        accountSecond.setBeneficiaryName("Joseph Jackson");
        accountSecond.setBeneficiaryAccount("0360883515");
        accountSecond.setBeneficiaryAmount("30000");
        accountSecond.setBankCode("050");
        accountSecond.setDeductFeeFrom("0");
        accounts.add(accountSecond);

        accountThird.setLineItemsId("8694" + stringDate);
        accountThird.setBeneficiaryName("Samuel Jackson");
        accountThird.setBeneficiaryAccount("4017904612");
        accountThird.setBeneficiaryAmount("30000");
        accountThird.setBankCode("070");
        accountThird.setDeductFeeFrom("0");
        accounts.add(accountThird);

        // Values from user request
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        payment.setMerchantId(RemitaConfigParams.MERCHANTID);
        payment.setServiceTypeId(RemitaConfigParams.SERVICETYPEID);
        payment.setPayerEmail(email);
        payment.setPayerName(name);
        payment.setPayerPhone(phone);
        payment.setTotalAmount(amount);
        payment.setOrderId(orderId);
        payment.setResponseurl(RemitaConfigParams.RESPONSEURL);
        payment.setHash(Utility.hash(value));
        payment.setLineItems(accounts);

        return payment;
    }

    @Override
    protected void doGet() throws ServletException, IOException {
    }

    @Override
    protected void doPost() throws ServletException, IOException {
        
        Gson gson = new Gson();
        Payment payment = payment();
        
        // Send payment information
        String remitaResponse = ApiPost.sendPayment(payment);

        // Get payment response
        RemitaResponse rr = gson.fromJson(remitaResponse, RemitaResponse.class);
        
        request.setAttribute("remitaResponse", rr);
        request.setAttribute("responseurl", RemitaConfigParams.RESPONSEURL);
        request.setAttribute("paymenturl", RemitaConfigParams.GATEWAYRRRPAYMENTURL);
        request.setAttribute("merchantId", RemitaConfigParams.MERCHANTID);
        request.setAttribute("newhash", Utility.hash(RemitaConfigParams.MERCHANTID + rr.getRRR() + RemitaConfigParams.APIKEY));
        
        request.getRequestDispatcher("payment.jsp")
                    .forward(request, response);

    }

}
