package RedesSociais;

public class ServicoMensagemInstantanea {
	
	 MensagemInstantaneaModelo modelo = null;  
	
	// Método para escolher o app e enviar/receber mensagem
	public void escolherApp() {
	
		
	// chamadas para enviar e receber mensagens
	this.modelo.enviarMensagem();
	this.modelo.receberMensagem();
	}
}
