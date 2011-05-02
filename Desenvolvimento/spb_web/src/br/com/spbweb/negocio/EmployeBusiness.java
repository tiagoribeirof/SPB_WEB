package br.com.spbweb.negocio;

import org.apache.log4j.Logger;

import br.com.spbweb.dao.EmployeDao;
import br.com.spbweb.modelo.Employee;
import br.com.spbweb.util.Criptografia;

public class EmployeBusiness {
	
	private static Logger logger = Logger.getLogger(EmployeBusiness.class);
	
	
	
	public boolean autenticaEmploye(Employee employee)throws Exception{
		    String senha ="";
		    boolean retorno = false;
		    Employee employe = null;
		try{
			
			 EmployeDao dao = new EmployeDao();
			 senha = Criptografia.encripta(employee.getPassword());
			 employe= dao.getEmployee(employee.getNickName(), senha);
			 if(employe.getNickName().equals(employee.getNickName())&& employe.getPassword().equals(senha)) {
				 retorno = true;
			 }
		     }catch (Exception e) {
				e.printStackTrace();
			}return retorno;
			 
			 
			
		}
		
		
	}


