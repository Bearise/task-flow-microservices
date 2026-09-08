package com.beatrizrios.TaskManager.services;

import java.util.List;

import com.beatrizrios.TaskManager.persistence.entities.Tarea;

public interface TareaService {
	
	public List<Tarea> deleteTareaByUsuarioId(int id);
	public List<Tarea> deleteTareaByTipoId(int id);

}
