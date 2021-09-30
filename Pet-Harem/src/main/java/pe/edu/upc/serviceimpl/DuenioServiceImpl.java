package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDuenioDao;
import pe.edu.upc.entity.Duenio;
import pe.edu.upc.service.IDuenioService;

@Named
@RequestScoped
public class DuenioServiceImpl implements IDuenioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDuenioDao mD;

	@Override
	public void insertar(Duenio duenio) {
		mD.insertar(duenio);		
	}

	@Override
	public List<Duenio> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idDuenio) {
		mD.eliminar(idDuenio);		
	}
	

}
