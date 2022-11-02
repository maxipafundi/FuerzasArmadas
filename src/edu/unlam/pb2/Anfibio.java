package edu.unlam.pb2;

public class Anfibio extends Vehiculo implements Acuatico , Terrestre{

	private double profundidad = 10.0;
	private double velocidad = 20.0;
	private String modelo;
	public Anfibio(Integer codigo , String modelo) {
		super(codigo);
		this.modelo = modelo;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}
	
	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
