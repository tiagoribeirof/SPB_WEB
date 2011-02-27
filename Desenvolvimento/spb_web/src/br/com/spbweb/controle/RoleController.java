package br.com.spbweb.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.spbweb.bean.RoleBean;
import br.com.spbweb.modelo.Role;
import br.com.spbweb.negocio.RoleBusiness;


@ManagedBean
@ViewScoped
public class RoleController {
	
	private Long idRole;
	
	private String nameRole;
	
	private int levelRole;
	
	private List<Role> role;

	
	public List<Role> getRole() {
		return role;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public int getLevelRole() {
		return levelRole;
	}

	public void setLevelRole(int levelRole) {
		this.levelRole = levelRole;
	}
	
	public void saveRole() throws Exception{
		if(!nameRole.equals("")){
			RoleBusiness business = new RoleBusiness();
		    business.SaveRole(this.nameRole);
						
		}
		
		
	}
	
	
	public void queryRole() throws Exception{
		if(nameRole.equals("")){
			RoleBusiness roleBusiness = new RoleBusiness();
			role = roleBusiness.allRoles();
		}
		
	}
	
	
	public List<String> complete(String name) throws Exception {
		RoleBusiness roleBusiness = new RoleBusiness();
		List<String> results = new ArrayList<String>();	
		results = roleBusiness.autoCompleteQuery(name);			
		return results;
	}
}