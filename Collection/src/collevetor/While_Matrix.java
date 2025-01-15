package collevetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import util.Linhas;

public class While_Matrix {
	public String VetorMatrix_Run() {
		
		Linhas linhas = new Linhas();
		String collec = "\n\tCollection<E>: A interface raiz para a hierarquia de coleções.\n";
		System.err.println(collec);

		WhileMatrix matrix = new WhileMatrix();
		System.out.println(matrix.run_Matrix2D());
		linhas.run_LinhaRed();
		
		WhileMatSimples simples = new WhileMatSimples();
		System.out.println(simples.run_Simples());
		linhas.run_LinhaRed();
		
		WhileMat2D mat2d = new WhileMat2D();
		System.out.println(mat2d.run_2D());
		linhas.run_LinhaRed();
		
		WhileMatElementos elementos = new WhileMatElementos();
		System.out.println(elementos.run_Modificador());
		linhas.run_LinhaRed();
		
		WhileMat3D mat3d = new WhileMat3D();
		System.out.println(mat3d.run_3D());
		linhas.run_LinhaRed();
		
		WhileMatSoma soma = new WhileMatSoma();
		System.out.println(soma.run_Soma());
		return "_________________________________________";
	}
}

class WhileMatrix {
	public String run_Matrix2D() {
		
        // Criando uma coleção de List<Integer> que representam as linhas da matriz
        Collection<List<Integer>> matrix = new ArrayList<>();
        
        // Criando a matriz 3x3
        List<Integer> row1 = Arrays.asList(1, 2, 3);
        List<Integer> row2 = Arrays.asList(4, 5, 6);
        List<Integer> row3 = Arrays.asList(7, 8, 9);
        
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        
        // Usando um laço while para percorrer a coleção de listas (matriz)
        Iterator<List<Integer>> iterator = matrix.iterator();
        
        while (iterator.hasNext()) {
            List<Integer> row = iterator.next();
            System.out.println(row);
        }
		return "***** Codigo usando comandos While Matrix utilizando Soma *****";
	}
}

class WhileMatSimples {
	public String run_Simples() {
        // Criando uma coleção para armazenar a matriz
        Collection<Integer> collection = new ArrayList<>();
        
        // Preenchendo a coleção com valores da matriz
        for (int i = 1; i <= 9; i++) {
            collection.add(i);
        }
        System.out.println(collection.size());
        // Usando o laço while para iterar sobre a coleção
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
		return "***** Codigo usando comandos While Matrix Simples *****";
	}
}

class WhileMat2D {
	public String run_2D() {

		// Criando uma matriz 2D
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Criando uma coleção para armazenar as linhas da matriz
		Collection<List<Integer>> matrixCollection = new ArrayList<>();

		// Convertendo as linhas da matriz para List e adicionando à coleção
		for (int i = 0; i < matrix.length; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < matrix[i].length; j++) {
				row.add(matrix[i][j]);
			}
			matrixCollection.add(row);
		}

		// Iterando sobre a coleção e exibindo as linhas da matriz
		Iterator<List<Integer>> iterator = matrixCollection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println("\n\n");
		return "***** Codigo usando comandos While Matrix utilizando 2D *****";
	}
}

class WhileMatElementos {
	public String run_Modificador() {
		// Criando uma coleção de inteiros
		Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// Usando um iterator para percorrer e modificar a coleção
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Integer number = iterator.next();
			if (number % 2 == 0) {
				iterator.remove(); // Removendo números pares
			}
		}

		// Exibindo a coleção após remoção
		System.out.println("Coleção após remoção dos pares: " + numbers);
		return "***** Codigo usando comandos While Matrix utilizando modificar os elementos *****";
	}
}

class WhileMat3D {
	public String run_3D() {

		// Criando uma coleção para armazenar uma matriz 3D
		Collection<Collection<Collection<Integer>>> matrix3D = new ArrayList<>();

		// Criando 3 camadas de 2D
		Collection<Collection<Integer>> layer1 = new ArrayList<>();
		Collection<Collection<Integer>> layer2 = new ArrayList<>();
		Collection<Collection<Integer>> layer3 = new ArrayList<>();

		// Preenchendo as camadas com linhas
		layer1.add(Arrays.asList(1, 2, 3));
		layer1.add(Arrays.asList(4, 5, 6));

		layer2.add(Arrays.asList(7, 8, 9));
		layer2.add(Arrays.asList(10, 11, 12));

		layer3.add(Arrays.asList(13, 14, 15));
		layer3.add(Arrays.asList(16, 17, 18));

		// Adicionando as camadas à matriz 3D
		matrix3D.add(layer1);
		matrix3D.add(layer2);
		matrix3D.add(layer3);

		// Exibindo a matriz 3D
		for (Collection<Collection<Integer>> layer : matrix3D) {
			for (Collection<Integer> row : layer) {
				System.out.println(row);
			}
		}
		return "***** Codigo usando comandos While Matrix utilizando exemplo 3D *****";
	}
}

class WhileMatSoma {

	public String run_Soma() {

		// Criando uma coleção para armazenar a matriz
		Collection<List<Integer>> matrix = new ArrayList<>();

		// Preenchendo a matriz
		matrix.add(Arrays.asList(1, 2, 3));
		matrix.add(Arrays.asList(4, 5, 6));
		matrix.add(Arrays.asList(7, 8, 9));
		matrix.add(Arrays.asList(17, 18, 11));
		matrix.add(Arrays.asList(5, 3, 1));
		
		System.out.println(matrix);
		System.out.println(matrix.size());

		// Usando o while para somar os elementos
		Iterator<List<Integer>> iterator = matrix.iterator();
		int sum = 0;

		while (iterator.hasNext()) {
			List<Integer> row = iterator.next();
			for (Integer num : row) {
				sum += num;
			}
		}

		// Exibindo o resultado da soma
		System.out.println("A soma dos elementos da matriz é: " + sum);
		
		System.out.println("\n\n");
		return "***** Codigo usando comandos While Matrix utilizando Soma *****";
	}
}
