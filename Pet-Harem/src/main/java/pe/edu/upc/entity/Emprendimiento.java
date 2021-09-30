package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emprendimiento")

public class Emprendimiento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmprendimiento;
	
	@Column(name="nombreEmprendimiento", nullable=false, length=30)
	private String nombreEmprendimiento;
	
	@Column(name="rucEmprendimiento", nullable=false, length=12)
	private String rucEmprendimiento;
	
	@Column(name="direccionEmprendimiento", nullable=false, length=50)
	private String direccionEmprendimiento;
	
	@Column(name="anuncioEmprendimiento", nullable=false, length=100)
	private String anuncioEmprendimiento;

	public Emprendimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emprendimiento(int idEmprendimiento, String nombreEmprendimiento, String rucEmprendimiento,
			String direccionEmprendimiento, String anuncioEmprendimiento) {
		super();
		this.idEmprendimiento = idEmprendimiento;
		this.nombreEmprendimiento = nombreEmprendimiento;
		this.rucEmprendimiento = rucEmprendimiento;
		this.direccionEmprendimiento = direccionEmprendimiento;
		this.anuncioEmprendimiento = anuncioEmprendimiento;
	}

	public int getIdEmprendimiento() {
		return idEmprendimiento;
	}

	public void setIdEmprendimiento(int idEmprendimiento) {
		this.idEmprendimiento = idEmprendimiento;
	}

	public String getNombreEmprendimiento() {
		return nombreEmprendimiento;
	}

	public void setNombreEmprendimiento(String nombreEmprendimiento) {
		this.nombreEmprendimiento = nombreEmprendimiento;
	}

	public String getRucEmprendimiento() {
		return rucEmprendimiento;
	}

	public void setRucEmprendimiento(String rucEmprendimiento) {
		this.rucEmprendimiento = rucEmprendimiento;
	}

	public String getDireccionEmprendimiento() {
		return direccionEmprendimiento;
	}

	public void setDireccionEmprendimiento(String direccionEmprendimiento) {
		this.direccionEmprendimiento = direccionEmprendimiento;
	}

	public String getAnuncioEmprendimiento() {
		return anuncioEmprendimiento;
	}

	public void setAnuncioEmprendimiento(String anuncioEmprendimiento) {
		this.anuncioEmprendimiento = anuncioEmprendimiento;
	}
	
	



}
