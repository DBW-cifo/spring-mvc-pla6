package com.trifulcas.pla6;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;

public class Alumno {

	@NotNull
	@Size(min = 3,message = "Debe introducir el nombre del alumno") 
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	@Pattern(regexp="[0-9]{8}[A-Z]{1}",message="DNI incorrecto")
	private String dni;
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	private String asignatura;
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	private Map<String,String> listaAsignaturas;
	public Map<String, String> getListaAsignaturas() {
	    return listaAsignaturas;
	}
	
	@Email(message = "Email ha de ser válido")
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@NotNull(message = "No puede ser nulo")
	@Pattern(regexp=("[SNsn]{1}" ),message="Indique si el alumno es o no becario. Debe introducir S o N")
	private String becado;
	public String getBecado() {
		return becado;
	}
	public void setBecado(String becado) {
		this.becado = becado;
	}
	    
	public Alumno() {
		super();
    	listaAsignaturas=new LinkedHashMap<String,String>();
    	listaAsignaturas.put("PHP","PHP");
    	listaAsignaturas.put("JAVA","JAVA"); 
    	listaAsignaturas.put("JS","JS");
    	listaAsignaturas.put(".NET",".NET");
	}
}