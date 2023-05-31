package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;
@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	private static List<Transferencia> baseDatos=new ArrayList<>();
	
	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getNumero());
		baseDatos.add(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		Transferencia trans=this.seleccionarPorNumero(numero);
		baseDatos.remove(trans);
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		Transferencia transferenciaEncontrado= new Transferencia();
		for(Transferencia transferencia:baseDatos) {
			if(numero.equals(transferencia.getNumero())) {
				transferenciaEncontrado=transferencia;
			}
		}
		
		
		return transferenciaEncontrado;
	}

	@Override
	public List<Transferencia> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

	
	
}
