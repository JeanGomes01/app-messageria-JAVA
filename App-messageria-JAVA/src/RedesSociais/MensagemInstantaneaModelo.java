package RedesSociais;

public class MensagemInstantaneaModelo {
	
	// Métodos abstratos que as classes concretas terão que implementar
		public void enviarMensagem() {
			System.out.println("Mensagem enviada.");
		}
		public void receberMensagem() {
			System.out.println("Mensagem recebida.");
		}
}
