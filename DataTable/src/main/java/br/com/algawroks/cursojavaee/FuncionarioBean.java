package br.com.algawroks.cursojavaee;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FuncionarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String[] names = { "João", "Leandro", "Bruno", "Henrique", "Karoline", "Marcia", "Marcos", "Maria"};
	
	private static final String[] sobrenomes = {"Souza", "Silva", "Ribeiro", "Felix", "Viana", "Vieira", "Fernandes", "Marques"};
	
	private List<Funcionario> funcionarios;
	
	public FuncionarioBean() throws ParseException {
		funcionarios = new ArrayList<Funcionario>();
		
		for (int i = 0; i < 50; i++) {
			
		}
	}
	
	public void adicionarfuncionario() {
		String nomeCompleto = getNomeAleatorio() + " " + getSobrenomeAletorio() + " " + getSobrenomeAletorio();
		funcionarios.add(new Funcionario(getMatriculaAleatoria(), nomeCompleto, getDataaleatoria(), 
				getSalarioAleatorio()));
	}
	
	private BigDecimal getSalarioAleatorio() {
		return new BigDecimal(1000 + (Math.random()*29000));
	}
	
	private long getMatriculaAleatoria() {
		return (long) Math.random() * 1000;
	}
	
	private Date getDataaleatoria() {
		long dezAnosMillis = 24 * 60 * 1000;
		long periodoSorteadoEmMillis = ((long) Math.random() * 10 * 365) * dezAnosMillis;
		return new Date(System.currentTimeMillis() - periodoSorteadoEmMillis);
	}
	
	private String getSobrenomeAletorio(){
		int posicao = (int) Math.round(Math.random() * (sobrenomes.length -1));
		return sobrenomes[posicao];
	}
	
	private String getNomeAleatorio() {
		int posicao = (int) Math.round(Math.random() * (names.length -1));
		return names[posicao];
	}
	
}
