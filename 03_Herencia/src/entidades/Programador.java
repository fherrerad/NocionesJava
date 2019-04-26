package entidades;

//extends para decir que queremos heredar/extender de otra clase
public class Programador extends Empleado{

	//source>Override implementar metodo
	@Override
	public double calcularSueldo() {
		return getNomina();
	}
	

}
