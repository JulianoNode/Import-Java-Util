package collevetor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

import util.Linhas;

public class Simples {
	public String Simples_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tCollection<E>: A interface raiz para a hierarquia de coleções.\n";
		System.err.println(collec);

		Basico basico = new Basico();
		System.out.println(basico.run_Basico());
		linhas.run_LinhaRed();

		BasicoMetodo basicoMetodo = new BasicoMetodo();
		System.out.println(basicoMetodo.run_BasicoMetodo());
		linhas.run_LinhaRed();

		BasicoComplexo basicoComplexo = new BasicoComplexo();
		System.out.println(basicoComplexo.run_BasicoComplexo());

		return "_________________________________________";
	}
}

class Basico {
	public String run_Basico() {

		// Criando uma coleção do tipo ArrayList
		Collection<String> minhaColecao = new ArrayList<>();

		// Adicionando elementos à coleção
		minhaColecao.add("Java");
		minhaColecao.add("Python");
		minhaColecao.add("C++");

		// Exibindo a coleção
		System.out.println("Minha coleção: " + minhaColecao);

		// Verificando se a coleção contém um elemento
		boolean contemJava = minhaColecao.contains("Java");
		System.out.println("Contém 'Java'? " + contemJava);

		// Removendo um elemento da coleção
		minhaColecao.remove("Python");

		// Exibindo a coleção após remoção
		System.out.println("Minha coleção após remoção: " + minhaColecao);

		// Verificando o tamanho da coleção
		System.out.println("Tamanho da coleção: " + minhaColecao.size());

		return "***** Codigo usando comandos Basico *****";
	}
}

class BasicoMetodo {
	public String run_BasicoMetodo() {

		Collection<Integer> numeros = new PriorityQueue<>();

		// Adicionando elementos
		numeros.add(15);
		numeros.add(5);
		numeros.add(25);

		// Verificando se a coleção contém um elemento
		System.out.println("Contém o número 5? " + numeros.contains(5));

		// Removendo um elemento
		numeros.remove(15);

		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + numeros.size());

		// Exibindo a coleção
		System.out.println("Coleção de números (ordem de prioridade): " + numeros);
		return "***** Codigo usando comandos Basico com Metodo *****";
	}
}

class BasicoComplexo {
	public String run_BasicoComplexo() {

		Collection<String> cidades = new TreeSet<>();

		// Adicionando elementos
		cidades.add("São Paulo");
		cidades.add("Rio de Janeiro");
		cidades.add("Belo Horizonte");
		cidades.add("Berlin");
		cidades.add("Rio Alagoas");
		cidades.add("Belo Sol");

		// Exibindo a coleção
		System.out.println("Coleção de cidades: " + cidades);
		// Verificando se a coleção contém um elemento
		System.out.println("Contém 'Rio de Janeiro'? " + cidades.contains("Rio de Janeiro"));
		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + cidades.size());

		// Removendo um elemento
		cidades.remove("Belo Horizonte");
		cidades.remove("Berlin");
		cidades.remove("Belo Sol");
		System.err.println("// Removendo os elemento: Belo Horizonte, Berlin, Belo Sol");

		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + cidades.size());

		// Exibindo a coleção
		System.out.println("Coleção de cidades: " + cidades);

		System.err.println("\n________________________________________________________________\n");
		System.out.println("_______________________** New Programa **_______________________\n");

		Collection<String> frutas = new LinkedList<>();

		// Adicionando elementos
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Laranja");
		frutas.add("Uva");
		frutas.add("Pera");
		frutas.add("Limão");

		System.out.println("Coleção de frutas: " + frutas);
		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + frutas.size());
		// Verificando se a coleção contém um elemento
		System.out.println("Contém 'Banana'? " + frutas.contains("Banana"));

		// Removendo um elemento
		frutas.remove("Laranja");
		frutas.remove("Pera");
		System.err.println("Removendo um elemento: Laranja e Pera");

		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + frutas.size());

		// Exibindo a coleção
		System.out.println("Coleção de frutas: " + frutas);

		System.err.println("\n________________________________________________________________\n");
		System.out.println("_______________________** New Programa **_______________________\n");

		Collection<Integer> numeros = new HashSet<>();

		// Adicionando elementos
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		numeros.add(60);

		System.out.println("Coleção de números: " + numeros);
		System.out.println("Tamanho da coleção: " + numeros.size());

		// Verificando se a coleção contém um elemento
		System.out.println("Contém o número 20? " + numeros.contains(20));

		// Removendo um elemento
		numeros.remove(30);
		System.err.println("Removendo um elemento: 30");

		// Tamanho da coleção
		System.out.println("Tamanho da coleção: " + numeros.size());

		// Exibindo a coleção
		System.out.println("Coleção de números: " + numeros);

		return "***** Codigo usando comandos Basico Complexo *****";
	}
}
