package br.com.spbweb.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import br.com.spbweb.modelo.Employee;
@ManagedBean
@SessionScoped
public class EmployerController {
	
	
   private Employee employee = new Employee();

   private String confirmPassword;
	
	
	
	public Employee getEmployee() {
	return employee;
}



public void setEmployee(Employee employee) {
	this.employee = employee;
}




	public String getConfirmPassword() {
	return confirmPassword;
}



public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}


public String teste(){
	System.out.println("hjghjgjhghjgjhgjhgGGGGGGGGGGG");
	return "employeRegister";
}


	public void saveEmploye(){
		
		
		
	}
	
	
	

}
