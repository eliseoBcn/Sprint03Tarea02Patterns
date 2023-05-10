package n2ejercicio1;

import n0ejemplos.Lanza;

public class TiendaZapatos {
	
	

	public TiendaZapatos(String tienda) {
		// TODO Auto-generated constructor stub

		System.out.println("Abrimos " + tienda );
	 	System.out.println("  ");
	}

	public  void pagado() {
	 	System.out.println(" Notificación Pago OK realizado por la pasarela ");
	 	System.out.println("  ");
	 	
		
	}
	
	public static void main(String[] args) {
	
	 
		// Creamos una unica tienda 
		TiendaZapatos t = new  TiendaZapatos("EL corte ingles diagonal 125");		
		
		
	    TarjetaCredito  p = new  TarjetaCredito("MASTERD CARD 111122223333444 2024/02/02 321", 133.44); 
		Pasarela pago = new Pasarela(t, p);
		pago.pago(); 
		
		
		Paypal p2 = new Paypal("cuentaAnonima", 300.33);	 
		Pasarela pago2 = new Pasarela(t, p2);
		pago2.pago(); 
		
		
		CuentaBancaria p3 = new CuentaBancaria( "ES9420805801101234567891", 100.33);	 
		Pasarela pago3 = new Pasarela(t, p3);
		pago3.pago(); 
	 
		//  *****        Futura implementacion de pago por BIZUM        ****************************
	
	}
}
