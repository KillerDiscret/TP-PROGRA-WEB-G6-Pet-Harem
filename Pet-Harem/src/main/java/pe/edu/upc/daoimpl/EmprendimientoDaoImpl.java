package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEmprendimientoDao;
import pe.edu.upc.entity.Emprendimiento;

public class EmprendimientoDaoImpl implements IEmprendimientoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Emprendimiento emprendimiento) {
		em.persist(emprendimiento);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Emprendimiento> listar() {
		List<Emprendimiento> lista = new ArrayList<Emprendimiento>();
		Query q = em.createQuery("select e from Emprendimiento e");
		lista = (List<Emprendimiento>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idEmprendimiento) {
		Emprendimiento emprendimiento = new Emprendimiento();
		emprendimiento = em.getReference(Emprendimiento.class, idEmprendimiento);
		em.remove(emprendimiento);		
	}
	
}
