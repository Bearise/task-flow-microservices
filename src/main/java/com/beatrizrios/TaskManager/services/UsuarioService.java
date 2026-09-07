package com.beatrizrios.TaskManager.services;

import java.util.List;

import com.beatrizrios.TaskManager.persistence.entities.Usuario;

public interface UsuarioService {
	
	public List<Usuario> getUsuarios();
	public Usuario getUsuario(String username);
	public Usuario updateUsuario(Usuario usuario);
	public Usuario deleteUsuario(String username);

}
