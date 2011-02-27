package br.com.spbweb.modelo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_DRIVE")
public class Drive {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sqDrive")
	@SequenceGenerator(name="sqDrive", sequenceName="SEQ_DRIVE")
	@Column(name="ID_DRIVE")
	private Long idDrive;

	@Column(name="TIME_DRIVE")
	private Timestamp driveTime;
	
	@Column(name="FL_ADJUST")
	private String flAdjust;
	
	@Column(name="DATE_DRIVE")
	private Date dateDrive;

	@Column(name="DS_JUSTIFICATION")
	private String dsJustification;
	
	@ManyToOne
	@JoinColumn(name="PID_EMPLOYEE")
	private Employee employe;

	public Long getIdDrive() {
		return idDrive;
	}

	public void setIdDrive(Long idDrive) {
		this.idDrive = idDrive;
	}

	public Timestamp getDriveTime() {
		return driveTime;
	}

	public void setDriveTime(Timestamp driveTime) {
		this.driveTime = driveTime;
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

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}
	
	
}
