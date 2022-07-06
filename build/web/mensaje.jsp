<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje del aplicativo</title>
    </head>
    <body>
        <h1>Estimado usuario: <%=request.getParameter("userName")%></h1>
        <p>Mensaje: <%=request.getParameter("mensaje")%></p>
        <a href="login.html">Regresar</a>
    </body>
</html>
