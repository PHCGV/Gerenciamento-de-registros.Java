package Translate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	    public static void main(String[] args) throws IOException {
	    	
	    	Scanner sc = new Scanner(System.in);
	    	Contratar contrato = new Contrato();
	    	boolean Loop = true;
	 
	    	// --------------------------------------------------------------------------------------------------------------------
	    	
	    	List<Tradutores> lista = new ArrayList<>();
	    	List<Clientes> clientes = new ArrayList<>();
	    	
	    	lista.add(new Estagio("Ana", "Inglês", 22, 350.0, 70));
	        lista.add(new Efetivo("Carlos", "Espanhol", 37, 1427.28, 82));
	        lista.add(new Efetivo("Jotinha", "Inglês", 20, 2024.00, 102));
	        lista.add(new Estagio("City", "Japonês", 20, 310.24, 40));
	        lista.add(new Efetivo("Batista", "Francês", 20, 2115.0, 110));
	        lista.add(new Efetivo("Pitoco", "Chinês", 20, 2115.0, 110));
	        lista.add(new Estagio("Raiam", "Russo", 33, 370.69, 60));
	        
	        clientes.add(new Clientes("Workana", new ArrayList<>(), "Inglês"));
	        clientes.add(new Clientes("LinkedIn", new ArrayList<>(), "Espanhol"));
	        clientes.add(new Clientes("Senai Cimatec", new ArrayList<>(), "Qualquer lingua"));

	        // --------------------------------------------------------------------------------------------------------------------
	        
	        while(Loop == true) {
	        	System.out.println("\nBem-vindo ao programa de contratação de tradutores, com base na seguinte listagem, digite o número correspondente ao que você procura!");
		        System.out.println("\n1 - Contratar tradutores para uma empresa\n2 - Demitir tradutores da uma empresa\n3 - Alterar dados de algum tradutor\n4 - Exibir tradutores de uma empresa ");
		        System.out.println("\nCaso queira sair do programa, digite o número 0");
		        Integer opcao = sc.nextInt();
		        sc.nextLine();
		        
		        if(opcao == 1) {
		        	System.out.println("\nOs tradutores disponíveis são: ");
		        	contrato.exibirNomesIdade(lista);
		        	contrato.contratarTradutor(lista, clientes, sc);
		        }
		        if(opcao == 2) {
		        	System.out.println("\nDigite o nome da Empresa que você deseja demitir um funcionário: ");
		        	String dem = sc.nextLine();
		        	contrato.exibirTradutoresDeCliente(clientes, dem);
		        	System.out.println("Digite o nome do tradutor que você deseja demitir: \n");
	                String nome = sc.nextLine();
	                contrato.demitirTradutor(clientes, nome);
		        }
		        if(opcao == 3) {
		        	System.out.println("\nDigite o nome do tradutor que deseja alterar alterar: ");
	                String nome = sc.nextLine();
	                contrato.alterarDadosTradutor(lista, nome, sc);
		        }
		        if(opcao == 4) {
		        	System.out.println("\nDigite o nome da empresa para exibir os tradutores:");
	                String nomeCliente = sc.nextLine();
	                contrato.exibirTradutoresDeCliente(clientes, nomeCliente);
		        }else if(opcao == 0) {
		        	System.out.println("\nPrograma encerrado, obrigado pela atenção! ");
		        	Loop = false;
		        }
		        
		    }

	        }
	        
	}

