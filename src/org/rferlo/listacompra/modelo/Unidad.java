package org.rferlo.listacompra.modelo;

import org.rferlo.listacompra.modelo.interfaces.Localizable;


/**
 * @author rferlo
 * Unidades para asignar a los elementos
 */
public class Unidad implements Localizable{
	
	/**
	 * El nombre largo de la unidad
	 */
	private String nombre;
	/**
	 * El nombre en plurar de la unidad
	 */
	private String plural;
	/**
	 * La abreviatura de la unidad 
	 */
	private String abreviatura;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(null != nombre) 
			sb.append(nombre);
		if(null != plural)
			sb.append("/" + plural);
		if(null != abreviatura)
			sb.append(" (" + abreviatura + ")");

		return sb.toString();
	}

	
	
	/************************************
	* CONSTRUCTORES                     *
	*************************************/
	public Unidad(String nombre, String plural, String abreviatura) {
		this.nombre = nombre;
		this.plural = plural;
		this.abreviatura = abreviatura;
	}
	
	/************************************
	* INTERFACE LOCALIZABLE             *
	*************************************/
	@Override
	public boolean empiezapor(String cadena) {
		if(null != nombre) {
			if(nombre.startsWith(cadena)) {
				return true;
			} else {
				if(null != abreviatura) {
					return abreviatura.startsWith(cadena);
				}
			}
		}
		return false;

	}

	@Override
	public boolean contiene(String cadena) {
		if(null != nombre) {
			if(nombre.contains(cadena)) {
				return true;
			} else {
				if(null != abreviatura) {
					return abreviatura.contains(cadena);
				}
			}
		}
		return false;
	}

	
	
	/************************************
	* GETTERS Y SETTERS                 *
	*************************************/
	
	public String getAbreviatura() {
		return abreviatura;
	}

	public String getNombre() {
		return nombre;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
