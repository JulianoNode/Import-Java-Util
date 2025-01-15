package collevetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Vetor_ {
	public String VetorMatrix_Run() {
		
		String collec = "\n\tCollection<E>: A interface raiz para a hierarquia de coleções.\n";
		System.err.println(collec);

		CollVet collVet = new CollVet();
		System.out.println(collVet.runVet());

		return "_________________________________________";
	}
}

class CollVet {
	public String runVet() {
		// Criando um vetor de Strings
		String[] vetor = { "João", "Maria", "Carlos", "Ana" };

		// Convertendo o vetor para uma Collection (List)
		Collection<String> colecao = Arrays.asList(vetor);

		// Exibindo os elementos da Collection
		System.out.println("Elementos da Collection:");
		for (String nome : colecao) {
			System.out.println(nome);
		}

		// Adicionando um novo elemento na Collection (não será permitido)
		// colecao.add("Lucas"); // Isso geraria uma UnsupportedOperationException

		// Criando uma nova lista para demonstrar a adição
		List<String> lista = new ArrayList<>(colecao);
		lista.add("Lucas");
		lista.add("Juca");
		lista.add("Lila");

		// Exibindo a lista atualizada
		System.out.println("\nLista atualizada:");
		for (String nome : lista) {
			System.err.println(nome);

		}
		return "***** Codigo usando Vetor *****";
	}
}
