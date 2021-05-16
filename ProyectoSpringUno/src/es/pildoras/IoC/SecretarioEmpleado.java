package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	
	@Override
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a los jefes";
	}

	@Override
	public String getInformes() {
		
		return "informe del secretario";
		//return "informe generado por el secretario" + informeNuevo.getInforme();
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
	
	public void inicioSecretario(){
		//metodo inicial
		//aqui van todas las tareas antes de que el bean este disponible
		System.out.println("Dentro del metodo init, inicio del bean secretario");
	}
	
	public void destroySecretario(){
		//metodo inicial
		//aqui van todas las tareas antes de que el bean muera
		System.out.println("Fuera del metodo init, destruyo el bean secretario");
			
	}
}
