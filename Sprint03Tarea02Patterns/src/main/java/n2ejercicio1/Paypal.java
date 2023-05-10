package n2ejercicio1;

public class Paypal implements Pago {

	private String AliasPaypal;
	private double importe;
	public Paypal(String AliasPaypal, double importe ) {
		// TODO Auto-generated constructor stub
		
		this.AliasPaypal = AliasPaypal;
		this.importe = importe;
	}

	@Override
	public void pago() {
		// TODO Auto-generated method stub
	 
		System.out.println( "Paypal " + AliasPaypal  + " pagado " + importe + " euros");
	}

}
