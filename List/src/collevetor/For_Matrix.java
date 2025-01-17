package collevetor;

import java.util.ArrayList;
import java.util.List;

import util.Linhas;

public class For_Matrix {
	public String matrix_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tList<E>: Representa uma lista ordenada.\n";
		System.err.println(collec);

		linhas.run_LinhaRed();
		Matrix_1 matrix1 = new Matrix_1();
		System.out.println(matrix1.MaDouble_Run1());

		linhas.run_LinhaRed();
		Matrix_2 matrix2 = new Matrix_2();
		System.out.println(matrix2.MaDouble_Run2());

		linhas.run_LinhaRed();
		Matrix_3 matrix3 = new Matrix_3();
		System.out.println(matrix3.MaDouble_Run3());

		return "_________________________________________";
	}
}

//Corpo da Classe
class Matrix_1 {

	@interface MatrixProcessorInfo {
		String author()

		default "Unknown";

		String version() default "1.0";
	}

	@MatrixProcessorInfo(author = "João", version = "1.1")
	public String MaDouble_Run1() {

		List<List<Integer>> matrix = new ArrayList<>();

		// Preenchendo a matriz com listas de inteiros
		for (int i = 0; i < 5; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < 4; j++) {
				row.add(i * j);
			}
			matrix.add(row);
		}

		// Processando a matriz
		for (List<Integer> row : matrix) {
			for (Integer value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		// Exibindo a anotação
		if (Matrix_1.class.isAnnotationPresent(MatrixProcessorInfo.class)) {
			MatrixProcessorInfo info = Matrix_1.class.getAnnotation(MatrixProcessorInfo.class);
			System.err.println("Author: " + info.author());
			System.out.println("Version: " + info.version());
		}

		return "***** Codigo usando For com Matrix Usando Double *****";

	}
}

//Corpo da Classe
@interface MatrixInfo {
	String author() default "Unknown";
}

class Matrix_2 {

	// Método que popula uma matriz 2D e utiliza List<E> para armazenar os valores
	public static List<Integer> populateMatrix(int rows, int cols) {
		List<Integer> matrixList = new ArrayList<>();

		// Preenchendo a lista com valores de uma matriz 2D
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrixList.add(i * j); // Exemplo simples, multiplicando os índices
			}
		}
		return matrixList;
	}

	// Método que imprime a matriz em formato de matriz
	public static void printMatrix(List<Integer> matrixList, int rows, int cols) {
		int index = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrixList.get(index++) + "\t");
			}
			System.out.println();
		}
	}



	public String MaDouble_Run2() {

		int rows = 11;
		int cols = 5;

		// Criação de uma instância da classe MatrixOperations
		Matrix_2 matrixOps = new Matrix_2();

		// Popula a matriz
		List<Integer> matrixList = matrixOps.populateMatrix(rows, cols);

		// Imprime a matriz
		matrixOps.printMatrix(matrixList, rows, cols);

		// Obtendo e exibindo a annotation
		MatrixInfo matrixInfo = Matrix_2.class.getAnnotation(MatrixInfo.class);
		if (matrixInfo != null) {
			System.out.println("\nMatrixInfo Annotation:");
			System.out.println("Author: " + matrixInfo.author());

		}

		return "***** Codigo usando For com Matrix Usando Double *****";

	}
}

//Corpo da Classe
@interface DataType {
	String value() default "Integer";
}

@DataType(value = "String")
class Matrix_3 {

	public String MaDouble_Run3() {

		List<List<String>> matrix = new ArrayList<>();

		// Criando uma matriz de listas de Strings
		for (int i = 0; i < 5; i++) {
			List<String> row = new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				row.add("Item " + (i * 3 + j));
			}
			matrix.add(row);
		}

		// Processando a matriz
		for (List<String> row : matrix) {
			for (String value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}

		// Exibindo a anotação
		if (Matrix_3.class.isAnnotationPresent(DataType.class)) {
			DataType dataType = Matrix_3.class.getAnnotation(DataType.class);
			System.out.println("Data Type: " + dataType.value());
		}

		return "***** Codigo usando For com Matrix Usando Double *****";

	}
}
