<%-- 
    Document   : Pregunta
    Created on : 20/05/2017, 02:51:54 PM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chan Kong</title>
    </head>
    <body>
        <jsp:useBean id="usuario" type="classes.Usuario" scope="request" />
        <h1><%=usuario.getNombreUsuario()%></h1>
    </body>
</html>
