package com.beatrizrios.TaskManager.services;

import java.util.List;

import com.beatrizrios.TaskManager.persistence.entities.Tipo;

public interface TipoService {
	
	public List<Tipo> getTipos();
	public Tipo addTipo(Tipo tipo);
	public Tipo deleteTipo(int id);

}
