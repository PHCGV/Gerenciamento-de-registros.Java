package Translate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface Contratar {
	
	void contratarTradutor(List<Tradutores> lista, List<Clientes> clientes, Scanner sc) throws IOException;
    void demitirTradutor(List<Clientes> clientes, String nome);
    void alterarDadosTradutor(List<Tradutores> lista, String nome, Scanner sc);
    Tradutores encontrarTradutor(List<Tradutores> lista, String nome);
    Clientes encontrarCliente(List<Clientes> lista, String nome);
    void exibirNomes(List<Tradutores> lista);
    void exibirNomesIdade(List<Tradutores> lista);
    void exibirClientes(List<Clientes> clientes);
    void exibirTradutoresDeCliente(List<Clientes> clientes, String nomeCliente);

}
