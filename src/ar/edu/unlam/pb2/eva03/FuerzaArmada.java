package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {
    
	private Set<Vehiculo> convoy= new HashSet<Vehiculo>();
	private Map<String, Batalla> batallas= new HashMap<String, Batalla>();
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		if(!(convoy.contains(vehiculo))) {
			
			convoy.add(vehiculo);
			
			
		}
		
	}

	public Integer getCapacidadDeDefensa() {
		
		return convoy.size() ;
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Map<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public void crearBatalla(String nombre, TipoDeBatalla terrestre, double latitud, double longitud) {
		batallas.put(nombre, new Batalla(latitud,longitud,terrestre));
		
	}

	public Batalla getBatalla(String nombre) {
		
		return batallas.get(nombre);
	}

	public boolean enviarALaBatalla(String string, int i)throws VehiculoIncompatible,VehiculoInexistente {
		Batalla batalla=batallas.get(string);
	
		return false;
	} 

	
   }

