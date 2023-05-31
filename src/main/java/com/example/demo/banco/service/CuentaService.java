package com.example.demo.banco.service;

import java.util.List;

import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

public interface CuentaService {
	public void crear(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public void borrar(String numero);
	public Cuenta buscarPorNumero(String numero);

	
	
}
