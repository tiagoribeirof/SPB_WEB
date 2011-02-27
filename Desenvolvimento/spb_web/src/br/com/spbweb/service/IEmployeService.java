package br.com.spbweb.service;

import java.util.List;

import br.com.spbweb.modelo.Employee;

public interface IEmployeService {
	
	public void insert(Employee employee);
	public void update(Employee employee);
	public void delete(Employee employee);
	public Employee getEmployee(Long id);
	public List <Employee> AllList();

}
