package encapsulamiento.persona;

public class Persona {

	private String nombre;
	private String primerapp;
	private String segundoapp;
	private int edad;
	private String curp;
	private String rfc;
	
	// Alt+Shift+S para obtener Get and Set
	// Ctrl+Shift+F para arreglar

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerapp() {
		return primerapp;
	}

	public void setPrimerapp(String primerapp) {
		this.primerapp = primerapp;
	}

	public String getSegundoapp() {
		return segundoapp;
	}

	public void setSegundoapp(String segundoapp) {
		this.segundoapp = segundoapp;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerapp=" + primerapp + ", segundoapp=" + segundoapp + ", edad="
				+ edad + "]";
	}

}
