package es.pildoras.pruebasAnnotations;

import org.springframework.stereotype.Component;



//component es necesario para que spring sea capaz de regustrar las clases
@Component
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Este es el informe del segundo trimestre";
	}

}
