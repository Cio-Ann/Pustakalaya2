package org.cgruiz.pustakalaya2.model.fondos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private Long idAutor;

	private String nombre;

	private String apellidos;

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Autor() {}

	public Autor(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
