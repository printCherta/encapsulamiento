package encapsulamiento;

import encapsulamiento.direccion.Direccion;

public class Localizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion mensajero = new Direccion();
		mensajero.setCalle("Avenida Central");
		mensajero.setNum("Sin número");
		mensajero.setColonia("Lázaro Cárdenas");
		mensajero.setCp(55629);
		mensajero.setLocalidad("San Juan Z");
		mensajero.setMunicipio("Zumpango");
		mensajero.setEstado("México");
		
		System.out.println("INFORMACIÓN DEL DESTINATARIO");
		System.out.println("----------------------------");
		System.out.println("La calle es: "+ mensajero.getCalle().toUpperCase());
		System.out.println("El número de casa es: "+ mensajero.getNum().toUpperCase());
		System.out.println("La colonia es: "+ mensajero.getColonia().toUpperCase());
		System.out.println("El código postal es: "+ mensajero.getCp());
		System.out.println("La localidad es: "+ mensajero.getLocalidad().toUpperCase());
		System.out.println("El municipio es: "+ mensajero.getMunicipio().toUpperCase());
		System.out.println("El estado es: "+ mensajero.getEstado().toUpperCase());

	}

}
