package es.pildoras.pruebasAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {	
		return "Informe financiero del cuarto trimestre";
	}

}
