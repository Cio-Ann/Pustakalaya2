package org.cgruiz.pustakalaya2.model.fondos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Idioma {
	/**
	 * Identificador.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_idioma")
	private Long idIdioma;

	/**
	 * Nombre.
	 */
	@Column(nullable = false, unique = true)
	private String nombre;

	/**
	 * Descripción.
	 */
	private String descripcion;

	/**
	 * @return the idIdioma
	 */
	public Long getIdIdioma() {
		return idIdioma;
	}

	/**
	 * @param idIdioma the idIdioma to set
	 */
	public void setIdIdioma(Long idIdioma) {
		this.idIdioma = idIdioma;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Constructor por defecto.
	 */
	public Idioma() {
	}

	/**
	 * Constructor por parámetros.
	 * 
	 * @param nombre
	 * @param descripcion
	 */
	public Idioma(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Idioma [idIdioma=" + idIdioma + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
