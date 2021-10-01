package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mascota")


public class Mascota implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NNombre", nullable=false, length=20)
	private String NNombre;
	
	private Date DNacimiento;
	
	@Column(name="NumPeso", nullable=false, length=10)
	private String NumPeso;
	
	@Column(name="NumTamanio", nullable=false, length=10)
	private String NumTamanio;


	@ManyToOne
	@JoinColumn(name= "Raza_id")
	private Raza raza;
	
	
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mascota(int id, String nNombre, Date dNacimiento, String numPeso, String numTamanio) {
		super();
		this.id = id;
		NNombre = nNombre;
		DNacimiento = dNacimiento;
		NumPeso = numPeso;
		NumTamanio = numTamanio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNNombre() {
		return NNombre;
	}

	public void setNNombre(String nNombre) {
		NNombre = nNombre;
	}

	public Date getDNacimiento() {
		return DNacimiento;
	}

	public void setDNacimiento(Date dNacimiento) {
		DNacimiento = dNacimiento;
	}

	public String getNumPeso() {
		return NumPeso;
	}

	public void setNumPeso(String numPeso) {
		NumPeso = numPeso;
	}

	public String getNumTamanio() {
		return NumTamanio;
	}

	public void setNumTamanio(String numTamanio) {
		NumTamanio = numTamanio;
	}
	
	

}
