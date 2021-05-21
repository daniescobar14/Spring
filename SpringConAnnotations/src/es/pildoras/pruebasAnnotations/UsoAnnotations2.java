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
		//Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		//System.out.println(empleado.getTareas());
		//System.out.println(empleado.getInforme());
		
		//Aqui debemos pedir directamente a directorfinanciero, ya que los metodos son exclusivos
		
		DirectorFinanciero director= contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("hola");
		String inf= director.getInforme();
		System.out.println(inf);
		System.out.println(director.getEmail());
		System.out.println(director.getInforme());
		System.out.println(director.getTareas());
		System.out.println(director.getNombreEmpresa());
		contexto.close();

	}

}
