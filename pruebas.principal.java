package poo;




            // Clase Principal

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1= new Empleados("Paco");
		Empleados trabajador2= new Empleados("Ana");
		Empleados trabajador3= new Empleados("Juan");
		Empleados trabajador4= new Empleados("Belén");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
	}

}


//-----------------------------------------------------------------------------------------------
                     


                     // Clase "Empleado"           
           

class Empleados {  
	
	                  // Método Constructor
	
	
	public Empleados (String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=IdSiguiente;  // Aca digo que Id=1 porque IdSiguiente era 1.
		
		IdSiguiente++;
		
		
		
	}
	
	     // Setters
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	     // Getters
	
	public String devuelveDatos() {
		
		return "El nombre es " + nombre + ", la seccion es " + seccion + ", y el Id es " + Id;
	}
	
	
	    // Variables
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
	
}
