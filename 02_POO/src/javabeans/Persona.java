package javabeans;
/*
 * Notaciones javabean es un convenio java sobre la creacion de objetos simples
 * tambien llamados POJOS (Plain Old Java Object)
 * Basicamente son objetos sencillos que no tienen herencia ni logica complicada
 * Para hacer una clase javabean es atributos privados y metodos accesores y
 * modificadores publicados, tambien llamados, getters/setters
 */
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		setEdad(edad);
		this.peso = peso;
	
	}
	
	//boton derecho y Source > Generate Getters and Setters
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
		if(edad < 0) edad = 0;
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	//boton derecho Source>Generate toString, @Override es una anotacion de control, cambia el comportamiento que tiene por defecto el metodo
	//toString que viene de la clase padre
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
}
