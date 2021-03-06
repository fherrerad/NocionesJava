package entidades;

/**
 * Intefaz que hace que los objetos se puedan mover. Cada objeto se movera
 * como corresponda
 * 
 * @author Felix
 * @version 1.0
 * @since 24/04/2019
 *
 */
public interface Movible {
	//en las interfaces no podemos declarar atributos, los atributos que declaremos son constantes
	//en una interfaces los metodos siempre son abstractos y publicos
	int i = 5;//es una constante
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas lenta posible
	 */
	public void moverseLento();
	/**
	 * Este metodo hace que el objeto se mueva de la manera mas rapida posible
	 */
	public void moverseRapido();
	/**
	 * Este metodo hace que el objeto se mueva una cantidad de metros
	 * @param metros representa los metros que se movera el objeto
	 * @return representa la posicion donde esta el objeto
	 */	
	public int moverse(int metros);

}
