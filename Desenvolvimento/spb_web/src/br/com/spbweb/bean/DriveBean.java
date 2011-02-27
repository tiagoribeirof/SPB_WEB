package br.com.spbweb.bean;


import java.sql.Timestamp;
import java.util.Date;

public class DriveBean {
	
	
	private Long idDrive;
	
	private Timestamp timeDrive;
	
	private String flAdjust;
	
	private Date dateDrive;
	
	private String dsJustification;
	
	private EmployeBean employe;

	public Long getIdDrive() {
		return idDrive;
	}

	public void setIdDrive(Long idDrive) {
		this.idDrive = idDrive;
	}

	public Timestamp getTimeDrive() {
		return timeDrive;
	}

	public void setTimeDrive(Timestamp timeDrive) {
		this.timeDrive = timeDrive;
	}

	public String getFlAdjust() {
		return flAdjust;
	}

	public void setFlAdjust(String flAdjust) {
		this.flAdjust = flAdjust;
	}

	public Date getDateDrive() {
		return dateDrive;
	}

	public void setDateDrive(Date dateDrive) {
		this.dateDrive = dateDrive;
	}

	public String getDsJustification() {
		return dsJustification;
	}

	public void setDsJustification(String dsJustification) {
		this.dsJustification = dsJustification;
	}

	public EmployeBean getEmploye() {
		return employe;
	}

	public void setEmploye(EmployeBean employe) {
		this.employe = employe;
	}
	
	
	

}
