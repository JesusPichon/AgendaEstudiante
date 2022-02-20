package Clases;

public class Persona {
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	public Persona(String nombre, String apellidoP, String apellidoM){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoP;
		this.apellidoMaterno = apellidoM;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
}
