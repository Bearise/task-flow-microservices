package com.beatrizrios.TaskManager.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="usuario")
public class Usuario {
	
	@Id //Con esto indicamos que es clave primaria 
	@GeneratedValue(strategy=GenerationType.IDENTITY) //autoincremental
	private int id;
	private String username;
	private String password;
	private String nombre;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int id, String username, String password, String nombre) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
