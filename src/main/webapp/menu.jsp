<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestión de Operaciones</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        #h1{
            font-weight: bold;
            font-family: Nakula;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-md-center">
        <div class="col-md-auto">

            <h1 id="h1">Gestión de Operaciones</h1>
            <div class="list-group">
                <a href="listado-operaciones" class="list-group-item list-group-item-action">
                    Listado de Operaciones Implementadas
                </a>
                <a href="formOperacion.jsp" class="list-group-item list-group-item-action">
                    Realizar cálculos...
                </a>
            </div>

        </div>
    </div>
</div>
</body>
</html>