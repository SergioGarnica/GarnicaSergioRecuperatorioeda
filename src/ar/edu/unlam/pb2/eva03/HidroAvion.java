package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{
private Double altura=0.0;
private Double profundidad=0.0;
	public HidroAvion(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
