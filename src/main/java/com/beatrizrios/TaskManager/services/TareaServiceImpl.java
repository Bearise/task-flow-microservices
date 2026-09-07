package com.beatrizrios.TaskManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beatrizrios.TaskManager.persistence.entities.Tarea;
import com.beatrizrios.TaskManager.persistence.repositories.TareaRepository;

@Service
public class TareaServiceImpl implements TareaService{

	@Autowired
	private TareaRepository tareaRepository;
	
	@Override
	public List<Tarea> deleteTareaByUsuarioId(int id) {


		List<Tarea> tareas = tareaRepository.findAllByUsuario_id(id);
		
		for (Tarea t:tareas) {
			tareaRepository.delete(t);
		}
		
		return tareas;
	}
	
	

}
