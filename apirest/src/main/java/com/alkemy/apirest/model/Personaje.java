package com.alkemy.apirest.model;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ana_Rodriguez
**/
@Entity
@Table(name="personajes")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String imagen;
	private String nombre;
	private Integer edad;
	private Double peso;
	private String historia;
	private String proyectos;
	
	public Personaje() {
	}
	
	public Personaje(String nombre) {
		this.nombre=nombre;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getHistoria() {
		return historia;
	}
	
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	
	public String getProyectos() {
		return proyectos;
	}
	
	public void setProyectos(String proyectos) {
		this.proyectos = proyectos;
	}

	@Override
	public String toString() {
		return "Personaje [id=" + id + ", imagen=" + imagen + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso
				+ ", historia=" + historia + ", proyectos=" + proyectos + "]";
	}
}
