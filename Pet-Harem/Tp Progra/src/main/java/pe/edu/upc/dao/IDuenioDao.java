package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Duenio;

public interface IDuenioDao {
	public void insertar(Duenio duenio);
	public List<Duenio> listar();
	public void eliminar(int idDuenio);	
}
