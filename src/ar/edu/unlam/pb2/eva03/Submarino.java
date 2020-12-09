package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {
private Double profundidad=0.0;
	public Submarino(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
