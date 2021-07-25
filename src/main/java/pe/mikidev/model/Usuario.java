package pe.mikidev.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name="nombresUsuario", length=60, nullable=false)
	private String nombresUsuario;
	
	@Column(name="maternoUsuario", length=60, nullable=false)
	private String maternoUsuario;
	
	@Column(name="paternoUsuario", length=60, nullable=false)
	private String paternoUsuario;
	
	@Column(name="fechaNacimiento")
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate fechaNacimiento;

	@Column(name="correoUsuario", length=60, nullable=false)
	private String correoUsuario;
	
	@Column(name="ocupacionUsuario", length=60, nullable=false)
	private String ocupacionUsuario;

	public Usuario() {
		super();
		
	}

	public Usuario(int idUsuario, String nombresUsuario, String maternoUsuario, String paternoUsuario,
			LocalDate fechaNacimiento, String correoUsuario, String ocupacionUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombresUsuario = nombresUsuario;
		this.maternoUsuario = maternoUsuario;
		this.paternoUsuario = paternoUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.correoUsuario = correoUsuario;
		this.ocupacionUsuario = ocupacionUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombresUsuario() {
		return nombresUsuario;
	}

	public void setNombresUsuario(String nombresUsuario) {
		this.nombresUsuario = nombresUsuario;
	}

	public String getMaternoUsuario() {
		return maternoUsuario;
	}

	public void setMaternoUsuario(String maternoUsuario) {
		this.maternoUsuario = maternoUsuario;
	}

	public String getPaternoUsuario() {
		return paternoUsuario;
	}

	public void setPaternoUsuario(String paternoUsuario) {
		this.paternoUsuario = paternoUsuario;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getOcupacionUsuario() {
		return ocupacionUsuario;
	}

	public void setOcupacionUsuario(String ocupacionUsuario) {
		this.ocupacionUsuario = ocupacionUsuario;
	}
	
	
}
