package com.example.demo.banco.service;

import java.math.BigDecimal;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {

	public void crear(Transferencia transferencia);
	public void actualizar(Transferencia transferencia);
	public void borrar(String numero);
	public Transferencia buscarPorNumero(String numero);
	
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) ;
	
	
}
