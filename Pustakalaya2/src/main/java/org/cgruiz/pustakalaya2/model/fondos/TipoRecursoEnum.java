package org.cgruiz.pustakalaya2.model.fondos;

public enum TipoRecursoEnum {
	/**
	 * DESCONOCIDO: Sin especificar.
	 */
	DESCONOCIDO("Sin especificar"), 
	/**
	 * LIBRO: Libro.
	 */
	LIBRO("Libro"),
	/**
	 * PUBLICACION_PERIODICA: Publicacion periódica.
	 */
	PUBLICACION_PERIODICA("Publicación periódica"),
	/**
	 * AUDIOVISUAL: Material audiovisual.
	 */
	AUDIOVISUAL("Material audiovisual");
	
	/**
	 * Campo que contiene la descripción del tipo de recurso.
	 */
	private final String nombre;

	/**
	 * Constructor.
	 * 
	 * @param nombre
	 */
	private TipoRecursoEnum(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método para recuperar el nombre.
	 *  
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
}
}
