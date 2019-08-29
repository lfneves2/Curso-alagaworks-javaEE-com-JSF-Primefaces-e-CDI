package br.com.algaworks.pedidovenda.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.algaworks.pedidovenda.service.Calculadora;

@Named
@SessionScoped
public class PrecoProdutoBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Inject
	Calculadora calculadora;
	
	@PostConstruct
	public void init() {
		System.out.println("Init PrecoProdutoBean");
	}
	
	public double getPreco() {
		System.out.println(calculadora.getClass());
		return calculadora.calcularPrecoUnitario(10, 10.45);
	}
}
