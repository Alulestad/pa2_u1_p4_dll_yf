package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner{

	@Autowired
	private Profesor profe2;
	

	
	
	
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
		profe.setApellido("Velez");
		System.out.println(profe.getApellido());
		
		System.out.println(profe2);
		profe2.setApellido("Teran");
	    System.out.println(profe2.getApellido());
	    Profesor profe3;
	    profe3=profe;
	    System.out.println(profe3);
	    profe.setNombre("jose");
	    
	    System.out.println(profe3);
	    profe3.setNombre("mario");
	    
	    System.out.println(profe);
	    
	    System.out.println();
	    
	    MatriculaCalculo mat= new MatriculaCalculo();
	    mat.realizarMatricula("1");
	    
	    
		
		
	}

}
