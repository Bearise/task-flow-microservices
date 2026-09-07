package com.beatrizrios.TaskManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beatrizrios.TaskManager.persistence.entities.Usuario;
import com.beatrizrios.TaskManager.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping 
	private ResponseEntity<?> getUsuarios(){
		List<Usuario> usuarios = usuarioService.getUsuarios();
		return ResponseEntity.ok(usuarios);
		
	}
	
	@GetMapping("/{username}")
	private ResponseEntity<?> getUsuario(@PathVariable String username){
		Usuario usuario = usuarioService.getUsuario(username);
		return ResponseEntity.ok(usuario);
	}
	
	@PutMapping
	private ResponseEntity<?> updateUsuario(@RequestBody Usuario usuario){
		Usuario usu = usuarioService.updateUsuario(usuario);
		return ResponseEntity.ok(usuario);
	}

	@DeleteMapping("/{username}")
	private ResponseEntity<?> deleteUsuario(@PathVariable String username){
		Usuario usu = usuarioService.deleteUsuario(username);
		return ResponseEntity.ok(usu);
		
		
	}
}
