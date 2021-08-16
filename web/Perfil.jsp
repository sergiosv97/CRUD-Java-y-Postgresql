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
            <h2>Mantener datos</h2>
        </div>

        <form class="w3-container" action="/programacion3/PerfilCTR" method="post">
            <p>
                <label>ID</label>
                <input class="w3-input" type="text" name= "id_perfil" value="" placeholder="Ingrese Id" required></p>


            <p>
                <input class="w3-input" type="text" name="des_perfil" value=""  placeholder="Ingrese descripcion">
                <label>Descricpcion</label></p>

            <p>
                <input class="w3-input" type="text" name="com_perfil" value="" placeholder=" Ingrese comentario">
                <label>Comentario</label></p>
            <button class="w3-button w3-animate-bottom" name="agregar" type="submit" >AGREGAR  </button>
            <button class="w3-button w3-animate-bottom"  name="modificar" type="submit" >MODIFICAR  </button>
            <button class="w3-button w3-animate-bottom"  name="eliminar" type="submit" >ELIMINAR  </button>
            
            <button class="w3-animate-bottom" type ="reset" > CANCELAR </button>
            <input type="button" onclick="msj_aviso()" value="Ver Aviso"> 

        </form>
        <script type="text/javascript">
            <%  %> 
        </script>
        
        
        
        <table class = w3-table>
            <thead>
                <tr>
                    <th> id </th>
                    <th> Descripcion </th>
                    <th> <img src="recurso/imagen/iconfinder_reload-refresh-repeat-arrow_2937372.png">  </tr>
               
            </thead>
            <tbody>
                <tr>
                    <td> 1 </td>
                    <td> Dato </td>
                    <td> <img src="recurso/imagen/iconfinder_reload-refresh-repeat-arrow_2937372.png">
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>

