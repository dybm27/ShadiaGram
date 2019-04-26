package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class Conexion<T> {
	private static EntityManager em = null;
	private Class<T> c;

	public static EntityManager getEm() {
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("ShadiaGramModel");
			em = emf.createEntityManager();
		}
		return em;
	}

	public Conexion() {
		em = this.getEm();
	}

	public Conexion(Class<T> c) {
		em = this.getEm();
		this.c = c;
	}

	public void setC(Class<T> c) {
		this.c = c;
	}

	public <E> T buscarPorId(E id) {
		T object = (T) em.find(c, id);
		return object;
	}
	
	public T buscarPorParametro(String columna,String parametro) {
		String consulta= "select u from "+ c.getSimpleName()+" u where u."+columna+"= '"+parametro+"'";
		System.out.println(consulta);
		T object=null;
		try {
			object	=	(T)em.createQuery(consulta).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return object;
	}
	

	public List<T> listar() {
		TypedQuery<T> consulta = em.createNamedQuery(c.getSimpleName() + ".findAll", c);
		List<T> lista = (List<T>) consulta.getResultList();
		return lista;
	}

	public void insertar(T o) {
		try {
			em.getTransaction().begin();
			em.persist(o);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void actualizar(T o) {
		try {
			em.getTransaction().begin();
			em.merge(o);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void eliminar(T o) {
		try {
			em.getTransaction().begin();
			em.remove(o);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
