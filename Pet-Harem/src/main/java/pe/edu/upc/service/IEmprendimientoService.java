package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Emprendimiento;

public interface IEmprendimientoService {
	public void insertar(Emprendimiento emprendimiento);
	public List<Emprendimiento> listar();
	public void eliminar(int idEmprendimiento);	
}
