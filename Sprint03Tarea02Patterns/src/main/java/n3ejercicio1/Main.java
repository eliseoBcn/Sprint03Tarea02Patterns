package n3ejercicio1;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		
		TablaConversiones tablaconversiones = new TablaConversiones();
 
		Moneda  moneda = new Moneda();
		// Método estatico con la tabla de conversiones
		moneda.divisas(tablaconversiones);
		 
		Articulo a1 =  new Articulo("Coca Cola", 2.33) ;

//		a1.Divisas(moneda);
		a1.ImprimirDivisa("USD");
		a1.ImprimirDivisa("PHP");
		a1.ImprimirDivisa("MAD");
		
		 
		Articulo b1 =  new Articulo("Tomates", 1.3) ;

		b1.Divisas(moneda);
		b1.ImprimirDivisa("USD");
		b1.ImprimirDivisa("PHP");
		b1.ImprimirDivisa("MAD");
		
	}
}  
