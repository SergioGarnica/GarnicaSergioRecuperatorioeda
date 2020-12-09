package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
private Integer codigoDeVehiculo;
private String nombre;
public Vehiculo(Integer codigoDeVehiculo, String nombre) {
	
	this.codigoDeVehiculo = codigoDeVehiculo;
	this.nombre = nombre;
}
public Integer getCodigoDeVehiculo() {
	return codigoDeVehiculo;
}
public void setCodigoDeVehiculo(Integer codigoDeVehiculo) {
	this.codigoDeVehiculo = codigoDeVehiculo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((codigoDeVehiculo == null) ? 0 : codigoDeVehiculo.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehiculo other = (Vehiculo) obj;
	if (codigoDeVehiculo == null) {
		if (other.codigoDeVehiculo != null)
			return false;
	} else if (!codigoDeVehiculo.equals(other.codigoDeVehiculo))
		return false;
	return true;
}

}
