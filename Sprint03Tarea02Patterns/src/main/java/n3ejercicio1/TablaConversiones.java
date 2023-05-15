package n3ejercicio1;

import java.util.Map;

import java.util.HashMap;

public class TablaConversiones {

	Map<String, Double > mapa ;
	public TablaConversiones() {
		// TODO Auto-generated constructor stub
	
		   mapa= new HashMap<>();
   	       mapa.put("EUR",1.444);
   	       mapa.put("ARS", 344.3); // Peso argentino		
    	   mapa.put("BGN",33.33); 	//	Lev búlgaro		
       	   mapa.put("CAD",	14.01); //	Dólar canadiense
   	       mapa.put("CHF",	2.10); 	//	Franco suizo
     	   mapa.put("MAD", 14.4); 	//	Dírham marroquí
 		   mapa.put("PHP", 33.5); 	// 	Peso filipino
 		   mapa.put("USD", 1.09); 	//  Dolar americano 
 		   
 
 	}

	public Double   valorDivisa( String moneda) {
		return    mapa.get(moneda);
	}  
	
	
}
