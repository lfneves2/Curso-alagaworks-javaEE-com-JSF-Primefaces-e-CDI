package br.com.algaworks.pedidovenda.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.algaworks.pedidovenda.service.Mensageiro;
import br.com.algaworks.pedidovenda.service.Urgente;

@Named
@RequestScoped
public class EnvioMensagemBean {
	
	@Inject @Urgente
	private Mensageiro mensagem;

	private String texto;
	
	public void enviarMensagem() {
		mensagem.enviarMensagem(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
