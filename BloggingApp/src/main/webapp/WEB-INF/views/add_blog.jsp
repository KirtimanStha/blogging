<%-- 
    Document   : add_blog
    Created on : Jun 20, 2018, 8:21:58 PM
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
     
        <div class="container">
            <div class="alert alert-primary" role="alert">
               <%@include file="nav.jsp" %>
            </div>
            <div class="form">
                <form action="${context}/save">
                    <p>Title: <input type="text" name="title"></p>
                    <p>Caption: <input type="text" name="caption"></p>
                    <p>Description: <input type="text" name="desc"></p>
                    <p><input type="submit" value="Add Blog"></p> 
                </form>
                <div>
        <form action="${context}/save" method="POST">
            <div class="form-group">
                <label for="exampleInputEmail1">Email address</label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
            </div>
            <div class="form-group form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        </div>
        </div>
        <h1>Blog!</h1>
        <%@include file="footer.jsp" %>
    </body>
</html>