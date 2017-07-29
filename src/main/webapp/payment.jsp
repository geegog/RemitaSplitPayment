<%-- 
    Document   : payment
    Created on : Jul 28, 2017, 8:56:42 AM
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
        <title>Split Payment with Remita</title>
    </head>
    <body>
        <h1>Remita Payment</h1>

        <c:choose>
            <c:when test="${remitaResponse.statuscode == '025'}">
                <form action="${paymenturl}" method="POST">
                    <input id="merchantId" name="merchantId" value="${merchantId}" type="hidden"/>
                    <input id="rrr" name="rrr" value="${remitaResponse.RRR}" type="hidden"/>
                    <input id="responseurl" name="responseurl" value="${responseurl}" type="hidden"/>
                    <input id="hash" name="hash" value="${newhash}" type="hidden"/>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">Payment Type</label>
                        <div class="col-sm-8">
                            <select name="paymenttype" class="form-control">
                                <option value=""> -- Select --</option>
                                <option value="REMITA_PAY"> Remita Account Transfer</option>
                                <option value="Interswitch"> Verve Card</option>
                                <option value="UPL"> Visa</option>
                                <option value="UPL"> MasterCard</option>
                                <option value="PocketMoni"> PocketMoni</option>
                                <option value="RRRGEN"> POS</option>
                                <option value="ATM"> ATM</option>
                                <option value="BANK_BRANCH">BANK BRANCH</option>
                                <option value="BANK_INTERNET">BANK INTERNET</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-8 col-sm-offset-4">
                            <input type="submit" class="btn btn-sm btn-primary" name="submit" value="Submit" />
                        </div>
                    </div>
                </form>
            </c:when>
            <c:when test="remitaResponse.statuscode == '022'">
                <p>Invalid Request!</p>
            </c:when>
            <c:otherwise>
                <p>Something bad went wrong. Try checking your connection or contact the producers!</p>
            </c:otherwise>
        </c:choose>

    </body>
</html>
