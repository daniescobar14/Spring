package es.pildoras.pruebasAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component ("comercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	//si no le damis el id cogera el nombre de la clase pero con la primera en minusculas

	
	
	public ComercialExperimentado() {
		
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim2") // se coloca el nombre de la clase comenzando por minuscula (video 20)
	private CreacionInformeFinanciero nuevoInforme;
	//en el caso de que spring se encuentre con dos clases que estan implementando la interfaz,
	//spring no sabe que clase tiene que utilizar
	
	
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	
	
	/*public ComercialExperimentado(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}//necesitamos que a traves de este constructor sea capaz de realizar una inyeccion de dependencias
	*/

	//con el autowired busca alguna clase que implemente la clase CreacionInformeFinanciero
	//la clase que lo implementa rd InformeFinancieroTrim1
	
	public CreacionInformeFinanciero getNuevoInforme() {
		return nuevoInforme;
	}

	@Override
	public String getTareas() {
		return "Vender muchisimo";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}
	//ejecucion de metodos despues de la creacion del bean
	@PostConstruct
	public void ejecutaTrasCreacion() {
		System.out.println("Se ejecuta despues de la creacion del bena");
	}
	
	//ejecucion despues de apagado del contenedor del bean
	@PreDestroy
	public void ejecutaDespuesBean(){
		System.out.println("Se ejecuta antes de la eliminacion del bena");
	}
	
}
