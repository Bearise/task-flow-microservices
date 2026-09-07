package com.beatrizrios.TaskManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beatrizrios.TaskManager.persistence.entities.Usuario;
import com.beatrizrios.TaskManager.persistence.repositories.TareaRepository;
import com.beatrizrios.TaskManager.persistence.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private TareaService tareaService;
	

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuario(String username) {
		return usuarioRepository.findByUsername(username); 
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		Usuario usu = usuarioRepository.findByUsername(usuario.getUsername());
		
		if (usu != null) {
			usu.setNombre(usuario.getNombre());
			usu.setPassword(usuario.getPassword());
			return usuarioRepository.save(usu);
		}
		else {
			return null;
		}
	}

	@Override
	public Usuario deleteUsuario(String username) {
		Usuario usu = usuarioRepository.findByUsername(username);
		tareaService.deleteTareaByUsuarioId(usu.getId());
		usuarioRepository.delete(usu);;
		return usu;
	}
}
