package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Duenio;
import pe.edu.upc.service.IDuenioService;

@Named
@RequestScoped

public class DuenioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private IDuenioService mService;
	private Duenio duenio;
	List<Duenio> listaDuenios;
	
	@PostConstruct
	public void init() {
		this.listaDuenios = new ArrayList<Duenio>();
		this.duenio = new Duenio();
		this.listar();
	}
	
	
	public String nuevoDuenio() {
		this.setDuenio(new Duenio());
		return "motor.xhtml";
	}
	
	public void insertar() {
		mService.insertar(duenio);
		limpiarDuenio();
	}
	
	public void listar() {
		listaDuenios = mService.listar();
	}

	public void limpiarDuenio() {
		this.init();
	}
	
	public void eliminar(Duenio duenio) {
		mService.eliminar(duenio.getId());
		this.listar();
	}
	
	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}

	public List<Duenio> getListaDuenios() {
		return listaDuenios;
	}

	public void setListaDuenios(List<Duenio> listaDuenios) {
		this.listaDuenios = listaDuenios;
	}

}



