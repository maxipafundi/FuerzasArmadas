package edu.unlam.pb2;

public class Submarino extends Vehiculo implements Acuatico {

	private String modelo;
	private double profundidad = 30.0;
	
	
	public Submarino(Integer codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
	}

	
	
	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
