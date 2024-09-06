package RedesSociais;

import java.util.Scanner;

public class ComputadorCliente {
	public static void main(String[] args) {
		
		// Instancia do serviço para o serviço de mensagem
		ServicoMensagemInstantanea smi = new ServicoMensagemInstantanea();
		
		Scanner scanner = new Scanner(System.in);
		
		// Solicita ao usuário que escolha um app
		System.out.println("Digite um app: msn, fcb, tlg, Wha");
		
		// Criar uma classe menu para guardar essas validações
		System.out.print("Digite o seu app:");
		String appEscolhido = scanner.nextLine();
		
		if(appEscolhido.equalsIgnoreCase("msn")) {
			smi.modelo = new MSNMessenger();
			
		} else if(appEscolhido.equalsIgnoreCase("fcb")) {
			smi.modelo = new FacebookMessenger();
			
		} else if(appEscolhido.equalsIgnoreCase("tlg")) {
			smi.modelo = new TelegramMessenger();
			
		} else if (appEscolhido.equalsIgnoreCase("wha")){
			smi.modelo = new WhatsappMessenger();
		} else {
			System.out.println("App desconhecido, Tente novamente.");
		}
		
		scanner.close();		
		smi.escolherApp();
		
		
	}
}
