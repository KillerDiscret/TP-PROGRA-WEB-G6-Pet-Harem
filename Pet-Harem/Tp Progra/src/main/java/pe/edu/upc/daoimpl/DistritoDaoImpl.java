package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entity.Distrito;

public class DistritoDaoImpl implements IDistritoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	@Transactional

	@Override
	public void insertar(Distrito distrito) {
		// TODO Auto-generated method stub
		em.persist(distrito);	
	}

	@SuppressWarnings("unchecked")	
	@Override
	public List<Distrito> listar() {
		// TODO Auto-generated method stub
		List<Distrito> lista = new ArrayList<Distrito>();
		Query q = em.createQuery("select m from Distrito m");
		lista = (List<Distrito>) q.getResultList();
		return lista;
	}

	
	@Transactional
	@Override
	public void eliminar(int idDistrito) {
		// TODO Auto-generated method stub
		Distrito distrito = new Distrito();
		distrito = em.getReference(Distrito.class, idDistrito);
		em.remove(distrito);	
	}
	
}
