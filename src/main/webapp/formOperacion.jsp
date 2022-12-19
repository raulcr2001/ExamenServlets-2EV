<%--
  Created by IntelliJ IDEA.
  User: alu10191174
  Date: 19/12/22
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Operaciones a Realizar</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <h1>Operaciones a Realizar.....</h1>
    <br>
    <form action="<%= request.getContextPath()%>/servlet-calculadora" method="post">
        Operaciones
        <select name="list">
            <option selected disabled>Selecciona una operación:</option>
            <option name="sumar" value="sumar">+</option>
            <option name="restar" value="restar">-</option>
            <option name="multiplicar" value="multiplicar">*</option>
            <option name="dividir" value="dividir">/</option>
        </select>
        <br>
        <br>
        Primer número <input type="number" name="num1">
        Segundo número <input type="number" name="num2">
        <br>
        <br>
        <input type="submit" value="Enviar Datos">
        <input type="reset" value="Borrar Datos">
    </form>
    <br>
    <a class='btn btn-primary' href="menu.jsp">Volver al inicio</a>
</body>
</html>
