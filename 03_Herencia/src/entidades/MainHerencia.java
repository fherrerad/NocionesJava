package entidades;

import java.util.ArrayList;

public class MainHerencia {
	public static void main(String[] args) {
		Empleado empleado = new Programador();
		empleado.setDni("52998877s");
		empleado.setNombre("Bub Spencer");
		empleado.setNomina(1000);
		
		Jefe jefe = new Jefe();
		jefe.setDni("98765433d");
		jefe.setNombre("Terence Hill");
		jefe.setNomina(1600);
		jefe.setIncentivos(300);
		
		Director director = new Director();
		director.setDni("736458489f");
		director.setNombre("Harry Calahan");
		director.setNomina(2300);
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(empleado);
		listaEmpleados.add(jefe);
		
		director.setListaEmpleados(listaEmpleados);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(empleado);//posicion 0
		empresa.add(jefe);//posicion 1
		empresa.add(director);//posicion 2
	
		calcularSueldo(empresa);
		 
		Empleado empleado1 = empresa.get(1);
		System.out.println(empleado1.getDni());
		//instaceof nos devuelve true en caso de que la referencia
		//este apuntando a un objeto de ese tipo
		//es una manera de hacer seguro un casting
		if (empresa.get(1) instanceof Jefe) {
			Jefe jefe1 = (Jefe)empresa.get(1);
			System.out.println(jefe1.getIncentivos());
		}
		
	}
		
		//polimorfismo - capacidad de invocar a un metodo especifico dependiendo del metodo invocado
		public static void calcularSueldo(ArrayList<Empleado> empresa) {
			for (Empleado e : empresa) {
				System.out.println(e);
				System.out.println(e.calcularSueldo());
			}
		}
	}
		