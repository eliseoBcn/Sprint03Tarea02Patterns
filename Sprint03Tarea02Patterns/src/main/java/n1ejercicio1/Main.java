package n1ejercicio1;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			// Nuestro super Agente  
			AgenteBolsa  agentebolsa = new AgenteBolsa("WARREN BUFFFERT");
			
			
			// Las agencias 
			AgenciaBolsa agencia1  = new AgenciaBolsa(agentebolsa);
			
			agentebolsa.attach(agencia1);
	
			AgenciaBolsa agencia2  = new AgenciaBolsa(agentebolsa);
			
			agentebolsa.attach(agencia2);
			
			AgenciaBolsa agencia3  = new AgenciaBolsa(agentebolsa);
			
			agentebolsa.attach(agencia3);
			
			
			agentebolsa.estadobolsa( estadobolsa.SUBIDA);
			agentebolsa.estadobolsa( estadobolsa.BAJADA);
	}

}
