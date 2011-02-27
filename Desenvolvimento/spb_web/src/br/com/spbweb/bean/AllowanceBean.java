package br.com.spbweb.bean;

import java.sql.Timestamp;
import java.util.Date;

public class AllowanceBean {
	
	
	private Long idAllowance;
	
	private Date dateAllowance;
	
	private Timestamp timeAllowance;
	
	private Timestamp timeTolered;
	
	private String dsJustification;

	public Long getIdAllowance() {
		return idAllowance;
	}

	public void setIdAllowance(Long idAllowance) {
		this.idAllowance = idAllowance;
	}

	public Date getDateAllowance() {
		return dateAllowance;
	}

	public void setDateAllowance(Date dateAllowance) {
		this.dateAllowance = dateAllowance;
	}

	public Timestamp getTimeAllowance() {
		return timeAllowance;
	}

	public void setTimeAllowance(Timestamp timeAllowance) {
		this.timeAllowance = timeAllowance;
	}

	public Timestamp getTimeTolered() {
		return timeTolered;
	}

	public void setTimeTolered(Timestamp timeTolered) {
		this.timeTolered = timeTolered;
	}

	public String getDsJustification() {
		return dsJustification;
	}

	public void setDsJustification(String dsJustification) {
		this.dsJustification = dsJustification;
	}
	
	
	

}
