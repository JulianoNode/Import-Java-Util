package collevetor;

import java.util.ArrayList;
import java.util.List;

import util.Linhas;

public class Vetor_ {
	public String VetorMatrix_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tList<E>: Representa uma lista ordenada.\n";
		System.err.println(collec);

		linhas.run_LinhaRed();
		CollVet collVet = new CollVet();
		System.out.println(collVet.runVet());
		
		linhas.run_LinhaRed();
		CollVet_1 collVet_1 = new CollVet_1();
		System.out.println(collVet_1.runVet_1());

		return "_________________________________________";
	}
}

//Corpo da Classe
@interface Matrix3D {
	int depth();

	int rows();

	int columns();
}

@Matrix3D(depth = 3, rows = 3, columns = 3)
class CollVet {
	public String runVet() {
		int depth = 3, rows = 3, columns = 3;
		List<List<List<Integer>>> matrix3D = new ArrayList<>();

		// Preenchendo a matriz 3D com valores
		for (int i = 0; i < depth; i++) {
			List<List<Integer>> matrix2D = new ArrayList<>();
			for (int j = 0; j < rows; j++) {
				List<Integer> row = new ArrayList<>();
				for (int k = 0; k < columns; k++) {
					row.add(i * rows * columns + j * columns + k);
				}
				matrix2D.add(row);
			}
			matrix3D.add(matrix2D);
		}

		// Exibindo a matriz 3D
		for (List<List<Integer>> matrix2D : matrix3D) {
			for (List<Integer> row : matrix2D) {
				System.out.println(row);
			}
		}
		return "***** Codigo usando Vetor *****";
	}
}

//Corpo da Classe
@interface DataInfo {
	String version();
}

@DataInfo(version = "1.0")
class CollVet_1 {
	public String runVet_1() {
		int size = 4;
		List<List<Integer>> matrix = new ArrayList<>();

		// Inicializando a matriz com valores baseados em cálculos
		for (int i = 0; i < size; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				row.add(i * size + j);
			}
			matrix.add(row);
		}

		// Manipulação de dados na matriz (exemplo: transpor a matriz)
		List<List<Integer>> transposedMatrix = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				row.add(matrix.get(j).get(i));
			}
			transposedMatrix.add(row);
		}

		// Exibindo a matriz transposta
		System.out.println("Transposed Matrix:");
		for (List<Integer> row : transposedMatrix) {
			System.out.println(row);
		}

		return "***** Codigo usando Vetor *****";
	}
}
