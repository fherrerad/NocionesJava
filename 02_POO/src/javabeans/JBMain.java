package javabeans;

public class JBMain {
	public static void main(String[] args) {
		Persona p = new Persona("Edu", 48, 70.8);
		p.setEdad(78);//aqui ya tiene una validacion que hemos puesto en la clase, en este caso que no se pueda meter un numero negativo
		System.out.println(p.getEdad());

		System.out.println(p);
	}

}
