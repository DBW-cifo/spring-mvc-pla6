<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta alumnos</title>
<style>
.ok {
color: blue; </style>
<style>
.error {
color: red; </style> 
</head>
<body>
<form:form action="procesar" modelAttribute="alumno"> 
      Nombre alumno: <form:input path="nombre" cssClass="ok"/>
         <form:errors path="nombre" cssClass="error" />
         <br />    
      DNI: <form:input path="dni" cssClass="ok"/>
         <form:errors path="dni" cssClass="error" /> 
         <br />
      Email: <form:input path="email" cssClass="ok"/>
         <form:errors path="email" cssClass="error" />
         <br />
      Asignatura: <form:select path="asignatura">
         <form:options items="${alumno.listaAsignaturas}" cssClass="ok" />
         </form:select>
         <br />
      Becado: <form:input path="becado" cssClass="ok" />
         <form:errors path="becado" cssClass="error" />
         <br />
      <input type="submit">
</form:form>
</body>
</html>