package br.com.spbweb.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ROLE")
@NamedQueries({
	 @NamedQuery(name = "pesquisaAutoComplete", query = "SELECT r FROM "
	        + "Role r WHERE (r.roleName) like (?0) ORDER BY r.roleName")})

public class Role implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "sqRole")
	@SequenceGenerator(name="sqRole", sequenceName="SEQ_ROLE")
	@Column(name="ID_ROLE")
	private Long idRole;
	
	@Column(name="NAME_ROLE")
	private String roleName;
	
	@Column(name="LEVEL_ROLE")
	private int roleLevel;

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(int roleLevel) {
		this.roleLevel = roleLevel;
	}

	
	
}
