package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService{
	@Autowired
	private TransferenciaRepository transferenciaRepository;
	

	
	@Autowired
	private CuentaRepository cuentaRepository;
	

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

	@Override
	public void realizar(String numeroCuentaOrigen, String numeroCuentaDestino, BigDecimal monto) {
		//1.- Consultar la cuenta de origen por el numero de cuenta
		
		Cuenta cuentaOrigen=this.cuentaRepository.seleccionarPorNumero(numeroCuentaOrigen);
		
		//2.- Consultar el saldo de la cuenta origen
				
		BigDecimal saldoOrigen=cuentaOrigen.getSaldo();	
		
		//3.- validar si el saldo es suficiente
		
		if(monto.compareTo(saldoOrigen)<=0) {
			//5.- Si si es suficiente ir al paso 6
			//6.- Realizamos la resta del salgo origen - monto
			
			BigDecimal nuevoSaldoOrigen=saldoOrigen.subtract(monto);
			
			//7.- Actualizamos el nuevo saldo de la cuenta origen
			
			cuentaOrigen.setSaldo(nuevoSaldoOrigen);
			this.cuentaRepository.actualizar(cuentaOrigen);
			
			
			//8.- Consultamos la cuenta de destino por el numero
			
			
			Cuenta cuentaDestino=this.cuentaRepository.seleccionarPorNumero(numeroCuentaDestino);
			
			
			//9.- Consultamos el saldo de la cuenta destino
			BigDecimal saldoDestino=cuentaDestino.getSaldo();	
			
			//10.- Realizamos la suma del saldo destino + monto
			BigDecimal nuevoSaldoDestino= saldoDestino.add(monto);
			
			//11.- Actualizamos el nuevo saldo de la cuenta destino
			cuentaDestino.setSaldo(nuevoSaldoDestino);
			this.cuentaRepository.actualizar(cuentaDestino);
			
			//12.- Creamos la transferencia
			Transferencia transferencia=new Transferencia();
			transferencia.setCuentaDestino(cuentaDestino);
			transferencia.setCuentaOrigen(cuentaOrigen);
			transferencia.setMonto(monto);
			Double numero=(Math.random()*1000);
			
			transferencia.setNumero(numero.toString());
			transferencia.setFecha(LocalDateTime.now());
			
			this.transferenciaRepository.insertar(transferencia);
			
			
			
		}else {
			//4.- Si no es suficiente imprimir mensaje de no hay saldo
			System.out.println("SALDO NO DISPONIBLE, SU SALDO ES: "+saldoOrigen);
		}
		
		

		
	}
	
	

}
