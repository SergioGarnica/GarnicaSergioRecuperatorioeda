package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre {

	private Double velocidad=0.0;
	
	public Camion(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
