package n1ejercicio1;
import java.util.ArrayList;


enum estadobolsa {SUBIDA,BAJADA }



public class AgenteBolsa implements Observable {

	private ArrayList<Observers>  suscriptores = new ArrayList<Observers>();
	public estadobolsa bolsa; 
	private String agente;
	

	public AgenteBolsa(String nombre) {
		// TODO Auto-generated constructor stub
		agente = nombre;
	}

	@Override
	public void attach(Observers o) {
		// TODO Auto-generated method stub
		suscriptores.add(o);
	}

	@Override
	public void detach(Observers o) {
		// TODO Auto-generated method stub
		
		suscriptores.remove(o);
	}

	@Override
	public void notifys() {
		// TODO Auto-generated method stub
		suscriptores.forEach( n -> n.update()  );
		}

	public void estadobolsa( estadobolsa e ) {
		bolsa = e;
		notifys();
	}

	public   estadobolsa  getestadobolsa( ) {
		return bolsa;
	}
	public   String   getAgente( ) {
		return agente;
	}
}
