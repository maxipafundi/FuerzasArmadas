package edu.unlam.pb2;

public class Tanque extends Vehiculo implements Terrestre {

	private String modelo;
	private double velocidad = 30.0;
	
	
	public Tanque(Integer codigo , String modelo) {
		super(codigo);
		this.modelo = modelo;
		
	}

	
	

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
}
