package br.com.algaworks.pedidovenda.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroProdutoBean {

	public void salvar() {
		throw new RuntimeException("teste de exceção");
	}
	
}
