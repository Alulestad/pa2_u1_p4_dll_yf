package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.repository.modelo.Estudiante;

@Repository
public class CuentaRepositoryImpl implements CuentaRepository {

	private static List<Cuenta> baseDatos=new ArrayList<>();
	
	@Override
	public void insertar(Cuenta cuenta) {
		baseDatos.add(cuenta);

	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.eliminar(cuenta.getNumero());
		baseDatos.add(cuenta);
	}

	@Override
	public void eliminar(String numero) {

		Cuenta cuenta=this.seleccionarPorNumero(numero);
		baseDatos.remove(cuenta);
	}

	@Override
	public Cuenta seleccionarPorNumero(String numero) {
		Cuenta cuentaEncontrado= new Cuenta();
		for(Cuenta cuenta:baseDatos) {
			if(numero.equals(cuenta.getNumero())) {
				cuentaEncontrado=cuenta;
			}
		}
		
		
		return cuentaEncontrado;

	}

}
