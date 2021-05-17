package es.pildoras.pruebasAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados maria= contexto.getBean("comercialExperimentado", Empleados.class);
		
		//usamos el bean
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		
		System.out.println(antonio);
		System.out.println(maria);
		
		contexto.close();

	}

}
