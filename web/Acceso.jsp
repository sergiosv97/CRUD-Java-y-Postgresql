<%-- 
    Document   : Acceso
    Created on : 06-sep-2019, 20:25:51
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/html/AccesoCTR" method="post">
            <input type="text " name="usuario">
            <input type="password" name="clave">
            <input type="submit" value="ENVIAR">
        </form>
    </body>
</html>
