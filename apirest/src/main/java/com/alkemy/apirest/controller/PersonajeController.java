package com.alkemy.apirest.controller;
import com.alkemy.apirest.model.Personaje;
import com.alkemy.apirest.service.PersonajeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonajeController {
	
	@Autowired
	private PersonajeService personajeServices;
	
	@GetMapping("api/personajeprueba")
	public List<Personaje> getPersonajes(){
		List<Personaje> listaPersonajes = new ArrayList<>();
		
		Personaje personaje = new Personaje();
		//personaje.setId(1);
		personaje.setEdad(20);
		personaje.setNombre("Mickey Mouse");
		personaje.setHistoria("");
		personaje.setImagen("");
		personaje.setPeso(12.3);
		personaje.setProyectos("Disney");
		
		listaPersonajes.add(personaje);
		
		return listaPersonajes;
	}
	
	@PostMapping("api/personajes")
	public Personaje guardarPersonaje(@RequestBody Personaje personaje){
		System.out.println(personaje);
		personajeServices.guardar(personaje);
		return personaje;
	}
	
	@GetMapping("api/personajes")
	public List<Personaje> obtener(){
		return personajeServices.obtenerTodosPersonajes();
	}
	
	@PutMapping("api/personajes")
	public void actualizarPersonaje(@RequestBody Personaje personaje){
		personajeServices.actualizar(personaje);
	}
	
	@DeleteMapping("api/personajes/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		personajeServices.eliminar(id);
	}
	
	
	@GetMapping("api/characters")
	public List<Personaje> buscarEdad(@RequestParam("data") Integer edad){
		if (edad!=0) {
			return personajeServices.buscarPorEdad(edad);	
		}else {
			return personajeServices.obtenerTodosPersonajes();
		}			
	}
	

}
