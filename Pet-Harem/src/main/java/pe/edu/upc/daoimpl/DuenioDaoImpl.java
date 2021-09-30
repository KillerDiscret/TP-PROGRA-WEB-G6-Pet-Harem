package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDuenioDao;
import pe.edu.upc.entity.Duenio;

public class DuenioDaoImpl implements IDuenioDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Duenio duenio) {
		em.persist(duenio);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Duenio> listar() {
		List<Duenio> lista = new ArrayList<Duenio>();
		Query q = em.createQuery("select d from Duenio d");
		lista = (List<Duenio>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idDuenio) {
		Duenio duenio = new Duenio();
		duenio = em.getReference(Duenio.class, idDuenio);
		em.remove(duenio);		
	}
	
}
