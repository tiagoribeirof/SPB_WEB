package br.com.spbweb.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.EntityManagerImpl;

import br.com.spbweb.modelo.Employee;
import br.com.spbweb.modelo.Role;
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
	
	public Employee getEmployee(String nickName, String password){
		Employee employee = new Employee();
		Query q = PersistenceUtil.getEntityManager().createNamedQuery("pesquisaLogin");
		q.setParameter("nickname", nickName );
		q.setParameter("password", password );
		employee = (Employee) q.getSingleResult();
	
		return employee;

	}

	

}
