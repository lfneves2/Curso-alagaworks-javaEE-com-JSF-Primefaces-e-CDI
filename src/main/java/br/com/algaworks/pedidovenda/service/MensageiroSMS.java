package br.com.algaworks.pedidovenda.service;

@Urgente
public class MensageiroSMS implements Mensageiro {

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Enviando mensagem por SMS: " + mensagem);
	}

}
