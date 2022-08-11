package com.alkemy.apirest.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="generos")
public class Genero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String imagen;
	private String proyectos;
	
	public Genero() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public String getProyectos() {
		return proyectos;
	}
	
	public void setProyectos(String proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombre=" + nombre + ", imagen=" + imagen + ", proyectos="
				+ proyectos + "]";
	}
	
	
}
