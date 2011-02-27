package br.com.spbweb.modelo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="TB_ALLOWANCES")
public class Allowance {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="sqAllowance")
	@SequenceGenerator(name="sqAllowance", sequenceName="SEQ_ALLOWANCES")
	@Column(name="ID_ALLOWANCES")
	private Long idAllowance;
	
	@Column(name="TIME_ALLOWANCE")
	private Timestamp timeAllowance;
	
	@Column(name="TIME_TOLERED")
	private Timestamp timeTolered;
	
	@Column(name="DATE_ALLOWANCE")
	private Date dateAllowance;
	
	@Column(name="DS_JUSTIFICATION")
	private String dsJustification;

	public Long getIdAllowance() {
		return idAllowance;
	}

	public void setIdAllowance(Long idAllowance) {
		this.idAllowance = idAllowance;
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

	public Date getDateAllowance() {
		return dateAllowance;
	}

	public void setDateAllowance(Date dateAllowance) {
		this.dateAllowance = dateAllowance;
	}

	public String getDsJustification() {
		return dsJustification;
	}

	public void setDsJustification(String dsJustification) {
		this.dsJustification = dsJustification;
	}
	
	

}
