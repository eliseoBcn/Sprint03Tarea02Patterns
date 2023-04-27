package n1ejercicio1;

public class AgenciaBolsa implements Observers {

	private AgenteBolsa  agente = null;
	public AgenciaBolsa(AgenteBolsa o) {
		// TODO Auto-generated constructor stub
		agente = o;

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		System.out.println("el Agente " + agente.getAgente() + " notifica el estado de la bolsa a " +  agente.getestadobolsa() );
		System.out.println(" ");
	}
	
}
