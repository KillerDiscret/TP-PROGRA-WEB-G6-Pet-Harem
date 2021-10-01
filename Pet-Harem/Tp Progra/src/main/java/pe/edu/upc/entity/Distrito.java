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
@Table(name="Distrito")

public class Distrito implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NDistrito", nullable=false, length=25)
	private String NDistrito;
	
	@OneToMany(mappedBy = "distrito")
	private List<Duenio> duenios;
	

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(int id, String nDistrito) {
		super();
		this.id = id;
		NDistrito = nDistrito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNDistrito() {
		return NDistrito;
	}

	public void setNDistrito(String nDistrito) {
		NDistrito = nDistrito;
	}
	
}
