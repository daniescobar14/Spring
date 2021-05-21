package es.pildoras.pruebasAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "dirijo el departamento financiero";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero informeFinanciero;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	//debemos inyectar aqui los valores que tenemos el el fichero de propiedades
			@Value("${email}")
			private String email;
			@Value("${nombreEmpresa}")
			private String nombreEmpresa;
			
			//posteriormente necesitamos los metodos necesarios para extraer las propiedades que hemos inyectado
			
			public String getEmail() {
				return email;
			}


			public String getNombreEmpresa() {
				return nombreEmpresa;
			}

}
