package co.edu.konradlorenz.model;

public abstract class Usuario {
	
	private String nombreUsuario;
	
	public Usuario() {
		super();
	}
	public Usuario(String nombreUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombreUsuario+"]";
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public abstract String propietario(String nombreUsuario);
	
	

}
