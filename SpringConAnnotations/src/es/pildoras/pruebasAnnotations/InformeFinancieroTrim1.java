package es.pildoras.pruebasAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero{
	@Override
	public String getInformeFinanciero() {
		
		return "Presentacion del inform del primer trimestre";
	}

}
