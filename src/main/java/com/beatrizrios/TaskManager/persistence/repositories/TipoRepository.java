package com.beatrizrios.TaskManager.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beatrizrios.TaskManager.persistence.entities.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer>{

}
