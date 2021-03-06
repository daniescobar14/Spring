package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// creacion de objetos de tipo empleados
		
		//cuando elaboras una aplicacion en java en la que vas a utilizar varios tipos de objetos
		//hay que realizar una abstraccion, es una buena practica
		//de esta manera se podria hacer o bien una super clase empleados,
		//o una interfaz para que se implementen el resto de clases
		
		
		
		//JefeEmpleado empleado1= new JefeEmpleado(); --> despues de la interfaz
		//Empleados empleado1= new DirectorEmpleado();
		
		
		//uso de objetos creados
		//System.out.println(empleado1.getTareas());
		
		
		
		//FORMA CON XML
		
		//Cargamos el archivo xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Pedimos el bean, el generador de beans me da ahora mismo directores, si queremos cambiarlo lo
		//tenemos que cambiar en el xml
		Empleados juan = contexto.getBean("miEmpleado", Empleados.class);
		
		//video 11 maria ya no va a ser un empleado en general, va a ser un secretario empleado
		//Empleados maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		SecretarioEmpleado maria= contexto.getBean(SecretarioEmpleado.class);
		
		SecretarioEmpleado pablo= contexto.getBean(SecretarioEmpleado.class);
		
		DirectorEmpleado daniel = contexto.getBean(DirectorEmpleado.class);

		
		System.out.println(maria.getTareas());
		
		System.out.println(maria.getInformes());
		
		//email y nombreEmpresa solamente pertenecen al secretario, no a la clase empleados en fgeneral
		//por eso no me aparece
		System.out.println("Email del secretario " + maria.getEmail());
		System.out.println("Empresa del secretario " + maria.getNombreEmpresa());
		
		System.out.println("Email de pablo secretario" + pablo.getEmail());
		
		System.out.println("Email de director Daniel: " + daniel.getEmail());

		contexto.close();
		
	}

}
