package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Destructor(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
