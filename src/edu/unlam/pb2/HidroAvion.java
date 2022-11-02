package edu.unlam.pb2;

public class HidroAvion extends Vehiculo implements Acuatico , Volador {

	private String modelo;
	private double alturaDeVuelo = 0.0;
	private double profundidad = 0.0;
	
	public HidroAvion(Integer codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
		
		
	}

	@Override
	public Double getAlturaDeVuelo() {
		// TODO Auto-generated method stub
		return this.alturaDeVuelo;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}

}
