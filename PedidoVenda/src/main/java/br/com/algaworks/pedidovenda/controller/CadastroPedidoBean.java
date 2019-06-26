package br.com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroPedidoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	List<Integer> itens;
	
	public CadastroPedidoBean() {
		itens = new ArrayList<Integer>();
		itens.add(1);
	}
	
	public List<Integer> getItens() {
		return itens;
	}
}
