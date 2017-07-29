/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pay.remita.service;

import com.google.gson.Gson;
import com.pay.remita.entity.Payment;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Onuche
 */
public class ApiPost {
    
    public static String sendPayment(Payment payment) {
        try {
            Gson gson = new Gson();
            Client client = Client.create();

            WebResource webResource = client
                    .resource(RemitaConfigParams.GATEWAYURL);
            
            String input = gson.toJson(payment);
            
            System.out.println(input);

            ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class, input);
            
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            //Server send jsonp object, but we want json. So we take what we need
            //Starting index is inclusive and Ending index is exclusive
            int length = output.length();
            String jsonString = output.substring(6, length - 1);
            System.out.println(jsonString);
            return jsonString;

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return "{\"error\":\"error\"}";
        }

    }
    
    public static String paymentResponse(String orderId, String hash) {
        try {
            Client client = Client.create();

            WebResource webResource = client
                    .resource(RemitaConfigParams.CHECKSTATUSURL + "/" + RemitaConfigParams.MERCHANTID + "/"
                    + orderId + "/" + hash + "/orderstatus.reg");

            ClientResponse response = webResource.type("application/json")
                    .get(ClientResponse.class);
            
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);
            return output;

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return "{\"error\":\"error\"}";
        }

    }
    
    public static void paymentGateway() {
        try {
            Gson gson = new Gson();
            Client client = Client.create();

            WebResource webResource = client
                    .resource(RemitaConfigParams.GATEWAYURL);

            ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class);
            
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
