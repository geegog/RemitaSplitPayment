<%-- 
    Document   : receipt
    Created on : Jul 29, 2017, 9:11:51 PM
    Author     : Onuche
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Split Payment with Remita - Receipt</title>
    </head>
    <body>
        <h1>Remita Payment Transaction Report</h1>

        <c:choose>
            <c:when test="${remitaFinalResponse.status == '00' || remitaFinalResponse.status == '01'}">
                <h2>Transaction Successful</h2>
                <p><b>Remita Retrieval Reference: ${remitaFinalResponse.RRR}</b></p>
            </c:when>
            <c:when test="${remitaResponse.statuscode == '021'}">
                <h2>RRR Generated Successfully</h2>
                <p><b>Remita Retrieval Reference: </b>${remitaFinalResponse.RRR}</p>
            </c:when>
            <c:otherwise>
                <h2>Your Transaction was not Successful</h2>
                <c:if test="${remitaResponse.RRR != null}">
                    <p>Your Remita Retrieval Reference is <span><b>${remitaFinalResponse.RRR}</b></span></p>>
                </c:if>
                <p><b>Reason: </b>${remitaFinalResponse.message}</p>
            </c:otherwise>
        </c:choose>

    </body>
</html>
