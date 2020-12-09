package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {
private Double velocidad=0.0;
private Double profundidad=0.0;
	public Anfibio(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
