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
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner {
	@Autowired
	private CuentaService cuentaService;
	
	@Autowired
	private CuentaRepository cuentaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cuenta cuenta1=new Cuenta();
		cuenta1.setCedulaPropietario("123456789");
		cuenta1.setFechaApertura(LocalDate.of(2020, 01, 01));
		cuenta1.setNumero("123456789");
		cuenta1.setSaldo(new BigDecimal(123));
		cuenta1.setTipo("A");
		
		Cuenta cuenta2=new Cuenta();
		cuenta2.setCedulaPropietario("987654321");
		cuenta2.setFechaApertura(LocalDate.of(2010, 02, 10));
		cuenta2.setNumero("987654321");
		cuenta2.setSaldo(new BigDecimal(321));
		cuenta2.setTipo("C");
		
		
		
		
		
	}

}



