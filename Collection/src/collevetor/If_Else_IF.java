package collevetor;

import java.util.ArrayList;
import java.util.Collection;

import util.Linhas;

public class If_Else_IF {
	public String If_Else_IF_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tCollection<E>: A interface raiz para a hierarquia de coleções.\n";
		System.err.println(collec);

		If_Else_Inteiro if_else = new If_Else_Inteiro();
		System.out.println(if_else.ifElse_Run());
		linhas.run_LinhaRedNew();

		If_Else_String if_Else_String = new If_Else_String();
		System.out.println(if_Else_String.ifElse1_Run());
		linhas.run_LinhaRedNew();

		If_Else_Matrix else_Matrix = new If_Else_Matrix();
		System.out.println(else_Matrix.ifElseMatrix_Run());


		return linhas.run_LinhaRed();
	}
}

class If_Else_Matrix {
	public String ifElseMatrix_Run() {

		// Criando uma Collection (usando ArrayList como implementação)
		Collection<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(12);
		numeros.add(20);
		numeros.add(7);
		numeros.add(19);
		numeros.add(39);
		numeros.add(32);
		numeros.add(40);
		numeros.add(49);
		numeros.add(60);
		numeros.add(59);
		numeros.add(52);
		numeros.add(57);
		numeros.add(36);
		numeros.add(25);
		numeros.add(17);
		numeros.add(30);
		numeros.add(27);
		numeros.add(45);
		numeros.add(1);
		numeros.add(46);
		numeros.add(30);
		numeros.add(15);

		numeros.add(2);
		numeros.add(14);
		numeros.add(9);
		numeros.add(10);

		// Definindo uma matriz para categorizar os números
		// [0][x]: Números menores que 10
		// [1][x]: Números entre 10 e 15
		// [2][x]: Números maiores que 15
		int[][] matriz = new int[4][numeros.size()];
		int[] contadores = new int[4]; // Contadores para preencher a matriz

		// Iterando sobre os números da Collection
		for (int numero : numeros) {
			if (numero < 15) {
				matriz[0][contadores[0]++] = numero;
			} else if (numero <= 30) {
				matriz[1][contadores[1]++] = numero;
			} else if (numero <= 45) {
				matriz[2][contadores[2]++] = numero;
			} else {
				matriz[3][contadores[3]++] = numero;
			}
		}

		// Exibindo os resultados
		System.out.println("Números menores que 0 a 15:");
		for (int i = 0; i < contadores[0]; i++) {
			System.err.print(matriz[0][i] + " ");
		}
		System.out.println("\n\nNúmeros entre  16 a 30:");
		for (int i = 0; i < contadores[1]; i++) {
			System.err.print(matriz[1][i] + " ");
		}
		System.out.println("\n\nNúmeros maiores que 31 a 45:");
		for (int i = 0; i < contadores[2]; i++) {
			System.err.print(matriz[2][i] + " ");
		}
		System.out.println("\n\nNúmeros maiores que 46 a 60:");
		for (int i = 0; i < contadores[3]; i++) {
			System.err.print(matriz[3][i] + " ");
		}
		return "\n\n\n***** Codigo usando comandos If_Else_IF usando Matrix *****";
	}
}

class If_Else_String {
	public String ifElse1_Run() {
		// Criando uma coleção de strings
		Collection<String> palavras = new ArrayList<>();
		palavras.add("Java");
		palavras.add("Python");
		palavras.add("C++");
		palavras.add("JavaScript");
		palavras.add("Ruby");
		palavras.add("HTML");
		palavras.add("C#");
		palavras.add("Gol");
		palavras.add("Node");
		palavras.add("CSS");

		// Iterando pela coleção e aplicando condições com if-else if
		for (String palavra : palavras) {
			if (palavra.equalsIgnoreCase("Java")) {
				System.out.println("Encontrado: Linguagem Java");
			} else if (palavra.equalsIgnoreCase("Python")) {
				System.out.println("Encontrado: Linguagem Python");
			} else if (palavra.equalsIgnoreCase("C++")) {
				System.out.println("Encontrado: Linguagem C++");
			} else if (palavra.equalsIgnoreCase("CSS")) {
				System.out.println("Encontrado: Linguagem CSS");
			} else if (palavra.equalsIgnoreCase("HTML")) {
				System.out.println("Encontrado: Linguagem HTML");
			} else if (palavra.equalsIgnoreCase("Node")) {
				System.out.println("Encontrado: Linguagem Node");
			} else {
				System.err.println("Outra linguagem: " + palavra);
			}
		}
		return "\n\n\n***** Codigo usando comandos If_Else_IF com String *****";
	}
}

class If_Else_Inteiro {
	public String ifElse_Run() {
		// Criando uma coleção de números inteiros
		Collection<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(25);
		numeros.add(30);
		numeros.add(45);
		numeros.add(50);

		// Iterando pela coleção e aplicando condições
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " é par.");
			} else if (numero % 5 == 0) {
				System.out.println("O número " + numero + " é múltiplo de 5, mas ímpar.");
			} else {
				System.out.println("O número " + numero + " não atende às condições anteriores.");
			}
		}

		return "\n\n\n***** Codigo usando comandos If_Else_IF com numeros inteiros *****";

	}
}