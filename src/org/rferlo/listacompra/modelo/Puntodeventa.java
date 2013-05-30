package org.rferlo.listacompra.modelo;

/**
 * @author rferlo
 * Puntos de venta
 */
public class Puntodeventa {
	
	/**
	 * Nombre del punto de venta
	 */
	private String nombre;
	/**
	 * Dirección del punto de venta
	 */
	private String direccion;
	/**
	 * Código Postal
	 */
	private String codpostal;
	/**
	 * Población del punto de venta
	 */
	private String poblacion;
	/**
	 * Provincia del punto de venta
	 */
	private String provincia;
	/**
	 * Latitud del punto de venta para localizarlo en Maps
	 */
	private double latitud;
	/**
	 * Longitud del punto de venta para localizarlo en Maps
	 */
	private double longitud;
	private CategoriaPuntodeventa categoria;
	

	
	
	/************************************
	* CONSTRUCTORES                     *
	*************************************/

	/**
	 * @param nombre del punto de venta
	 */
	public Puntodeventa(String nombre) {
		this.nombre = nombre;
		this.direccion = null;
		this.codpostal = null;
		this.poblacion = null;
		this.provincia = null;
		this.latitud = 0;
		this.longitud = 0;
	}



	/************************************
	* GETTERS Y SETTERS                 *
	*************************************/

	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getCodpostal() {
		return codpostal;
	}




	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}




	public String getPoblacion() {
		return poblacion;
	}




	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}




	public String getProvincia() {
		return provincia;
	}




	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}




	public double getLatitud() {
		return latitud;
	}




	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}




	public double getLongitud() {
		return longitud;
	}




	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}




	public CategoriaPuntodeventa getCategoria() {
		return categoria;
	}




	public void setCategoria(CategoriaPuntodeventa categoria) {
		this.categoria = categoria;
	}


	
	
	
}
