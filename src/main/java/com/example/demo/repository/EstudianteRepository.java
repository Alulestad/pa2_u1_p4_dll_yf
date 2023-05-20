package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepository {

	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public Estudiante buscar(String cedula); // buscamos por un identificador

	public void eliminar(String cedula);// eliminamos por un identificador

}
