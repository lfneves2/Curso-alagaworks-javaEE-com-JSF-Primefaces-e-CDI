package br.com.algaworks.pedidovenda.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CalcularPrecoProduto implements Calculadora{

	@PostConstruct
	public void init() {
		System.out.println("Init CalcularPrecoProduto");
	}
	
	@Override
	public double calcularPrecoUnitario(int quantidade, double precoUnitario) {
		return quantidade * precoUnitario;
	}

}
