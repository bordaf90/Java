package poo;
                       // Clase o Estructura básica (qué hay y cómo es)
public class Coche {
	
	private int ruedas;           // Qué hay
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;    // Caracteristicas que pueden variar
	private int peso_total;  // Me doy cuenta de eso porque NO aparecen en el M. Constructor.
	private boolean asientos_cuero, climatizador;
	
	

	 public Coche() {  //Método constructor
		 
		 ruedas=4;       // Cómo es
		 largo=2000;
		 ancho=1600;
		 peso_plataforma=500;
		 
	 }
	 
	public String dime_datos_generales(){  // Método Getter (devuelve datos)
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" + 
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de " + 
		peso_plataforma + " kilos.";
		
		
	}
	
	
	public String dime_color(){   // Getter
		
		return "El color del auto es " + color;
	}
	
	
	
	
	public void establece_color(String color_coche) {  // Método Setter
													  // Con parámetros
		   color= color_coche;                         
		
	}
	
	
	// Setter Condicional
	
	public void configura_asientos(String asientos_cuero){
		
		if (asientos_cuero.equalsIgnoreCase("si")) {     //asientos_cuero es parámetro
			this.asientos_cuero=true;  // this.asiento_cuero es variable
			                           // El this diferencia uno de otro.
		}
		
		else {
			this.asientos_cuero=false;
		}
			
	 // Si el parámetro es "si", la variable es verdadera. Sino, la variable es falsa.
		
	}
	
	// Getter Condicional
	
	public String dime_asientos() {
		
		if (asientos_cuero== true) {
			
			return "El coche tiene asientos de cuero";
			
		}
		
		else {
			
			return "El coche tiene asientos de serie ";
		}
		
	}
		
	
	
	public void configura_climatizador(String climatizador){  //Setter
		       
		   if(climatizador.equalsIgnoreCase("si")) { 
			   this.climatizador=true;
		    }else{
			   this.climatizador=false;
		   }
		
		}
	
	
	public String dime_climatizador(){   // Getter
		
		if(climatizador==true){ 
			
			return "El coche incorpora climatizador. ";
		} else { 
			return "El coche lleva aire acondicionado.";
		}
		
	}
	
	public String dime_peso_coche(){   // Getter + Setter (no es buena práctica)
		int peso_carroceria=500;
		
		peso_total=peso_plataforma + peso_carroceria;
		
		if(asientos_cuero==true){ 
			
			peso_total=peso_total+50;
			
		}
		
		if(climatizador==true){ 
			
			peso_total=peso_total+20;
			
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	
	public int precio_coche(){ 
		
		int precio_final=10000;
		
		if(asientos_cuero==true){ 
			
			precio_final+=2000;
		}
		
		if(climatizador==true){ 
			
			precio_final+=1500;
		}
		
		return precio_final;
	}
	
}

// Las CLASES se comunican a través de METODOS.
// El equal compara cadenas de caracteres.
