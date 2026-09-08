package com.beatrizrios.TaskManager.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beatrizrios.TaskManager.persistence.entities.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>{
	
	public List<Tarea>findAllByUsuario_id(int id);
	public List<Tarea> findAllByTipo_id(int id);

}
