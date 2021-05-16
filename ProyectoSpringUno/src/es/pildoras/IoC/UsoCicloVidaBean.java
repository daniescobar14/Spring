package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		//cargar el xml de configuracion
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//obtencion del bean
		
		Empleados juan = contexto.getBean("miDirectorEmpleado3", Empleados.class);
		
		System.out.println(juan.getTareas());
		
		System.out.println(juan.getInformes());
		
		contexto.close();
		

	}

}
