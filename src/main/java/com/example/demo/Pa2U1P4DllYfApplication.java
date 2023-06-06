package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.CuentaRepository;
import com.example.demo.banco.repository.modelo.Cajero;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Impuesto;
import com.example.demo.banco.repository.modelo.Presidente;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CargaSistemaService;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner {

	@Autowired
	private Cajero cajero;

	@Autowired
	private Cajero cajero1;

	@Autowired
	private Presidente presidente;

	@Autowired
	private Presidente presidente2;

	@Autowired
	private CargaSistemaService cargaSistemaService;
	
	
	@Autowired
	private TransferenciaService transferenciaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		this.cajero.setApellido("Florez");
		this.cajero.setNombre("Yaniri :3");
		this.cajero.setSalario(new BigDecimal(100));

		System.out.println(this.cajero);

		this.cajero1.setApellido("Teran");
		System.out.println(this.cajero1);
		System.out.println(this.cajero1.getApellido());

		this.presidente.setApellido("Molina");
		this.presidente.setNombre("Daniel UWU");
		this.presidente.setCedula("1234");

		this.presidente2.setApellido("Taco");

		System.out.println(this.presidente);
		System.out.println(this.presidente2);

		System.out.println("***********SEGUNDA PARTE***********");
		this.cargaSistemaService.cargar();
		Transferencia transferencia= new Transferencia();
		transferencia.setCuentaDestino(null);
		transferencia.setCuentaOrigen(null);
		transferencia.setFecha(LocalDateTime.now());
		transferencia.setMonto(new BigDecimal(100));
		transferencia.setNumero("123123");
		
		this.transferenciaService.crear(null);

	}

}
