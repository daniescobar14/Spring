package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado (CreacionInformes informenuevo) {
		this.informeNuevo=informeNuevo;
	}
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a los empleados";
	}

	@Override
	public String getInformes() {
		
		return "el informe del jefe empleado";
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
}
