package dao;

import model.Usuario;
import util.Conexion;
import util.GenericDao;

public class UsuarioDao extends Conexion<Usuario> implements GenericDao<Usuario>{
	public UsuarioDao() {
		super(Usuario.class);
	}

}