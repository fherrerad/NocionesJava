package ejemplo1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	//arrancamos nuestro contenedor de objetos de Spring
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		//manera clasica, Spring NO esta llevando el control de este objeto
		Persona p = new Persona();
		p.setNombre("Homer J. Simpson");
		p.setEdad (37);
		p.setPeso(75);
		
		Persona lisa = context.getBean("lisa",Persona.class);
		System.out.println(lisa.getNombre());
		
		//ojo, los prototype cuando Spring te devuelve la referencia al objeto
		//ya depende de ti el ciclo de vida
		Persona p2 = context.getBean("personaGenerica",Persona.class);
		p2.setNombre("Bart Simpson");
		
		ArrayList<Persona> listaPersonas = context.getBean("arrayPersonas", ArrayList.class);
		listaPersonas.add(p2);
		System.out.println(listaPersonas);
		mostrarPersona(p);
		
	}

	private static void mostrarPersona(Persona p) {
		imprimirPersona(p);
		
	}
	
	private static void imprimirPersona(Persona p) {
		System.out.println(p);
		Persona p2 = context.getBean("lisa",Persona.class);
		
		
	}

}
