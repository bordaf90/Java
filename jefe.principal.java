package poo;

import java.util.*;  // Se debe importar este paquete para la fecha.

// En este FICHERO tenemos dos clases, la principal y la Empleado.
// No es aconsejable tener varias clases en un mismo fichero.



// Clase Principal (main)  ---> Aca armo las instanciaciones


public class Uso_Empleado {  

	public static void main(String[] args) {
		
	   Jefatura jefe_RRHH= new Jefatura (" Juan", 55000, 2006, 9, 25); //Instancia Jefatura
	   
	   jefe_RRHH.estableceIncentivo(2570);                           // Método
		
		
		Empleado[] misEmpleados= new Empleado[5];
		
		misEmpleados[0]= new Empleado (" Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1]= new Empleado (" Ana López", 95000, 1995, 06, 02);
		misEmpleados[2]= new Empleado (" María Martín", 105000, 2002, 03, 15);
		
		misEmpleados[3]= jefe_RRHH;  // Polimorfismo o Principio de Sustitución.
		
		misEmpleados[4]= new Jefatura (" Laura", 105000, 2007, 06, 10); // Nueva jefa
		
		
		for (int i=0; i<5; i++) {              
			                                 
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		
		
		for (int i=0; i<5; i++) {
			
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
	private int Id;
	private static int IdSiguiente;
	
	
}


//------------------------------------------------------------------------------------------------------------------------------------

// Herencia Empleado ---> Jefe.   Los jefes reciebn un incentivo, los empleaodos no.

 class Jefatura extends Empleado {
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom,sue, agno, mes, dia);
		
		
	
	
   }
	
	// Variable nueva
	
	private double incentivo;
	
	
	// Setter
	
	public void estableceIncentivo (double b) {
		
		incentivo=b;
	}
	
	// Getter
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo(); // al dameSueldo de la clase Empleado lo pongo en SueldoJefe.
		
		return sueldoJefe + incentivo;
	}

}










