package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Emprendimiento;

public interface IEmprendimientoDao {
	public void insertar(Emprendimiento emprendimiento);
	public List<Emprendimiento> listar();
	public void eliminar(int idEmprendimiento);		
}
