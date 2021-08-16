<%-- 
    Document   : Persona
    Created on : 13-sep-2019, 21:39:16
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
        <div>
            <form action="/programacion3/PersonaCtr" method="post">
                <input type="text" name="ci" placeholder="Ingrese Nro Cédula">
                <input type="text" name="nombre" placeholder="Ingrese Nombre">
                <input type="text" name="apellido" placeholder="Ingrese Apellido">
                <input type="date" name="fecha">
                <input type="submit" value="AGREGAR">
            </form>
        </div>
    </body>
</html>
