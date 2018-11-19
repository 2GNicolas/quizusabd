<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>BONO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>

    <body>
        <form action="construcor" method="POST">

            <div>ENCRIPTACION</div>
            <input type= "text"  name ="TEXTO" >
            <input type= "text"  name ="NUMERO" >
            <button type=submit" class="btn btn-default" name="encriptar">Encriptar</button>
            <br>
            <br>
            <input type= "text" id="5">


            <%
                if (request.getAttribute("resultado") != null) {
                    String res = (String) request.getAttribute("resultado");
            %>

            <input type="text" id="sa" value="<%=res%>">

            <script>
                document.getElementById("5").value = "<%=res%>";
            </script>
            <%
            } else {
            %>
            <input type="text" id="sa" value="esperar resultado">
            <%
                }
            %>

        </form>
    </body>
</html>
