package dao;

import model.Mensaje;
import util.Conexion;
import util.GenericDao;

public class MensajeDao extends Conexion<Mensaje> implements GenericDao<Mensaje>{
	public MensajeDao() {
		super(Mensaje.class);
	}
}

