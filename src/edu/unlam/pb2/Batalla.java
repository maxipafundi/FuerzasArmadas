package edu.unlam.pb2;

import java.util.Set;

public class Batalla {

	private Double latitud;
	private Double longitud;
	private String nombreDeLaBatalla;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(Double latitud, Double longitud, String nombreDeLaBatalla, TipoDeBatalla tipo) {
		
		this.latitud = latitud;
		this.longitud = longitud;
		this.nombreDeLaBatalla = nombreDeLaBatalla;
		this.tipo = tipo;
	}

	

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getNombreDeLaBatalla() {
		return nombreDeLaBatalla;
	}

	public void setNombreDeLaBatalla(String nombreDeLaBatalla) {
		this.nombreDeLaBatalla = nombreDeLaBatalla;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}
	
	
	
	
	
}
