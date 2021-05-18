package es.pildoras.pruebasAnnotations;

public class InformeFinancieroDepartamentoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Informe del departamento de compras";
	}

}
