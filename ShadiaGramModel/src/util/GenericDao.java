package util;

import java.util.List;

public interface GenericDao<T> {
	public <E> T buscarPorId(E id);
	public List<T> listar();
	public void insertar(T o);
	public void actualizar(T o);
	public void eliminar(T o);
	public T buscarPorParametro(String columna,String parametro);
}
