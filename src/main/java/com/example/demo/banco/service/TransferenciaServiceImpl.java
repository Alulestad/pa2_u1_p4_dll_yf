package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{
	@Autowired
	private TransferenciaRepository transferenciaRepository;
	

	@Override
	public void crear(Transferencia transferencia) {
		this.transferenciaRepository.insertar(transferencia);
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.transferenciaRepository.actualizar(transferencia);
		
	}

	@Override
	public void borrar(String numero) {
		this.transferenciaRepository.eliminar(numero);
		
	}

	@Override
	public Transferencia buscarPorNumero(String numero) {
		return this.transferenciaRepository.seleccionarPorNumero(numero);
	}
	

}
