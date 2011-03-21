package br.com.spbweb.negocio;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.spbweb.dao.RoleDao;
import br.com.spbweb.modelo.Role;

public class RoleBusiness {

	private static Logger logger = Logger.getLogger(RoleBusiness.class);


	public void saveRole(Role role)throws Exception{

		try{
			RoleDao roleDao = new RoleDao();
			roleDao.insert(role);
		}catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}		

	}

	public List<Role> autoCompleteQuery(String name) throws Exception{
		List lista = new ArrayList();
		RoleDao roleDao = new RoleDao();
		try{
			lista = roleDao.queryAutoComplete(name);
		}catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}return lista;

	}

	public void updateRole(Role role)throws Exception{

		try{
			RoleDao roleDao = new RoleDao();
			roleDao.update(role);
		}catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}		

	}


	public void deleteRole(Role role)throws Exception{

		try{
			RoleDao roleDao = new RoleDao();
			roleDao.delete(role);
		}catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}		

	}


	public List allRoles()throws Exception{
		List role = null;
		RoleDao dao = new RoleDao();
		try{
			role = dao.AllList();   		

		}catch(Exception e){
			logger.error(e);
			e.printStackTrace();
		}

		return role;
	}

}
