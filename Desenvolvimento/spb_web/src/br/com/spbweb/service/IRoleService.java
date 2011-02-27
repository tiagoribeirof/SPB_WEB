package br.com.spbweb.service;

import java.util.List;

import br.com.spbweb.modelo.Employee;
import br.com.spbweb.modelo.Role;

public interface IRoleService {
	
	public void insert(Role role);
	public Role getRole(Long id);
	public void update(Role role);
	public void delete(Role role);
	public List <Role> AllList();


}
