package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner {
	
	
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private TransferenciaService transferenciaService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Cuenta 1
		Cuenta cuenta1=new Cuenta();
		cuenta1.setCedulaPropietario("123456789");
		cuenta1.setFechaApertura(LocalDate.of(2020, 01, 01));
		cuenta1.setNumero("987987");
		cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");
		
		this.cuentaService.crear(cuenta1);
		
		//Cuenta 2
		Cuenta cuenta2=new Cuenta();
		cuenta2.setCedulaPropietario("987654321");
		cuenta2.setFechaApertura(LocalDate.of(2010, 02, 10));
		cuenta2.setNumero("654654");
		cuenta2.setSaldo(new BigDecimal(100));
		cuenta2.setTipo("A");
		
		this.cuentaService.crear(cuenta2);
		
		
		System.out.println(this.cuentaService.buscarPorNumero("987654321"));
		
		this.transferenciaService.realizar("123456789", "987654321", new BigDecimal(10));
		
		System.out.println("Saldo origen "+this.cuentaService.buscarPorNumero("123456789")+" saldo " + this.cuentaService.buscarPorNumero("123456789").getSaldo());
		System.out.println("Saldo DESTINO "+this.cuentaService.buscarPorNumero("987654321")+" saldo " + this.cuentaService.buscarPorNumero("987654321").getSaldo());

	
	}

}



