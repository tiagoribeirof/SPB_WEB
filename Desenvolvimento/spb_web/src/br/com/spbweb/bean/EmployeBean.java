package br.com.spbweb.bean;

public class EmployeBean {
	
	
	private Long idEmploye;
	
	private String nameEmploye;
	
	private String nickName;
	
	private String phoneCell;
	
	private String phoneRes;
	
	private String address;
	
	private String password;
	
	private String biometricPassword;	
	
	private RoleBean role;

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNameEmploye() {
		return nameEmploye;
	}

	public void setNameEmploye(String nameEmploye) {
		this.nameEmploye = nameEmploye;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoneCell() {
		return phoneCell;
	}

	public void setPhoneCell(String phoneCell) {
		this.phoneCell = phoneCell;
	}

	public String getPhoneRes() {
		return phoneRes;
	}

	public void setPhoneRes(String phoneRes) {
		this.phoneRes = phoneRes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBiometricPassword() {
		return biometricPassword;
	}

	public void setBiometricPassword(String biometricPassword) {
		this.biometricPassword = biometricPassword;
	}

	public RoleBean getRole() {
		return role;
	}

	public void setRole(RoleBean role) {
		this.role = role;
	}
	
	
	
	
	

}
