package collevetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Linhas;

public class Simples {
	public String Simples_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tList<E>: Representa uma lista ordenada.\n";
		System.err.println(collec);

		Basico basico = new Basico();
		System.out.println(basico.run_Basico());
		linhas.run_LinhaRed();

		BasicoMetodo basicoMetodo = new BasicoMetodo();
		System.out.println(basicoMetodo.run_BasicoMetodo());
		linhas.run_LinhaRed();

		BasicoComplexo basicoComplexo = new BasicoComplexo();
		System.out.println(basicoComplexo.run_BasicoComplexo());
		linhas.run_LinhaRed();
		
		BasicoComplexo1 basicoComplexo1 = new BasicoComplexo1();
		System.out.println(basicoComplexo1.run_BasicoComplexo1());
		linhas.run_LinhaRed();
		
		BasicoComplexo2 basicoComplexo2 = new BasicoComplexo2();
		System.out.println(basicoComplexo2.run_BasicoComplexo2());

		return "_________________________________________";
	}
}

// Corpo da Classe

@SuppressWarnings("serial")
class Basico extends ArrayList<String> {
	@Override
	public boolean add(String e) {
		System.out.println("Adicionando: " + e);
		return super.add(e);
	}

	public String run_Basico() {

		List<String> lista = new Basico();
		lista.add("Item 1");
		lista.add("Item 2");
		lista.add("Item 3");
		lista.add("Item 4");

		return "\n\n***** Codigo usando comandos Basico *****";
	}
}

//Corpo da Classe

@FunctionalInterface
interface OperacaoLista {
	void executar(List<String> lista);
}

class BasicoMetodo {
	public String run_BasicoMetodo() {
		
		OperacaoLista imprimir = lista -> lista.forEach(System.err::println);
		List<String> nomes = Arrays.asList("Ana", "Carlos", "Beatriz");
		imprimir.executar(nomes);

		return "\n\n***** Codigo usando comandos Basico com Metodo *****";
	}
}

//Corpo da Classe

@interface ValidarLista {
	String mensagem() default "Lista não pode estar vazia!";
}

class ListaUtil {
	@ValidarLista(mensagem = "A lista de nomes não pode ser vazia!")
	public static void validarLista(List<String> lista) {
		if (lista.isEmpty()) {
			throw new IllegalArgumentException("Erro: " + ValidarLista.class.getDeclaredMethods()[0].getDefaultValue());
		}
	}
}

class BasicoComplexo {
	public String run_BasicoComplexo() {

		List<String> nomes = new ArrayList<>();
		
		try {
			ListaUtil.validarLista(nomes);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // Saída: Erro: Lista não pode estar vazia!
		}

		return "\n\n***** Codigo usando comandos Basico Complexo *****";
	}
}

//Corpo da Classe
@FunctionalInterface
interface Filtro {
	boolean testar(String s);
}

class BasicoComplexo1 {
	public String run_BasicoComplexo1() {

		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Carlos");
		nomes.add("Marcia");

		Filtro filtro = nome -> nome.startsWith("M");
		nomes.removeIf(nome -> !filtro.testar(nome));
		System.out.println(nomes); // Saída: [Maria]

		return "***** Codigo usando comandos Basico Complexo *****";
	}
}

//Corpo da Classe
class Produto {
	private String nome;

	public Produto(String nome) {
		this.nome = nome;
	}

	@Deprecated
	public String getNomeAntigo() {
		return nome;
	}

	public String getNomeNovo() {
		return nome;
	}
}

class BasicoComplexo2 {
	public String run_BasicoComplexo2() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Celular"));
		produtos.add(new Produto("Teclado"));
		produtos.add(new Produto("Radio"));
		
		System.out.println(produtos.get(0).getNomeAntigo()); // Aviso de método obsoleto
		System.out.println(produtos.get(1).getNomeAntigo()); // Aviso de método obsoleto
		System.out.println(produtos.get(2).getNomeAntigo()); // Aviso de método obsoleto


		return "\n\n***** Codigo usando comandos Basico Complexo *****\n\n";
	}
}