<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Procesar alumno</title>
</head>

<body>
<h1>Alumno</h1>
<p>Nombre: <font color="blue">${alumno.nombre}</font></p>	
<p>DNI   : <font color="blue">${alumno.dni}</font></p>
<p>Email: <font color="blue">${alumno.email}</font></p>
<p>Asignatura: <font color="blue">${alumno.asignatura}</font></p>
<p>Becado: <font color="blue">${alumno.becado}</font></p>
</body>
</html>