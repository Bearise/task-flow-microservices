package com.beatrizrios.TaskManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beatrizrios.TaskManager.persistence.entities.Tipo;
import com.beatrizrios.TaskManager.persistence.repositories.TipoRepository;

@Service
public class TipoServiceImpl implements TipoService{
	
	@Autowired
	private TipoRepository tipoRepository;
	
	@Autowired
	private TareaService tareaService;

	@Override
	public List<Tipo> getTipos() {
		return tipoRepository.findAll();
	}

	@Override
	public Tipo addTipo(Tipo tipo) {
		return tipoRepository.save(tipo);
	}

	@Override
	public Tipo deleteTipo(int id) {

		tareaService.deleteTareaByTipoId(id);
		
		Tipo t = tipoRepository.findById(id).orElse(null);
		
		if (t != null) {
			tipoRepository.delete(t);
		}
		
		return t;
	}

}
