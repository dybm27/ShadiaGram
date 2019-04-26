package dao;

import model.Etiqueta;
import util.Conexion;
import util.GenericDao;

public class EtiquetaDao extends Conexion<Etiqueta> implements GenericDao<Etiqueta>{
	public EtiquetaDao() {
		super(Etiqueta.class);
	}
}