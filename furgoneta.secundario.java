package poo;



public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1= new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1= new Furgoneta (7, 580);  // 7 asientos, 580 kilos.
		
		mifurgoneta1.establece_color("Azul");    // Con esto doy características especiales de cada camioneta.
		
		mifurgoneta1.configura_asientos("si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales() + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());  
   // Con esto muestro mi furgoneta particular.
	}
		

}


