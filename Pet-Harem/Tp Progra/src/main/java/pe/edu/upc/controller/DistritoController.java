
package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Distrito;
import pe.edu.upc.service.IDistritoService;

@Named
@RequestScoped

public class DistritoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDistritoService mService;
	private Distrito distrito;
	List<Distrito> listaDistritos;
	
	@PostConstruct
	public void init() {
		this.listaDistritos = new ArrayList<Distrito>();
		this.distrito = new Distrito();
		this.listar();
	}
	
	public String nuevoDistrito() {
		this.setDistrito(new Distrito());
		return "motor.xhtml";
	}
	
	private void setDistrito(Distrito distrito2) {
		// TODO Auto-generated method stub
		
	}

	public void insertar() {
		mService.insertar(distrito);
		limpiarMotor();
	}
	
	public void listar() {
		listaDistritos = mService.listar();
	}

	public void limpiarMotor() {
		this.init();
	}
	
	public void eliminar(Distrito distrito) {
		mService.eliminar(distrito.getId());
		this.listar();
	}
	
	public Distrito getDistrito() {
		return distrito;
	}

	public void setMotor(Distrito distrito) {
		this.distrito = distrito;
	}

	public List<Distrito> getListaDistritos() {
		return listaDistritos;
	}

	public void setListaDistritos(List<Distrito> listaDistritos) {
		this.listaDistritos = listaDistritos;
	}
	

}

