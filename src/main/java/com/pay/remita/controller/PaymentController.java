/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.controller;

import com.google.gson.Gson;
import com.pay.remita.entity.TransactionStatus;
import com.pay.remita.service.ApiPost;
import com.pay.remita.service.RemitaConfigParams;
import com.pay.remita.util.Utility;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Onuche
 */
public class PaymentController extends ControllerBase {
    
    public PaymentController(HttpServletRequest request, HttpServletResponse response) {
        super(request, response);
    }
    
    @Override
    protected void doGet() throws ServletException, IOException {
        
        Gson gson = new Gson();
        
        String rrr = request.getParameter("RRR");
        String orderId = request.getParameter("orderID");
        
        String result = ApiPost.paymentResponse(orderId, Utility.hash(orderId + RemitaConfigParams.APIKEY + RemitaConfigParams.MERCHANTID));
        
        // Get payment status
        TransactionStatus status = gson.fromJson(result, TransactionStatus.class);
        
        request.setAttribute("remitaFinalResponse", status);
        
        request.getRequestDispatcher("receipt.jsp")
                    .forward(request, response);
    }

    @Override
    protected void doPost() throws ServletException, IOException {
        
    }
    
}
