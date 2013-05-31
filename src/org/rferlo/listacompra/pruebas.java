package org.rferlo.listacompra;

import java.util.Vector;

import org.rferlo.listacompra.controlador.Base;
import org.rferlo.listacompra.modelo.Unidad;

public class pruebas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Arrancar el entorno
		Base.InicializaEntorno();
		System.out.println(Base.getListaUnidades());
		
		Vector<Unidad> v = Base.getListaUnidadesEmpiezaPor("g");
		System.out.println("UNIDADES QUE CONTIENEN G");
		for(Unidad u: v) {
			System.out.println(u.toString());
		}
		

	}

}
