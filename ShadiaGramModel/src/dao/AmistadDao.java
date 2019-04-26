package dao;

import model.Amistad;
import util.Conexion;
import util.GenericDao;

public class AmistadDao extends Conexion<Amistad> implements GenericDao<Amistad>{
	public AmistadDao() {
		super(Amistad.class);
	}
}

