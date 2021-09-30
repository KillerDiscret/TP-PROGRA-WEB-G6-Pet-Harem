package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEmprendimientoDao;
import pe.edu.upc.entity.Emprendimiento;
import pe.edu.upc.service.IEmprendimientoService;

@Named
@RequestScoped
public class EmprendimientoServiceImpl implements IEmprendimientoService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmprendimientoDao mD;

	@Override
	public void insertar(Emprendimiento emprendimiento) {
		mD.insertar(emprendimiento);		
	}

	@Override
	public List<Emprendimiento> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idEmprendimiento) {
		mD.eliminar(idEmprendimiento);		
	}
	

}
