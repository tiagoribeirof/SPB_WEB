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

	private Role roleSimple= new Role() ;




	public Role getRoleSimple() {

		return roleSimple;
	}

	public void setRoleSimple(Role roleSimple) {
		this.roleSimple = roleSimple;
	}

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

	public String saveRole() throws Exception{
		if(!roleSimple.getRoleName().equals("")){
			RoleBusiness business = new RoleBusiness();
			business.saveRole(roleSimple);

		}

        return "page_main.jsf";    
	}


	public void queryRole() throws Exception{
		RoleBusiness roleBusiness = null;
		if(nameRole.equals("")){
			roleBusiness = new RoleBusiness();
			role = roleBusiness.allRoles();
		}else{
			roleBusiness = new RoleBusiness();
			role = roleBusiness.autoCompleteQuery(nameRole);	
		}

	}


	public List<String> complete(String name) throws Exception {
		RoleBusiness roleBusiness = new RoleBusiness();
		role = roleBusiness.autoCompleteQuery(name);	
		List <String> results = new ArrayList<String>();
		for(int x =0; x<role.size();x++){
			Role role = this.role.get(x);
			results.add(role.getRoleName());
		}
		return results;
	}


	public void updateRole() throws Exception{
		if(!roleSimple.getRoleName().equals("")){
			RoleBusiness roleBusiness = new RoleBusiness();
			roleBusiness.updateRole(roleSimple);
		}
	}


	public void deleteRole() throws Exception{	System.out.println("kkkkk");	
		RoleBusiness roleBusiness = new RoleBusiness();
		roleBusiness.deleteRole(roleSimple);

	}
}