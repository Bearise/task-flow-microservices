package com.beatrizrios.TaskManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beatrizrios.TaskManager.persistence.entities.Tipo;
import com.beatrizrios.TaskManager.services.TipoService;

@RestController
@RequestMapping("/tipos")
public class TipoRestController {
	
	@Autowired
	private TipoService tipoService;
	
	@GetMapping
	private ResponseEntity<?> getTipos(){
		
		List<Tipo> tipos = tipoService.getTipos();
		return ResponseEntity.ok(tipos);
	}
	
	@PostMapping
	private ResponseEntity<?> addTipo(@RequestBody Tipo tipo){
		Tipo t = tipoService.addTipo(tipo);
		return ResponseEntity.ok(t);
		
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteTipo(@PathVariable int id){
		Tipo t = tipoService.deleteTipo(id);
		return ResponseEntity.ok(t);
	}
	

}
