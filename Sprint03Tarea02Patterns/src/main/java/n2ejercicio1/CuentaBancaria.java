package n2ejercicio1;

public class CuentaBancaria implements Pago {
	private String cuenta;
	private double importe;
	public CuentaBancaria(String cuenta, double importe) {
		// TODO Auto-generated constructor stub
		this.cuenta = cuenta;
		this.importe = importe;
	}

	@Override
	public void pago() {
		// TODO Auto-generated method stub
		// LLamamos al módulo de cuentas bancarias 
		System.out.println( " Cuenta  "+ this.cuenta  + " pagado " + importe + " euros");
	}

}
