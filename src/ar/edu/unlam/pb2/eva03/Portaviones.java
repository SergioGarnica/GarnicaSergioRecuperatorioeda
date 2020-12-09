package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico{
private Double profundidad;
	
	public Portaviones(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
