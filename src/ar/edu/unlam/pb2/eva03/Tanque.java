package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
private Double velocidad=0.0;
	public Tanque(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
