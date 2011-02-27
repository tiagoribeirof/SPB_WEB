package br.com.spbweb.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.EntityManagerImpl;

import br.com.spbweb.modelo.Role;
import br.com.spbweb.service.IRoleService;
import br.com.spbweb.util.PersistenceUtil;

public class RoleDao implements IRoleService{

	@Override
	public void insert(Role role) {
		PersistenceUtil.getEntityManager().getTransaction().begin();
		PersistenceUtil.getEntityManager().persist(role);
		PersistenceUtil.getEntityManager().getTransaction().commit();
		
	}
	

     @SuppressWarnings("unchecked")
	public List<String> queryAutoComplete(String name){		
		Query q = PersistenceUtil.getEntityManager().createNamedQuery("pesquisaAutoComplete");
		q.setParameter(0, "%" + name + "%");
		List<String> names = q.getResultList();
		return names;
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Role role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> AllList() {
		Query q = PersistenceUtil.getEntityManager().createQuery(" select r from Role r ");
		List cargos = q.getResultList();
		return cargos;
	}

	@Override
	public Role getRole(Long id) {
		EntityManagerImpl ent = (EntityManagerImpl) PersistenceUtil.getEntityManager().getDelegate();
		Session session = ent.getSession();
		Criteria crt = session.createCriteria(Role.class);
		crt.add(Restrictions.lt("ID_ROLE", id));
	    Role role = (Role)crt.list();
		
		return role;
	}

}
