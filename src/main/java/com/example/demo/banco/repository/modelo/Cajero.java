package com.example.demo.banco.repository.modelo;

import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cajero {
	private String nombre;
	private String apellido;
	private BigDecimal salario;
	
	//Set y gets
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Cajero [nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
	}
	
	
	

}
