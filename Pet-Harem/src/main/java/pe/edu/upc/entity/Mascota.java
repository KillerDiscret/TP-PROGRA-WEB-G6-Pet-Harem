package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mascota")

public class Mascota implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMascota;
	
	@Column(name="nombreMascota", nullable=false, length=25)
	private String nombreMascota;
	
	@Column(name="tipoMascota", nullable=false, length=25)
	private String tipoMascota;
	
	@Column(name="razaMascota", nullable=false, length=25)
	private String razaMascota;
	
	@Column(name="tamanioMascota", nullable=false, length=5)
	private String tamanioMascota;

	@Column(name="pesoMascota", nullable=false, length=5)
	private String pesoMascota;
	
	@Column(name="idDuenio", nullable=false)
	private int idDuenio;

	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mascota(int idMascota, String nombreMascota, String tipoMascota, String razaMascota, String tamanioMascota,
			String pesoMascota, int idDuenio) {
		super();
		this.idMascota = idMascota;
		this.nombreMascota = nombreMascota;
		this.tipoMascota = tipoMascota;
		this.razaMascota = razaMascota;
		this.tamanioMascota = tamanioMascota;
		this.pesoMascota = pesoMascota;
		this.idDuenio = idDuenio;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getRazaMascota() {
		return razaMascota;
	}

	public void setRazaMascota(String razaMascota) {
		this.razaMascota = razaMascota;
	}

	public String getTamanioMascota() {
		return tamanioMascota;
	}

	public void setTamanioMascota(String tamanioMascota) {
		this.tamanioMascota = tamanioMascota;
	}

	public String getPesoMascota() {
		return pesoMascota;
	}

	public void setPesoMascota(String pesoMascota) {
		this.pesoMascota = pesoMascota;
	}

	public int getIdDuenio() {
		return idDuenio;
	}

	public void setIdDuenio(int idDuenio) {
		this.idDuenio = idDuenio;
	}

	

}
