<%-- 
    Document   : index
    Created on : Jul 27, 2017, 5:10:57 AM
    Author     : Onuche
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Split Payment with Remita</title>
    </head>
    <body>
        <h1>Hello Remita!</h1>
        
        <p>Enter your details</p>
        <form action="pay" method="post">
            <input type="text" name="name" placeholder="Name" required="required">
            <input type="text" name="email" placeholder="Email" required="required">
            <input type="text" name="phone" placeholder="Phone" required="required">
            
            <input type="submit" value="Submit">
        </form>
        
    </body>
</html>
