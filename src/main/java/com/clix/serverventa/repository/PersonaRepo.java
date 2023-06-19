package com.clix.serverventa.repository;

import com.clix.serverventa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Integer> {
}
