package br.com.spbweb.dao;

import java.util.List;

import br.com.spbweb.modelo.Employee;
import br.com.spbweb.service.IEmployeService;
import br.com.spbweb.util.PersistenceUtil;

public class EmployeDao implements IEmployeService{
	


	@Override
	public void insert(Employee employee) {
		PersistenceUtil.getEntityManager().getTransaction().begin();
		PersistenceUtil.getEntityManager().persist(employee);
		PersistenceUtil.getEntityManager().getTransaction().commit();
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> AllList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
