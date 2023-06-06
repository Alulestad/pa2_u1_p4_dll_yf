package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.ImpuestoRepository;
import com.example.demo.banco.repository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements CargaSistemaService {

	@Autowired
	private Impuesto impuesto;

	@Autowired
	private ImpuestoRepository impuestoRepository;

	@Override
	public void cargar() {
		System.out.println("Inicia carga de impuestos");
		BigDecimal valorIva = this.impuestoRepository.seleccionar("IVA"); // se simula que se obtiene de la base de
																			// datos
		this.impuesto.setIva(valorIva);
		
		System.out.println("Fin de carga de impuestos");
	}

}
