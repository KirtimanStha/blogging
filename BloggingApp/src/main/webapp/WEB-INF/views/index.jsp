<html>
    <head>
        <!--link external as well as internal css-->
        <meta charset="utf-8">
        <title>CKEditor</title>
        <script src="https://cdn.ckeditor.com/ckeditor5/10.1.0/classic/ckeditor.js"></script>
        
        
    </head>
    <body>
        <%@include file="nav.jsp" %>
        
        
       
         <!--javascript should be loaded here-->
        <textarea name="content" id="editor"></textarea>
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