package es.pildoras.pruebasAnnotations;

import org.springframework.stereotype.Component;

@Component

//component es necesario para que spring sea capaz de regustrar las clases
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Este es el informe del segundo trimestre";
	}

}
