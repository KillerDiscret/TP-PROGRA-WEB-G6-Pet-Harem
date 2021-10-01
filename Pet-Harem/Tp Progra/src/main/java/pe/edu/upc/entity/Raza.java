package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Raza")


public class Raza implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NRaza", nullable=false, length=20)
	private String NRaza;
	
	@Column(name="TCaracteristicas", nullable=false, length=100)
	private String TCaracteristicas;
	
	@OneToMany(mappedBy = "raza")
	private List<Mascota> mascotas;
	

	public Raza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Raza(int id, String nRaza, String tCaracteristicas) {
		super();
		this.id = id;
		NRaza = nRaza;
		TCaracteristicas = tCaracteristicas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNRaza() {
		return NRaza;
	}

	public void setNRaza(String nRaza) {
		NRaza = nRaza;
	}

	public String getTCaracteristicas() {
		return TCaracteristicas;
	}

	public void setTCaracteristicas(String tCaracteristicas) {
		TCaracteristicas = tCaracteristicas;
	}
	
	
	
	

	
}
