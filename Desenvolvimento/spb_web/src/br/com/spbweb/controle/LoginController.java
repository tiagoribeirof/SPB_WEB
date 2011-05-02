package br.com.spbweb.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.spbweb.modelo.Employee;
import br.com.spbweb.negocio.EmployeBusiness;
import br.com.spbweb.util.FacesUtil;


@ManagedBean
@SessionScoped
public class LoginController {

	private Employee employee = new Employee();
   
	private FacesUtil facesUtil ;



	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	private String logout(){
		employee = null;
		return "login";

	}


	public String logarUser() throws Exception{
		boolean result = false;
		if(!employee.getNickName().equals("")|| employee.getPassword().equals("")){
			EmployeBusiness emp = new EmployeBusiness();
			result = emp.autenticaEmploye(employee);
		}if(result){
			return "home"; 
		}else{
             facesUtil.getInstancia().adicionaMensagemDeInformacao("Usuario ou Senha inválidos");
			return null;
		}


	}

}
