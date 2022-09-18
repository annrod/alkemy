package com.alkemy.apirest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alkemy.apirest.model.Pelicula;
import com.alkemy.apirest.service.PeliculaService;

@RestController
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaServices;
	

	@PostMapping("api/movies")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula){
		
		peliculaServices.guardar(pelicula);
		return pelicula;
	}
	
	@GetMapping("api/movies")
	public List<Pelicula> obtener(){
		return peliculaServices.obtenerTodasPeliculas();
	}
	
	@PutMapping("api/movies")
	public void actualizarPersonaje(@RequestBody Pelicula pelicula){
		peliculaServices.actualizar(pelicula);
	}
	
	@DeleteMapping("api/movies/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		peliculaServices.eliminar(id);
	}
	
	

}
