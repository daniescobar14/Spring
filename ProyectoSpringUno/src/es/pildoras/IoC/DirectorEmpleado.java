package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo; // creacion de campo tipo CreacionInformes (interfaz), 
	//el campo lo encapsulamos (private)
	
	public DirectorEmpleado (CreacionInformes informeNuevo) { //metodo constructor que 
		//recibe un parametro del tipo creacioinformes y que inyecta la dependencia
		this.informeNuevo= informeNuevo; //el campo de clase que acabamos 
		//de crear es igual al parametro que le vamos a pasar al constructor
		
	}
		
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		//return "nuevo informe del director";
		return "informe creado por el director " + informeNuevo.getInforme();//miramos el xml
	}
	
	private String email;
	
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
}
	
	//vamos a crear el metodo init ejecutar tareas antes de que este disponible
	
	public void init(){
		//metodo inicial
		//aqui van todas las tareas antes de que el bean este disponible
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar entes de que el bean este listo");
	}
	
	public void destroy(){
		//metodo inicial
		//aqui van todas las tareas antes de que el bean muera
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar entes de que el bean muera");
			
	}
	//el metodo destroy despues de que el bean haya sido utilizado
}
