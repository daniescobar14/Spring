package es.pildoras.pruebasAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		//leemos desde el xml
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//leemos desde la clase
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
				
		
		/*Empleados antonio= contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados maria= contexto.getBean("comercialExperimentado", Empleados.class);
		
		//usamos el bean
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		
		System.out.println(antonio);
		System.out.println(maria);*/
		
		//pedimos el bean desde la anotacion
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		
		contexto.close();

	}

}
