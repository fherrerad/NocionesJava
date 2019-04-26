package ejemplo1;

/*
 * Normalmente una clase que queremos que sea manejada por Spring
 * debe de tener el constructor por defecto
 * Tambien debe de seguir la convencion javabean (atributos privados y getters,setters publicos)
 */

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	
}
