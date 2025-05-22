package Translate;

public abstract class Tradutores {
	
	private Double custo;
	private String nome;
	private String lingua;
	private Integer idade;
	
	
	public Tradutores(String nome, String lingua, Integer idade, Double custo) {
		this.nome = nome;
		this.lingua = lingua;
		this.idade = idade;
		this.custo = custo;
	}
	
	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public abstract double Tempo(int palavras);
	
	public abstract void InfoTradutor();
	
	public abstract double Custototal(int palavras);
	
	public abstract String tipo();
	
}
