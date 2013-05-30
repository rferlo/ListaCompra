package org.rferlo.listacompra.controlador;

import java.util.Vector;

import org.rferlo.listacompra.modelo.Unidad;

/**
 * @author rferlo
 * Clase de proposito multiple para gestionar
 * los objetos base de la aplicación y 
 * su carga y descarga de la memoria
 */
public class Base {
	
	/**
	 * La lista de unidades más habitual
	 */
	public static Vector<Unidad> listaUnidades;
	
	
	
	
	public static void InicializaEntorno() {
		cargaUnidades();
	}
	
	
	
	/**
	 * Carga en memoria las unidades habituales
	 */
	private static void cargaUnidades() {
		// Creamos un nuevo vector 
		listaUnidades = new Vector<Unidad>();
		
		// Cargamos
		listaUnidades.add(new Unidad("Gramo", "Gramos", "g"));
		listaUnidades.add(new Unidad("Kilogramo", "Kilogramos", "Kg"));
		listaUnidades.add(new Unidad("Unidad", "Unidades", null));
		listaUnidades.add(new Unidad("Litro", "Litros", null));
		listaUnidades.add(new Unidad("Decilitro", "Decilitros", "dl"));
		listaUnidades.add(new Unidad("Docena", "Docenas", null));
		listaUnidades.add(new Unidad("Bolsa", "Bolsas", null));
		listaUnidades.add(new Unidad("Lata", "Latas", null));
		listaUnidades.add(new Unidad("Paquete", "Paquetes", null));
		
		
	}
	
	
	public static String getListaUnidades() {
		if(null != listaUnidades) {
			StringBuffer sb = new StringBuffer();
			for(Unidad u: listaUnidades) {
				sb.append(u.toString());
				sb.append("\n");
			}
			return sb.toString();
		} else {
			return null;
		}
	}
	
	public static Vector<Unidad> getListaUnidadesEmpiezaPor(String cadena) {
		Vector<Unidad> v = new Vector<Unidad>();
		if(null != listaUnidades && !listaUnidades.isEmpty()) {
			for(Unidad u: listaUnidades) {
				if(u.empiezapor("g")) {
					v.add(u);
				}
			}
			return v;
		} else {
			return null;
		}
	}

}
