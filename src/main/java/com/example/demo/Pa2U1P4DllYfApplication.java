package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DllYfApplication implements CommandLineRunner {
	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DllYfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Flores");
		miEstudiante.setCedula("123456789");
		miEstudiante.setNombre("Yaniri");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1911, 07, 07, 10, 50));

		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Llumiquinga");
		miEstudiante1.setCedula("12345655566");
		miEstudiante1.setNombre("Daniel");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(1995, 07, 27, 10, 50));

		// 1. guaradar
		this.estudianteService.guardar(miEstudiante);
		this.estudianteService.guardar(miEstudiante1);

		// 5. imprimir reporte
		List<Estudiante> reporte = this.estudianteService.reporteDeTodos();

		System.out.println("Reporte de todos los estudiantes");
		for (Estudiante estu : reporte) {
			System.out.println(estu);
		}

		// 2. Actualizar

		miEstudiante1.setApellido("Molina");
		this.estudianteService.actualizar(miEstudiante1);

		// 5. imprimir reporte
		List<Estudiante> reporte2 = this.estudianteService.reporteDeTodos();

		System.out.println("Reporte de todos los estudiantes");
		for (Estudiante estu : reporte2) {
			System.out.println(estu);
		}

		// 3. Eliminar
		this.estudianteService.borrar("12345655566");

		// 5. imprimir reporte
		List<Estudiante> reporte3 = this.estudianteService.reporteDeTodos();

		System.out.println("Reporte de todos los estudiantes");
		for (Estudiante estu : reporte3) {
			System.out.println(estu);
		}
		
		//4. Buscar por cedula
		
		Estudiante encontrado=	this.estudianteService.buscarPorCedula("123456789");
		System.out.println("Estudiante encontrado");
		System.out.println(encontrado);
		
		Estudiante encontrado2=	this.estudianteService.buscarPorCedula("987987987");
		System.out.println("Estudiante encontrado");
		System.out.println(encontrado2);

	}

}
