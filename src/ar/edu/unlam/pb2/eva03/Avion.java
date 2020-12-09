package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {
private Double altura=0.0;
	public Avion(Integer codigoDeVehiculo, String nombre) {
		super(codigoDeVehiculo, nombre);
		
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}

}
