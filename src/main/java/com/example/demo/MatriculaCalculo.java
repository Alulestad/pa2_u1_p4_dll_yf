package com.example.demo;

public class MatriculaCalculo {
	
	public void realizarMatricula(String tipo){
		if(tipo.equals("1")) {
			Materia mat=new Materia();
			mat.setNombre("P. Web");
			//Insertar en la base
			System.out.println("Se inserto Materia");
		}else {
			MateriaExtraordinaria matX=new MateriaExtraordinaria();
			matX.setNombre("p. web");
			matX.setCantidadCreditos(10);
			//Insertar en la base
			System.out.println("Se inserto MateriaExtraordinaria");
			
		}
	}

}
