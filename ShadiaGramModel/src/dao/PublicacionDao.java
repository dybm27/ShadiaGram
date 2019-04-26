package dao;

import model.Publicacion;
import util.Conexion;
import util.GenericDao;

public class PublicacionDao extends Conexion<Publicacion> implements GenericDao<Publicacion>{
	public PublicacionDao() {
		super(Publicacion.class);
	}
}
