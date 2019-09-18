package poo;

import java.util.*;  // Se debe importar este paquete para la fecha.

// En este FICHERO tenemos dos clases, la principal y la Empleado.
// No es aconsejable tener varias clases en un mismo fichero.



// Clase Principal (main)  ---> Aca armo las instanciaciones


public class Uso_Empleado {  

	public static void main(String[] args) {
		
		// PRIMERA FORMA
		
		
		/*Empleado empleado1= new Empleado ("Paco Gómez", 85000, 1990, 12, 17);        // Instancia 1.
		
		Empleado empleado2= new Empleado ("Ana López", 95000, 1995, 06, 02);        // Instancia 2.
		
		Empleado empleado3= new Empleado ("María Martín", 105000, 2002, 03, 15);   // Instancia 3.
		
		// Utilizo el Setters
		
		empleado1.subeSueldo(5);  
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		
		// Utilizo Getters
		
		
		System.out.println("\n" + "Nombre: " + empleado1.dameNombre() + ". Sueldo: " + empleado1.dameSueldo()
		                   + ". Fecha de alta: " + empleado1.dameFechaContrato() + "\n");
		
		System.out.println("Nombre: " + empleado2.dameNombre() + ". Sueldo: " + empleado2.dameSueldo()
        + ". Fecha de alta: " + empleado2.dameFechaContrato() + "\n");
		
		System.out.println("Nombre: " + empleado3.dameNombre() + ". Sueldo: " + empleado3.dameSueldo()
        + ". Fecha de alta: " + empleado3.dameFechaContrato() + "\n"); */
		
		
		
		// SEGUNDA FORMA: CON ARRAYS y CICLO FOR
		
		
		Empleado[] misEmpleados= new Empleado [3];
		
		misEmpleados[0]= new Empleado ("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]= new Empleado ("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2]= new Empleado ("María Martín", 105000, 2002, 03, 15);
		
		
		for (int i=0; i<3; i++) {              // si no conociera i<3 podría poner
			                                  // i< misEmpleados.length
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		
		
		for (int i=0; i<3; i++) {
			
			System.out.println(" Nombre" + misEmpleados[i].dameNombre() + ". Sueldo: " + misEmpleados[i].dameSueldo()
					+ ". Fecha de alta " + misEmpleados[i].dameFechaContrato());
			
		}
		
	}

	
	
	
	
	
// ---------------------------------------------------------------------------------------------

	
	
	
}

      // 1) Creo una Clase  ---> class Empleado


class Empleado {
	
	
	// 2) Creo un Método Constructor ---> public Empleado    
	
	public Empleado ( String nom, double sue, int agno, int mes, int dia) { // nom= nombre; sue= sueldo; agno= año;
	
		nombre= nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia); // Arma la fecha
		
		altaContrato=calendario.getTime();  // Devuelve la fecha
	}
	
	
	
	// 3) Getters:
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public double dameSueldo() {
		
		return sueldo;
	}
	
	public Date dameFechaContrato () {
		
		 return altaContrato;
	}
	
	// 4) Setters
	
	public void subeSueldo (double porcentaje) {      // "porcentaje" es el parámetro.
		
		double aumento= sueldo*porcentaje/100;        // "aumento" es una NUEVA variable.
		
		sueldo+=aumento;                              // "sueldo" ya está definido en el Constructor.
	}                                                 
	                                                  // "sueldo+" es el nuevo sueldo.  sueldo+ = (sueldo + aumento)
	
	
	
	
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}









// GregoriaCalander es una API que viene dentro de java.util
// Recordar que es un Met. Constructor con la siguiente estructura:
// GregorianCalander + NOMBRE = new + GregorianCalander (int año, int mes, int dia)
// El mes cero es enero, por eso para tener el rango correcto de meses es necesario restar 1. mes-1.


// En el Método Constructor defino las variables que luego me serviran en Getters y Setters.


// Estructura:

// Método main (public class) ; Creo una Clase (class) ; Creo un Met. Const. de esa Clase (public) ; 
// Defino las variables private ;  Getters ; Setters.
