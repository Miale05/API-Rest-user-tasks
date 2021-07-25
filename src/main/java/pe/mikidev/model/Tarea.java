package pe.mikidev.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="Tarea")
public class Tarea implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTarea;
	
	@Column(name="tituloTarea", length=60, nullable=false)
	private String tituloTarea;
	
	@Column(name="descripcionTarea", length=60, nullable=false)
	private String descripcionTarea;
	
	@Column(name="fechaFin")
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate fechaFin;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario usuario;


	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Tarea(int idTarea, String tituloTarea, String descripcionTarea, LocalDate fechaFin, Usuario usuario) {
		super();
		this.idTarea = idTarea;
		this.tituloTarea = tituloTarea;
		this.descripcionTarea = descripcionTarea;
		this.fechaFin = fechaFin;
		this.usuario = usuario;
	}


	public int getIdTarea() {
		return idTarea;
	}


	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}


	public String getTituloTarea() {
		return tituloTarea;
	}


	public void setTituloTarea(String tituloTarea) {
		this.tituloTarea = tituloTarea;
	}


	public String getDescripcionTarea() {
		return descripcionTarea;
	}


	public void setDescripcionTarea(String descripcionTarea) {
		this.descripcionTarea = descripcionTarea;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
