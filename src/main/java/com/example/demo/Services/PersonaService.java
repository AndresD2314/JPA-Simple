package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.Repository;
import com.example.demo.Entities.Persona;

@Service
public class PersonaService {

    @Autowired
    private Repository repository;

    public List<Persona> getPersonas() {
        return repository.findAll();
    }

    public Persona createPersona(Persona persona) {
        return repository.save(persona);
    }

    public Persona updatePersona(Persona persona) {
        return repository.save(persona);
    }

    public void deletePersonaById(Long id) {
        repository.deleteById(id);
    }
}
