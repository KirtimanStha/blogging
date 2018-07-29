<%-- 
    Document   : list_blog
    Created on : Jun 20, 2018, 8:22:42 PM
    Author     : My Computer
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>CKEditor</title>
        <script src="https://cdn.ckeditor.com/ckeditor5/10.1.0/classic/ckeditor.js"></script>
    </head>
    <body>
        <%@include file="nav.jsp" %>
        <textarea name="content" id="editor">This is some sample content.</textarea>
        <script>
                        ClassicEditor
                                .create( document.querySelector( '#editor' ) )
                                .then( editor => {
                                        console.log( editor );
                                } )
                                .catch( error => {
                                        console.error( error );
                                } );
         </script>
        <%@include file="footer.jsp" %>
    </body>
</html>