package com.beatrizrios.TaskManager.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.beatrizrios.TaskManager.persistence.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	
	public Usuario findByUsername(String username);

}
