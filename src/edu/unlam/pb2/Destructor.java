package edu.unlam.pb2;

public class Destructor extends Vehiculo implements Terrestre {

	private String modelo;
	private double velocidad = 0.0;

	public Destructor(Integer codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
