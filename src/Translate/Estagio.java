package Translate;

public class Estagio extends Tradutores {
	
	private Integer TaxadeTraducao;

	public Integer getTaxadeTraducao() {
		return TaxadeTraducao;
	}
	public void setTaxadeTraducao(Integer taxadeTraducao) {
		TaxadeTraducao = taxadeTraducao;
	}


	public Estagio(String nome, String lingua, Integer idade, Double custo,
			Integer taxadeTraducao) {
		super(nome, lingua, idade, custo);
		TaxadeTraducao = taxadeTraducao;
	}
	
	@Override
	public void InfoTradutor() {
		System.out.println("O tradutor " + getNome() + " tem " + getIdade() + " anos e, tem como proficiência a lingua: \n" + getLingua() + "\n");
		System.out.println("O custo de contratação é de R$" + getCusto() + " a cada 1000 palavras, e o tradutor corrige " + getTaxadeTraducao() + " palavras a cada hora");
	}
	
	@Override
	public double Tempo(int palavras) {
		double TempoCorrido = (palavras / TaxadeTraducao);
		return TempoCorrido;
	}
	
	@Override
	public double Custototal(int palavras) {
		return (getCusto() * (palavras / 1000));
	}
	
	@Override
	public String tipo() {
		return "Estágio";
	}
	
	

}
