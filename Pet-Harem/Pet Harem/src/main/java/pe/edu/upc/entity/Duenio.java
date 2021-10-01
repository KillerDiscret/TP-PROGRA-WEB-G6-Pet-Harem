package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Duenio")

public class Duenio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NNombre", nullable=false, length=20)
	private String NNombre;
	
	@Column(name="NApellido", nullable=false, length=20)
	private String NApellido;
	
	@Column(name="NumDNI", nullable=false, length=8)
	private String NumDNI;
	
	@Column(name="TCorreo", nullable=false, length=30)
	private String TCorreo;
	
	@Column(name="NumCelular", nullable=false, length=9)
	private String NumCelular;
	
	@Column(name="TDireccion", nullable=false, length=30)
	private String TDireccion;
	
	@ManyToOne
	@JoinColumn(name= "distrito_id")
	private Distrito distrito;
	
	

	public Duenio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Duenio(int id, String nNombre, String nApellido, String numDNI, String tCorreo, String numCelular,
			String tDireccion) {
		super();
		this.id = id;
		NNombre = nNombre;
		NApellido = nApellido;
		NumDNI = numDNI;
		TCorreo = tCorreo;
		NumCelular = numCelular;
		TDireccion = tDireccion;
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

	public String getNApellido() {
		return NApellido;
	}

	public void setNApellido(String nApellido) {
		NApellido = nApellido;
	}

	public String getNumDNI() {
		return NumDNI;
	}

	public void setNumDNI(String numDNI) {
		NumDNI = numDNI;
	}

	public String getTCorreo() {
		return TCorreo;
	}

	public void setTCorreo(String tCorreo) {
		TCorreo = tCorreo;
	}

	public String getNumCelular() {
		return NumCelular;
	}

	public void setNumCelular(String numCelular) {
		NumCelular = numCelular;
	}

	public String getTDireccion() {
		return TDireccion;
	}

	public void setTDireccion(String tDireccion) {
		TDireccion = tDireccion;
	}
	

}
