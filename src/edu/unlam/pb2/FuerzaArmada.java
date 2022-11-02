package edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FuerzaArmada {

	private HashSet <Vehiculo> convoy = new HashSet();
	private HashMap <String, Batalla> batallas = new HashMap();
	private Set<Vehiculo> convoyListoParaLaBatalla = new HashSet();
	
	
	public void agregarVehiculo (Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
	}




	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}




	public void asignarBatalla(Batalla batallaAAsignar) {
		this.batallas.put(batallaAAsignar.getNombreDeLaBatalla(), batallaAAsignar);
		
	}

	
	public void presentarBatalla(Batalla batallaACombatir) {
		TipoDeBatalla tipoDeLaBatallaACombatir = batallaACombatir.getTipo();
		
		for (Vehiculo vehiculo : convoy) {
			switch (tipoDeLaBatallaACombatir) {
			case TERRESTRE:
				if(vehiculo instanceof Terrestre ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			case ACUATICA:
				if(vehiculo instanceof Acuatico ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			case AEREA:
				if(vehiculo instanceof Volador ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			}
		}
	}
	
	
	public Integer cantidadDeConvoyParaLaBatalla () {
		return this.convoyListoParaLaBatalla.size();
	}
	
	
	public void mostrarListaDeConvoy(){
		for (Vehiculo vehiculo : convoyListoParaLaBatalla) {
			 System.out.println(vehiculo);
		}
		
		
	}
	
	
	
	public boolean EnviarConvoyABatalla(Batalla batalla, Integer codigoVehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		TipoDeBatalla estiloDeBatalla = batalla.getTipo();
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getCodigo() == codigoVehiculo) {
				switch(estiloDeBatalla) {
				
				case TERRESTRE:
					
					if(vehiculo instanceof Terrestre) {
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
				case ACUATICA:
					
					if(vehiculo instanceof Acuatico) {
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
				case AEREA:
					
					if( vehiculo instanceof Volador) {
						return true;
					}  else {
						throw new VehiculoIncompatible();
					}
					
				}
				throw new VehiculoInexistente(); 
			}
			
		}
		return false;
		
		
		
	}

	
	
}
