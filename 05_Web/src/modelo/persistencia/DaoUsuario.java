package modelo.persistencia;

import java.util.ArrayList;

import modelo.entidades.Usuario;

/*
 * Esta capa se encarga de el acceso a los objetos de negocio
 * DAO - Data Access Object
 * 
 * Simulamos una bbdd
 */

public class DaoUsuario {
	
	private ArrayList<Usuario> listaUsuarios;
	
	public DaoUsuario() {
		listaUsuarios = new ArrayList<>();
		
		Usuario usuario = new Usuario();
		usuario.setNombre("pepe");
		usuario.setPassword("qwerty");		
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setNombre("ana");
		usuario.setPassword("1234");		
		listaUsuarios.add(usuario);
		
	}
	
	public ArrayList<Usuario> getListaUsuarios(){
		//este metodo tendria que hacer la consulta a la base de datos
		return listaUsuarios;
	}
	
	public Usuario getUsuario(String nombre) {
		return null;
		
	}
	
}
