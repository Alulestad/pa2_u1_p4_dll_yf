package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Mi primer proyecto");
		
		/*
		 * Spring framework: Framework que permite la construcción/desarrollo de 
		 * aplicaciones empresariales basadas en spring
		 */
		
		Profesor profe=new Profesor();
		profe.setApellido("Llumiquinga");
		profe.setCedula("1721495628");
		profe.setFechaNacimiento(LocalDateTime.now());
		profe.setNombre("Daniel");
		
		
		System.out.println(profe);
		
		
		
	}

}
