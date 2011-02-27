package br.com.spbweb.negocio;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.spbweb.dao.RoleDao;
import br.com.spbweb.modelo.Role;

public class RoleBusiness {
	
	private static Logger logger = Logger.getLogger(RoleBusiness.class);
	
	
	public void SaveRole(String nameRole)throws Exception{
		Role role = new Role();
		try{
			role.setRoleName(nameRole);	
			RoleDao roleDao = new RoleDao();
			roleDao.insert(role);
		}catch (Exception e) {
             logger.error(e);
             e.printStackTrace();
		}		
		
	}

	public List<String> autoCompleteQuery(String name) throws Exception{
		List lista = new ArrayList();
		RoleDao roleDao = new RoleDao();
		try{
			lista = roleDao.queryAutoComplete(name);
		}catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}return lista;

	}

	
	public Role queryRoleId(Long id)throws Exception{
		Role role = null;
		RoleDao dao = new RoleDao();
		try{
			role = dao.getRole(id);   		

		}catch(Exception e){
			logger.error(e);
			e.printStackTrace();
		}

		return role;
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
