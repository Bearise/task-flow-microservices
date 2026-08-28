package com.beatrizrios.TaskManager.persistence.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="tarea")
public class Tarea {
	@Id //Con esto indicamos que es clave primaria 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String titulo;
	private String resumen;
	private LocalDate fecha;
	private boolean realizada;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="tipo_id")
	private Tipo tipo;

	public Tarea() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tarea(int id, String titulo, String resumen, LocalDate fecha, boolean realizada) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.resumen = resumen;
		this.fecha = fecha;
		this.realizada = realizada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	

}
