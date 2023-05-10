package n2ejercicio1;

public class TarjetaCredito implements Pago {
	private String tarjeta;
	private  double importe;
	public TarjetaCredito(String  tarjeta, double importe ) {
		// TODO Auto-generated constructor stub
		this.tarjeta = tarjeta;
		this.importe = importe;
	}

	@Override
	public void pago() {
		// TODO Auto-generated method stub
		
		System.out.println( " Tarjeta "+ this.tarjeta + " pagado " + importe + " euros");
	}

}
