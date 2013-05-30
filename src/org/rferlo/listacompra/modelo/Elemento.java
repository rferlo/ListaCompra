package org.rferlo.listacompra.modelo;

import java.util.Vector;

/**
 * @author rferlo
 * Cada uno de los elementos posibles
 * que pueden estar en una lista
 */
public class Elemento {
	
	public static String CADENA_ELEMENTO_VACIO = "*** ELEMENTO VACIO ***";
	/**
	 * El nombre del elemento 
	 */
	private String nombre;
	/**
	 * Categorias a las que pertenece el elemento
	 */
	private Vector<CategoriaElementos> categorias;
	
	/**
	 * La unidad preferida para el elemento
	 */
	private Unidad unidadpreferida;
	

	/**
	 * Añade una categoria al elemento
	 * @param cat
	 */
	public void anadeCategoria(CategoriaElementos cat) {
		// Comprobar si el vector está instanciado
		if(null == categorias) {
			categorias = new Vector<CategoriaElementos>();
		}
		// Si la categoria no es Null añadirsela.
		if(null != cat) {
			categorias.add(cat);
		} 
	}
	
	/**
	 * Quita una categoria al producto
	 * @param cat	Categoria a quitar
	 */
	public void quitaCategoria(CategoriaElementos cat) {
		// Comprobar si el vector está instanciado
		if(null != categorias) {
			categorias.remove(cat);
		}
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<CategoriaElementos> getCategorias() {
		return categorias;
	}

	public void setCategorias(Vector<CategoriaElementos> categorias) {
		this.categorias = categorias;
	}

	public Unidad getUnidadpreferida() {
		return unidadpreferida;
	}

	public void setUnidadpreferida(Unidad unidadpreferida) {
		this.unidadpreferida = unidadpreferida;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		// Si el nombre contiene algo lo añadimos
		if(null != nombre) {
			sb.append(nombre);
		}
		// Si tiene categorias las leemos y
		// las montamos en el formato Nombre/Abrev
		if(null != categorias) {
			sb.append(" (");
			for(CategoriaElementos cat: categorias) {
				sb.append(" " + cat.getNombre() + "/" + cat.getAbreviatura());
			}
			sb.append(" )");
		}
		// Comprobamos si hay algo que devolver y 
		// si no el texto predefinido
		if(sb.toString().length() == 0) {
			return Elemento.CADENA_ELEMENTO_VACIO;
		} else {
			return sb.toString();
		}
	}
	
	
	

}
