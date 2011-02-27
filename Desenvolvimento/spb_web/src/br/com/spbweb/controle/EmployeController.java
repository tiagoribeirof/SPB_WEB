package br.com.spbweb.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class EmployeController {
	
	
	private String nameEmploye;
	
	private String password;
	



	public String getNameEmploye() {
		return nameEmploye;
	}




	public void setNameEmploye(String nameEmploye) {
		this.nameEmploye = nameEmploye;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public void logarUser(){
	         if(!nameEmploye.equals("")|| password.equals("")){
	        	 System.out.println("lllllllllllllllllllllllllllllllll");
	         }
	
	}

}
