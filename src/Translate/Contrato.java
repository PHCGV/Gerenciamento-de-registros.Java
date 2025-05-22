package Translate;

import java.util.List;
import java.util.Scanner;

public class Contrato implements Contratar {
	
	
	// Funções

			@Override
			public void exibirNomes(List<Tradutores> lista) {
					    	for(Tradutores t : lista) {
				        		System.out.println(t.getNome() + " - Linguagem: " + t.getLingua());
				      }
					}
			
			@Override
			public void exibirNomesIdade(List<Tradutores> lista) {
			    lista.sort((t1, t2) -> t1.getIdade().compareTo(t2.getIdade())); // achei num forum
			    for (Tradutores t : lista) {
			        System.out.println(t.getNome() + " - Idade: " + t.getIdade() + " - Linguagem: " + t.getLingua());
			    		}
					}
	
			@Override
			  public void exibirClientes(List<Clientes> clientes) {
			        for (Clientes cliente : clientes) {
			            System.out.println(cliente.getNome());
			        }
			    }
			
			// ----------------------------------------------------------------------------------------
			  @Override
			 public Tradutores encontrarTradutor(List<Tradutores> lista, String nome) {
			        for (Tradutores tradutor : lista) {
			            if (tradutor.getNome().equalsIgnoreCase(nome)) {
			                return tradutor;
			            }
			        }
			        return null;
			    }
			 @Override
			 public Clientes encontrarCliente(List<Clientes> lista, String nome) {
			        for (Clientes cliente : lista) {
			            if (cliente.getNome().equalsIgnoreCase(nome)) {
			                return cliente;
			            }
			        }
			        return null;
			    }
			 
			 //-------------------------------------------------------------------------
			 
			 public void contratarTradutor(List<Tradutores> lista, List<Clientes> clientes, Scanner sc) {
				 	Integer opt = 0;
			        System.out.println("\nDigite o nome do tradutor para contratar:");
			        String nomeTradutor = sc.nextLine();
			        Tradutores tradutor = encontrarTradutor(lista, nomeTradutor);
			        tradutor.InfoTradutor();
			        if(tradutor.tipo() == "Estágio") {
			        	System.out.println("\nAinda deseja contratar esse funcionário? Digite 1 para fazer uma estimativa de valor da sua tradução");
			        	System.out.println("Digite 0 caso não queira contratar esse funcionário");
			        	opt = sc.nextInt();
			        	sc.nextLine();
			        	if(opt == 1) {
			        		System.out.println("\nQuantas palavras você deseja traduzir?");
			        		Integer pal = sc.nextInt();
			        		sc.nextLine();
			        		System.out.println("\nO tradutor " + tradutor.getNome() + " terá o custo de R$" + tradutor.Custototal(pal) + " e levará "+ tradutor.Tempo(pal) + " horas para concluir o trabalho");
			        		System.out.println("\n Deseja contratar esse funcionário? Digite 1 para Sim e 0 para Não");
			        		opt = sc.nextInt();
			        		sc.nextLine();
			        		if(opt == 1) tradutor.setCusto(tradutor.Custototal(pal));
			        	}
			        }if(tradutor.tipo() == "Efetivo") {
			        	System.out.println("\n Ainda deseja contratar esse funcionário? Digite 1 para Sim e 0 para Não");
				        opt = sc.nextInt();
				        sc.nextLine();
			        } 
			        if(opt == 1) {
				            System.out.println("Digite o nome do cliente:");
				            String nomeCliente = sc.nextLine();
				            Clientes cliente = encontrarCliente(clientes, nomeCliente);
				            cliente.getFuncionarios().add(tradutor);
				            System.out.println("Tradutor " + tradutor.getNome() + " contratado para o cliente " + cliente.getNome() + "!");
			        } else {
			        	return;
			        }

			    }

			 @Override
			public void demitirTradutor(List<Clientes> clientes, String nome) {
		        for (Clientes c : clientes) {
		            Tradutores tradutor = encontrarTradutor(c.getFuncionarios(), nome);
		            if (tradutor != null) {
		                c.getFuncionarios().remove(tradutor);
		                System.out.println("Tradutor " + tradutor.getNome() + " demitido da empresa " + c.getNome() + "!");
		                return;
		            }
		        }
		        System.out.println("Tradutor não encontrado!");
		    }
		    
			//--------------------------------------------------------------------------------
			@Override
			 public void alterarDadosTradutor(List<Tradutores> lista, String nome, Scanner sc) {
			        Tradutores tradutor = encontrarTradutor(lista, nome);
			        if (tradutor != null) {
			        	System.out.println("Deseja alterar o nome do tradutor? Digite 1 para Sim e 0 para Não");
			        	Integer opt = sc.nextInt();
			        	sc.nextLine();
			        	if(opt == 1) {
			        		System.out.println("Digite o novo nome:");
				            String novoNome = sc.nextLine();
				            tradutor.setNome(novoNome);
			        	}
			        	System.out.println("Deseja alterar o idioma do tradutor? Digite 1 para Sim e 0 para Não");
			        	opt = sc.nextInt();
			        	sc.nextLine();
			        	if(opt == 1) {
			        		System.out.println("Digite o novo idioma:");
				            String novoIdioma = sc.nextLine();
				            tradutor.setLingua(novoIdioma);
			        	}
			        	System.out.println("Deseja alterar a idade do tradutor? Digite 1 para Sim e 0 para Não");
			        	opt = sc.nextInt();
			        	sc.nextLine();
			        	if(opt == 1) {
			        		System.out.println("Digite a nova idade:");
				            Integer novaIdade = sc.nextInt();
				            tradutor.setIdade(novaIdade);
			        	}
			        	System.out.println("Deseja alterar o custo do tradutor? Digite 1 para Sim e 0 para Não");
			        	opt = sc.nextInt();
			        	sc.nextLine();
			        	if(opt == 1) {
			        		System.out.println("Digite o novo custo:");
				            Double novoCusto = sc.nextDouble();
				            tradutor.setCusto(novoCusto);
			        	}
			            System.out.println("Dados alterados!");
			        } else {
			            System.out.println("Tradutor não encontrado!");
			        }
			    }
			 
			 //----------------------------------------------------------
			 @Override
			 public void exibirTradutoresDeCliente(List<Clientes> clientes, String nomeCliente) {
				  Clientes cliente = encontrarCliente(clientes, nomeCliente);
			        if (cliente != null) {
			            System.out.println("\nTradutores da empresa " + cliente.getNome() + ":");
			            for (Tradutores t : cliente.getFuncionarios()) {
			                System.out.println(t.getNome() + " - Linguagem: " + t.getLingua() + " - Custo: R$" + t.getCusto() + " - Contrato do tipo: " + t.tipo() + " - Idade: " + t.getIdade() + " anos");
			            }
			        } else {
			            System.out.println("Cliente não encontrado!");
			        }
			    }
			 
}
