package edu.unlam.pb2;

public class Avion extends Vehiculo implements Volador{

	private String modelo;
	private double alturaDeVuelo = 0.0;
	
	public Avion(int codigo , String modelo) {
		super(codigo);
		this.modelo = modelo;
		
		
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public Double getAlturaDeVuelo() {
		return this.alturaDeVuelo;
		
	}
	
	

}
