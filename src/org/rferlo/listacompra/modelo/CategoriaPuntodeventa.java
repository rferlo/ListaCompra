/**
 * 
 */
package org.rferlo.listacompra.modelo;

import org.rferlo.listacompra.modelo.interfaces.Categoria;
import org.rferlo.listacompra.modelo.interfaces.Localizable;

/**
 * @author Rafa
 *
 */
public class CategoriaPuntodeventa implements Categoria, Localizable {

	private String nombre;
	private String abreviatura;
	
	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#getAbreviatura()
	 */
	@Override
	public String getAbreviatura() {
		return abreviatura;
	}

	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#setNombre(java.lang.String)
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#setAbreviatura(java.lang.String)
	 */
	@Override
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#empiezapor(java.lang.String)
	 */
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

	/* (non-Javadoc)
	 * @see org.rferlo.listacompra.modelo.Categoria#contiene(java.lang.String)
	 */
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

}
