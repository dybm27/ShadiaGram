package dao;

import model.Comentario;
import util.Conexion;
import util.GenericDao;

public class ComentarioDao extends Conexion<Comentario> implements GenericDao<Comentario>{
	public ComentarioDao() {
		super(Comentario.class);
	}
}
