package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMascotaDao;
import pe.edu.upc.entity.Mascota;

public class MascotaDaoImpl implements IMascotaDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Mascota mascota) {
		em.persist(mascota);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mascota> listar() {
		List<Mascota> lista = new ArrayList<Mascota>();
		Query q = em.createQuery("select m from Mascota m");
		lista = (List<Mascota>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idMascota) {
		Mascota mascota = new Mascota();
		mascota = em.getReference(Mascota.class, idMascota);
		em.remove(mascota);		
	}
	
}
