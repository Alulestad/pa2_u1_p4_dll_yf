package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("nacional")
public class MontoDebitarNacionalServiceImpl implements MontoDebitarService {

	@Override
	public BigDecimal calcular(BigDecimal monto) {

		//Enviar el email
		//Guardar en la base una pista de auditoria
		
		
		return monto;
	}

}
