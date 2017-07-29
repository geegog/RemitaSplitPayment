/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class ControllerBase {
    
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    
    public ControllerBase(HttpServletRequest request,
            HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    
    protected void doGet()
            throws ServletException, IOException {
        response.getWriter()
                .print("The doGet method must be overridden" +
                " in the class that extends HelperBase.");
    }

    protected void doPost()
            throws ServletException, IOException {
        response.getWriter()
                .print("The doPost method must be overridden" +
                " in the class that extends HelperBase.");
    }
    
}
