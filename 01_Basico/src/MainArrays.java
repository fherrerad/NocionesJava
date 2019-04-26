
public class MainArrays {
	public static void main(String[] args) {
		int numero = 5;//los arrays pueden ser de cualquier tipo
		int [] arrayNumeros = new int [5];
		//este tipo de arrays son arrays estaticos, es decir,
		//una vez inicializado el array a un tamano, siempre sera ese tamano (no crece)
		arrayNumeros[0] = 23;
		arrayNumeros[1] = 45;
		
		
		//recorrer un array
		for(int i=0;i < arrayNumeros.length;i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		//recorrer un array (manera mas sencilla)
		for(int i : arrayNumeros ) {
			System.out.println(i);
		}
			
	}

}
