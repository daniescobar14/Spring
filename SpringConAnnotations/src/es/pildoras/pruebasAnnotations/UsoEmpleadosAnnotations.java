package es.pildoras.pruebasAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleadosAnnotations {

	public static void main(String[] args) {
		
		
		//leemos el xml de configuración
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//leemos desde la clase
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//pedir el bean al contenedor
		//nos vamos a la clase y creamos una anotacion @component("id")
		Empleados antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		
		//usamos el bean
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		
		
		
		contexto.close();
	}

}
