package Translate;

import java.util.List;

public class Clientes {
	
	private String nome;
	private List<Tradutores> funcionarios;
	private String LinguaDesejada;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Tradutores> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Tradutores> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public String getLinguaDesejada() {
		return LinguaDesejada;
	}
	public void setLinguaDesejada(String linguaDesejada) {
		LinguaDesejada = linguaDesejada;
	}
	
	public Clientes(String nome, List<Tradutores> funcionarios, String linguaDesejada) {
		super();
		this.nome = nome;
		this.funcionarios = funcionarios;
		LinguaDesejada = linguaDesejada;
	}
	@Override
	public String toString() {
		return "Clientes [nome=" + nome + ", funcionarios=" + funcionarios + ", LinguaDesejada=" + LinguaDesejada + "]";
	}
	
	

}