package es.pildoras.pruebasAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan ("es.pildoras.pruebasAnnotations")//tenemos que decir donde debe escanear(
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadosConfig {

	//en el fichero de configuracion lo unico que teniamos era el donde tenñia que buscar
	
	//posteriormente nos vamos a la clase principal que tenga el main
	//para indicar que lea desde aqui
	
	//definir el bean para el informe financiero
	@Bean //creamos un metodo que nos devuelva informes financieros
	public CreacionInformeFinanciero informeFinancieroDepartamentoCompras(){
		return new InformeFinancieroDepartamentoCompras(); //ojo a las mayusculas y minusculas
	}
	
	
	//definir el bean para el director financiero e inyectar dependencias
	//elegimos el bean que queremos que nos devuelva el contenedor
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDepartamentoCompras());
		//inyeccion de dependencias
		
		
	}
	
}
