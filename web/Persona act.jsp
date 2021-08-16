<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="recurso/css/w3.css">
        <script src="recurso/jss/swal.js">  </script>
        
        <script type="text/javascript">
            function msj_aviso(){
                //swal("Hello world!");
                swal("Good job!", "You clicked the button!", "success");
            }
        </script>
        
    </head>
    <body>

        <div class="w3-container w3-pink">
            <h2>Mantener Persona</h2>
        </div>

        <form class="w3-container" action="/programacion3/PersonaCTR" method="post">
            <p>
                <label>ID</label>
                <input class="w3-input" type="text" name="id_persona" value="" placeholder="Ingrese Id" required></p>


            <p>
                 <label>Nro.documento</label>
                <input class="w3-input" type="text" name="nro_doc_persona" value=""  placeholder="Ingrese Nro Documento"></p>
               

            <p>
                <label>Nombres</label>
                <input class="w3-input" type="text" name="nomb_persona" value="" placeholder=" Ingrese Nombre"></p>
                
              <p>
                <label>Apellidos</label>
                <input class="w3-input" type="text" name="ape_persona" value="" placeholder=" Ingrese Apellido"></p>
                
            <button class="w3-button w3-animate-bottom" name="agregar" type="submit" >AGREGAR  </button>
            <button class="w3-button w3-animate-bottom"  name="modificar" type="submit" >MODIFICAR  </button>
            <button class="w3-button w3-animate-bottom"  name="eliminar" type="submit" >ELIMINAR  </button>
            
            <button class="w3-button w3-animate-bottom" type ="reset" > CANCELAR </button>
             

        </form>
        <script type="text/javascript">
            <%=request.getAttribute("msj")%> 
        </script>
        
    </body>
</html>

