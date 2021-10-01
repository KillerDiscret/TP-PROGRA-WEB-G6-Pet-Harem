package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Duenio;

public interface IDuenioService {
	public void insertar(Duenio motor);
	public List<Duenio> listar();
	public void eliminar(int idDuenio);	
}
