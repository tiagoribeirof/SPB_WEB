package br.com.spbweb.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_EMPLOYEE")
@NamedQueries({
	 @NamedQuery(name = "pesquisaLogin", query = "SELECT e FROM "
	        + "Employee e WHERE e.nickName = :nickname and e.password = :password")})

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator ="sqEmployee")
	@SequenceGenerator(name = "sqEmployee", sequenceName="SEQ_EMPLOYEE")
	@Column(name="ID_EMPLOYEE")
	private Long idEmploye;
	
	@Column(name="NM_EMPLOYE")
	private String nm_employe;
	
	@Column(name="BIOMETRIC_PASSWORD")
	private String biometricPassword;
	
	private String password;
	
	@Column(name="PHONE_RES")
	private String resPhone;
	
	@Column(name="PHONE_CEL")
	private String celPhone;
	
	private String registration;
	
	
    private String nickName;
    
    private String address;
    
    @ManyToOne
    @JoinColumn(name="PID_ROLE")
    private Role role;

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNm_employe() {
		return nm_employe;
	}

	public void setNm_employe(String nm_employe) {
		this.nm_employe = nm_employe;
	}

	public String getBiometricPassword() {
		return biometricPassword;
	}

	public void setBiometricPassword(String biometricPassword) {
		this.biometricPassword = biometricPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResPhone() {
		return resPhone;
	}

	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}

	public String getCelPhone() {
		return celPhone;
	}

	public void setCelPhone(String celPhone) {
		this.celPhone = celPhone;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
    
    
}
