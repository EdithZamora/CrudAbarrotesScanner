
public class Productos {
	//atributos de mi objeto
	long codigoBarras;
	String nombre;
	String marca;
	float precio;
	float existencia;
	int status;
	//constructor basio
	public Productos() {
	}
	//costructor con parametros
	public Productos(long codigoBarras, String nombre, String marca, float precio, float existencia, int status) {
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.existencia = existencia;
		this.status = status;
	}
	//toString
	@Override
	public String toString() {
		return "Productos [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", marca=" + marca + ", precio="
				+ precio + ", existencia=" + existencia + ", status=" + status + "]\n";
	}
	
	//getters and setters
	public long getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getExistencia() {
		return existencia;
	}
	public void setExistencia(float existencia) {
		this.existencia = existencia;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
	
	

}
