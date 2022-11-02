package edu.unlam.pb2;

public class Portaviones extends Vehiculo implements Acuatico {

	private String modelo;
	private double profundidad = 10.0;

	public Portaviones(Integer codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
