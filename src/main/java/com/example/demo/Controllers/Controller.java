package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.Persona;
import com.example.demo.Services.PersonaService;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private PersonaService repository;

    // GET
    @GetMapping
    public List<Persona> getPersonas() {
        return repository.getPersonas();
    }

    // POST
    @PostMapping
    public Persona createPersona(@RequestBody Persona persona) {
        return repository.createPersona(persona);
    }

    // PUT
    @PutMapping("editar/{id}")
    public Persona updatePersona(@RequestBody Persona persona, @PathVariable Long id) {
        persona.setId(id);
        return repository.updatePersona(persona);
    }

    // DELETE
    @DeleteMapping("eliminar/{id}")
    public void deletePersonaById(@PathVariable Long id) {
        repository.deletePersonaById(id);
    }

}
