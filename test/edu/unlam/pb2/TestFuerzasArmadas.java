package edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFuerzasArmadas {

	@Test
	
	public void queSePuedaCrearUnObjetoVolador() {
		Avion avion = new Avion (1,"BC-2000");
		Double valorEsperado = 0.0;
		Double valorObtenido= avion.getAlturaDeVuelo();
		
		assertEquals(valorEsperado , valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Tanque tanque = new Tanque(5, "Renault FT");
		
		Double valorEsperado = 30.0;
		Double valorObtenido = tanque.getVelocidad();
		
		assertEquals(valorEsperado , valorObtenido);
		
	}
	
	@Test
	
	public void queSePuedaCrearUnObjetoAcuatico() {
		Submarino submarino = new Submarino(8, "ARA - San Juan");

		Double valorEsperado = 30.0;
		Double valorObtenido = submarino.getProfundidad();
		
		assertEquals(valorEsperado , valorObtenido);
	}
	
	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {

		Anfibio var = new Anfibio(12, "LARC-5");

		Double valorEsperadoVelocidad = 20.0;
		Double valorObtenidoVelocidad = var.getVelocidad();
		
		Double valorEsperadoProfundidad = 10.0;
		Double valorObtenidoProfundidad = var.getProfundidad();
		
		assertEquals(valorEsperadoProfundidad, valorObtenidoProfundidad);
		assertEquals(valorEsperadoVelocidad,valorObtenidoVelocidad );
	}
	
	@Test
	public void queSePuedaCrearUnHidroavion() {
		
		HidroAvion ag600 = new HidroAvion(12, "AG600");

		
		assertEquals(0.0, ag600.getAlturaDeVuelo(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}
	
	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();
		
		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));
		
		Integer valorEsperado = 12;
		assertEquals(valorEsperado, argentina.getCapacidadDeDefensa());
			
	}
	
	@Test
	public void queSePuedaCrearUnaBatalla() {
		FuerzaArmada argentina = new FuerzaArmada();
		Batalla sanLorenzo = new Batalla(100.0, 150.0 , "San Lorenzo" , TipoDeBatalla.TERRESTRE);
		
		argentina.asignarBatalla(sanLorenzo);
		
		String resultadoEsperado = "San Lorenzo";
		String resultadoObtenido = sanLorenzo.getNombreDeLaBatalla();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	
	@Test
	public void queSePuedaPresentarBatallaTerrestre() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Avion(1, "A-10"));
		argentina.agregarVehiculo(new Avion(2, "A-10"));
		argentina.agregarVehiculo(new Avion(3, "F-102"));
		argentina.agregarVehiculo(new Avion(4, "F-15"));
		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "Mitsubishi F1M"));
		argentina.agregarVehiculo(new Anfibio(12, "LARC-5"));

		Batalla sanLorenzo = new Batalla(100.0, 150.0 , "San Lorenzo" , TipoDeBatalla.TERRESTRE);

		argentina.asignarBatalla(sanLorenzo);

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));

		argentina.presentarBatalla(sanLorenzo);
		
		Integer valorEsperado = 5;
		Integer valorObtenido = argentina.cantidadDeConvoyParaLaBatalla();
		
		argentina.mostrarListaDeConvoy();
		
		assertEquals(valorEsperado, valorObtenido);

	}

	
	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnSubmarino() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Submarino(8, "ARA - San Juan"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		Batalla sanLorenzo = new Batalla(100.0, 150.0 , "San Lorenzo" , TipoDeBatalla.TERRESTRE);

		argentina.asignarBatalla(sanLorenzo);
		argentina.presentarBatalla(sanLorenzo);

		assertFalse(argentina.EnviarConvoyABatalla(sanLorenzo, 8));

	}
	
	
	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Tanque(5, "Renault FT"));
		argentina.agregarVehiculo(new Camion(6, "T-72"));
		argentina.agregarVehiculo(new Camion(7, "T-72"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));

		Batalla sanLorenzo = new Batalla(100.0, 150.0 , "San Lorenzo" , TipoDeBatalla.TERRESTRE);
		
		argentina.asignarBatalla(sanLorenzo);
		argentina.presentarBatalla(sanLorenzo);

		assertFalse(argentina.EnviarConvoyABatalla(sanLorenzo, 12));
	}
	
}



