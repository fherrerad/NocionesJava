
public class MainVariables {
	
	public static void main(String[] args) {
		//En java tenemos dos tipos de variables, primitivas y referencias
		
		//variables primitivas son aquellas que el valor se guarda dentro de la variable
		int entero1 = 10;
		double reales = 23.24;
		long enterosGrandes = 100_000_000_000L;
		boolean verdadero = true;
		boolean falso = false;
		
		System.out.println(enterosGrandes);
		
		//variables de referencia, las referencias apuntan a objetos
		//lo que gurarda la referencia es la posicion de memoria donde se guarda
		//el objeto (o los datos)
		String cadena = "Esto es una cadena de texto";
		
		cadena = cadena + " cadena aniadida";
		
		System.out.println(cadena);
		
	}

}
