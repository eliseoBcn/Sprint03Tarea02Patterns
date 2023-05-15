package n3ejercicio1;

public class Articulo {

	Moneda  moneda;
	@Override
	public String toString() {
		return "Articulo [articulo=" + articulo + ", importe=" + importe + "]";
	}

	public Articulo(String articulo, double importe) {
		super();
		this.articulo = articulo;
		this.importe = importe;
	}

	private String articulo;
	private double importe;
	
	public Articulo() {
		// TODO Auto-generated constructor stub
	}
	
	//---------- Podriamos ponerle metodo static -------------------------------------
	
	public void Divisas( Moneda moneda) {
		// TODO Auto-generated constructor stub
		this.moneda = moneda;
	}
	
	public void ImprimirDivisa(String  monedalistado) {
		
	 	System.out.println ( " Articulo " +  articulo +  " " + moneda.ConvertirImporteMoneda( monedalistado, importe) + " " + monedalistado );
	};
	}
	 
	