/**
 * 
 */
package org.rferlo.listacompra.modelo.interfaces;

/**
 * @author Rafa
 * Interface de las clases que deben ser localizables 
 * en tiempo real por el comienzo y contenido
 */
public interface Localizable {
	/**
	 * @param cadena a comparar
	 * @return true si el nombre o la abreviatura comienza por cadena
	 */
	public boolean empiezapor(String cadena);
	/**
	 * @param cadena a comparar
	 * @return true si el nombre o la abreviatura contienen la cadena
	 */
	public boolean contiene(String cadena);

}
