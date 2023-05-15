package n3ejercicio1;

public class Moneda {
	
	
	
	static TablaConversiones tablaconversiones;  
	 
 	String moneda; 
	
	static public void divisas(TablaConversiones divisas) {
		// TODO Auto-generated constructor stub
		 Moneda.tablaconversiones =  divisas;
	}
	
 
	public Double  ConvertirImporteMoneda(String moneda, Double importe ) {
		return  tablaconversiones.valorDivisa(moneda) * importe;
	}
 
}