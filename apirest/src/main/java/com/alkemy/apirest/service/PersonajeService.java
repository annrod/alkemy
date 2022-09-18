package com.alkemy.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alkemy.apirest.model.Personaje;
import com.alkemy.apirest.repository.PersonajeRepository;
import java.util.List;

@Service
public class PersonajeService {
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	public void guardar(Personaje personaje) {
		personajeRepository.save(personaje);
	}
	
	public List<Personaje>obtenerTodosPersonajes(){
		return personajeRepository.findAll();
	}
	
	public void actualizar(Personaje personaje) {
		personajeRepository.save(personaje);
	}
	
	public void eliminar(Integer id) {
		personajeRepository.deleteById(id);
	}
	
	public List<Personaje> buscarPorNombre(String nombre) {
		return personajeRepository.findByNombre(nombre);
	}
	
	public List<Personaje> buscarPorEdad(Integer edad) {
		return personajeRepository.findByEdad(edad);
	}
	
	public List<Personaje> buscarPorProyecto(String proyectos) {
		return personajeRepository.findByPeliculas_Series(proyectos);
	}

}
