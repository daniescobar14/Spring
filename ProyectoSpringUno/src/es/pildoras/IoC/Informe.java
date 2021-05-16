package es.pildoras.IoC;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {
		
		return "esta es la presentacion de mi informe";
		//caracteristica comun de todos los objetos (jefes, empleados y directores)
	}
	
	

}
