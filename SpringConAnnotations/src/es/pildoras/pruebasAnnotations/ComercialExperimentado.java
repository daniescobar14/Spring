package es.pildoras.pruebasAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("comercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	//si no le damis el id cogera el nombre de la clase pero con la primera en minusculas

	@Override
	public String getTareas() {
		return "Vender muchisimo";
	}

	
	@Autowired
	private CreacionInformeFinanciero informe;
	
	
	public ComercialExperimentado(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}//necesitamos que a traves de este constructor sea capaz de realizar una inyeccion de dependencias
	

	//con el autowired busca alguna clase que implemente la clase CreacionInformeFinanciero
	//la clase que lo implementa rd InformeFinancieroTrim1
	
	@Override
	public String getInforme() {
		return informe.getInformeFinanciero();
	}

	public void setInforme(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}
	
	

	

}
