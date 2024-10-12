package encapsulamiento;

import encapsulamiento.persona.Persona;
//Control + espacio para importar

public class Encapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona mesero = new Persona();
		mesero.setNombre("Aldair");
		mesero.setPrimerapp("Chávez");
		mesero.setSegundoapp("Hernández");
		mesero.setEdad(23);
		mesero.setCurp("CAHA010127HMCHRLA3");
		mesero.setRfc("CAHA010127");
		
		System.out.println("El nombre es: " + mesero.getNombre());
		System.out.println("El primer apellido es: " + mesero.getPrimerapp());
		System.out.println("El segundo apellido es: " + mesero.getSegundoapp());
		System.out.println("La edad es: " + mesero.getEdad());
		System.out.println("Su CURP es: " + mesero.getCurp());
		System.out.println("El RFC es: " + mesero.getRfc());
		
		//System.out.println(mesero.toString());

	}

}
