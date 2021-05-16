package es.pildoras.pruebasAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("comercialExperimentado")
//si no le damis el id cogera el nombre de la clase pero con la primera en minusculas
public class ComercialExperimentado implements Empleados {

	@Override
	
	public String getTareas() {
		
		return "Vender muchisimo";
	}

	
	@Autowired
	//con el autowired busca alguna clase que implemente la clase CreacionInformeFinanciero
	//la clase que lo implementa rd InformeFinancieroTrim1
	private CreacionInformeFinanciero informe;
	
	@Override
	public String getInforme() {
		return informe.getInformeFinanciero();
	}

	public void setInforme(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}

	

}
