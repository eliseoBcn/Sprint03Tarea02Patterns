package n2ejercicio1;

import n0ejemplos.Cliente;

public class Pasarela implements Pago {

    Pago pago;
    TiendaZapatos  tiendazapatos ;
   

    public   Pasarela(TiendaZapatos  tiendazapatos , Pago  pago ){
        this.tiendazapatos = tiendazapatos;
        this.pago   =  pago ;
    }
  

	@Override
	public void pago() {
		// TODO Auto-generated method stub
		pago.pago();
		
	   	tiendazapatos.pagado();
	}
	
	
	
}
