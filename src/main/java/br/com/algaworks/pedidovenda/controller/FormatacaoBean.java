package br.com.algaworks.pedidovenda.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.algaworks.pedidovenda.service.Brasil;

@Named
@RequestScoped
public class FormatacaoBean {

	@Inject @Brasil
	private DateFormat formatadorData;

	private Date dataInformada;
	private String dataFormatada;

	public void enviar() {
		dataFormatada = formatadorData.format(dataInformada);
	}

	public Date getDataInformada() {
		return dataInformada;
	}

	public void setDataInformada(Date dataInformada) {
		this.dataInformada = dataInformada;
	}

	public String getDataFormatada() {
		return dataFormatada;
	}

	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}

}
