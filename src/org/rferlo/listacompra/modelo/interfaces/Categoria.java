package org.rferlo.listacompra.modelo.interfaces;

/**
 * @author rferlo
 * El interface para las categorias de todo tipo
 */
public interface Categoria {
	
	// Pruebas
	
	
	/**
	 * @return Nombre de la categoria
	 */
	public String getNombre();
	/**
	 * @return Abreviatura de la categoria
	 */
	public String getAbreviatura();
	/**
	 * @param Nombre para la categoria
	 */
	public void setNombre(String nombre);
	/**
	 * @param abreviatura de la categoria
	 */
	public void setAbreviatura(String abreviatura);
	

}
