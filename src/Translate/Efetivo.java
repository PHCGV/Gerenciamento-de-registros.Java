package Translate;

public class Efetivo extends Tradutores{
	
	private Integer TaxadeTraducao;
	
	public Integer getTaxadeTraducao() {
		return TaxadeTraducao;
	}
	public void setTaxadeTraducao(Integer taxadeTraducao) {
		TaxadeTraducao = taxadeTraducao;
	}
	
	public Efetivo(String nome, String lingua, Integer idade, Double custo, Integer taxadeTraducao) {
		super(nome, lingua, idade, custo);
		TaxadeTraducao = taxadeTraducao;
	}
	
	@Override
	public void InfoTradutor() {
		System.out.println("O tradutor " + getNome() + " tem " + getIdade() + " anos e, tem como proficiência a lingua: \n" + getLingua() + "\n");
		System.out.println("O custo de contratação é de R$ " + getCusto() + " mensalmente e, o tradutor corrige " + getTaxadeTraducao() +" palavras a cada hora");
		
	}
	
	@Override
	public double Tempo(int palavras) {
		double TempoCorrido = (palavras / TaxadeTraducao);
		return TempoCorrido;
	}
	@Override
	public double Custototal(int palavras) {
		return getCusto();
	}
	@Override
	public String tipo() {
		return "Efetivo";
	}

}
