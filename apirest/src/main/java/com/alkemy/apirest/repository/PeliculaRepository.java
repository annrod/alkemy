package com.alkemy.apirest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.alkemy.apirest.model.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

	@Query("SELECT p FROM Pelicula p WHERE " + "p.titulo LIKE CONCAT('%',:titulo, '%')")
	List<Pelicula> findByTitulo(String titulo);
}
