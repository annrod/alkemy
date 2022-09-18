package com.alkemy.apirest.repository;
import com.alkemy.apirest.model.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer>{

	@Query("SELECT p FROM Personaje p WHERE " + "p.nombre LIKE CONCAT('%',:nombre, '%')")
	List<Personaje> findByNombre(String nombre);
	
	@Query("SELECT p FROM Personaje p WHERE " + "p.edad LIKE CONCAT('%',:edad, '%')")
	List<Personaje> findByEdad(Integer edad);
	
	@Query("SELECT p FROM Personaje p WHERE " + "p.proyectos LIKE CONCAT('%',:proyectos, '%')")
	List<Personaje> findByPeliculas_Series(String proyectos);

}
