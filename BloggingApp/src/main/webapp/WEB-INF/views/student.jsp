<%-- 
    Document   : student
    Created on : Jul 1, 2018, 2:55:42 PM
    Author     : My Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="nav.jsp" %>
        <h1>StudentInfo!</h1>
        <a href="${context}/add-blog">GO to add blog</a>
        <%@include file="footer.jsp" %>
    </body>
</html>