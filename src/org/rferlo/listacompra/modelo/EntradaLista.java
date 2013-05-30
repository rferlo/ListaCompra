package org.rferlo.listacompra.modelo;

import java.util.Date;

public class EntradaLista {
	
	/**
	 * Elemento que tiene la entrada 
	 */
	private Elemento elemento;
	/**
	 * Unidades en la que está expresada la cantidad
	 */
	private Unidad unidad;
	/**
	 * Cantidad que hay que comprar
	 */
	private Float cantidad;
	/**
	 * Fecha y hora en la que se ha dado de alta la entrada 
	 */
	private Date FechaHoraAlta;
	
	
	
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	public Unidad getUnidad() {
		return unidad;
	}
	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	public Float getCantidad() {
		return cantidad;
	}
	public void setCantidad(Float cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaHoraAlta() {
		return FechaHoraAlta;
	}
	public void setFechaHoraAlta(Date fechaHoraAlta) {
		FechaHoraAlta = fechaHoraAlta;
	}

	
	
	
	

}
