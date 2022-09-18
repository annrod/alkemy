package com.alkemy.apirest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alkemy.apirest.model.Pelicula;
import com.alkemy.apirest.repository.PeliculaRepository;

@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository;
	
	public List<Pelicula>obtenerTodasPeliculas(){
		return peliculaRepository.findAll();
	}

	public void guardar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}
	
	
	public void actualizar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}
	
	public void eliminar(Integer id) {
		peliculaRepository.deleteById(id);
	}
	
	
}
