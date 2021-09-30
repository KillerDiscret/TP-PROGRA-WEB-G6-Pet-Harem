package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Duenio")

public class Duenio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDuenio;
	
	@Column(name="nombreDuenio", nullable=false, length=25)
	private String nombreDuenio;
	
	@Column(name="apellidoDuenio", nullable=false, length=25)
	private String apellidoDuenio;
	
	@Column(name="dniDuenio", nullable=false, length=8)
	private String dniDuenio;
	
	@Column(name="distritoDuenio", nullable=false, length=25)
	private String distritoDuenio;

	@Column(name="celularDuenio", nullable=false, length=9)
	private String celularDuenio;

	public Duenio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duenio(int idDuenio, String nombreDuenio, String apellidoDuenio, String dniDuenio, String distritoDuenio,
			String celularDuenio) {
		super();
		this.idDuenio = idDuenio;
		this.nombreDuenio = nombreDuenio;
		this.apellidoDuenio = apellidoDuenio;
		this.dniDuenio = dniDuenio;
		this.distritoDuenio = distritoDuenio;
		this.celularDuenio = celularDuenio;
	}

	public int getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}

	public String getNombreDuenio() {
		return nombreDuenio;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public String getApellidoDuenio() {
		return apellidoDuenio;
	}

	public void setApellidoDuenio(String apellidoDuenio) {
		this.apellidoDuenio = apellidoDuenio;
	}

	public String getDniDuenio() {
		return dniDuenio;
	}

	public void setDniDuenio(String dniDuenio) {
		this.dniDuenio = dniDuenio;
	}

	public String getDistritoDuenio() {
		return distritoDuenio;
	}

	public void setDistritoDuenio(String distritoDuenio) {
		this.distritoDuenio = distritoDuenio;
	}

	public String getCelularDuenio() {
		return celularDuenio;
	}

	public void setCelularDuenio(String celularDuenio) {
		this.celularDuenio = celularDuenio;
	}


	
	
	
}
