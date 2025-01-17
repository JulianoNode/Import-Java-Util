package collevetor;

import java.util.ArrayList;
import java.util.List;

import util.Linhas;

public class While_Matrix {
	public String VetorMatrix_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tList<E>: Representa uma lista ordenada.\n";
		System.err.println(collec);

		WhileMatSimples simples = new WhileMatSimples();
		System.out.println(simples.run_Simples());
		linhas.run_LinhaRed();

		WhileMat2D mat2d = new WhileMat2D();
		System.out.println(mat2d.run_2D());
		linhas.run_LinhaRed();

		return "_________________________________________";
	}
}

// Corpo da Classe
//Anotação personalizada
@interface Informacao {
	String descricao() default "Informações sobre a classe";
}

//Classe Pessoa com uma anotação personalizada
@Informacao(descricao = "Classe que representa uma pessoa")
class Pessoa {
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Pessoa{" + "nome = '" + nome + '\'' + ", idade = " + idade + '}';
	}
}

class WhileMatSimples {
	public String run_Simples() {
		// Criando uma matriz de objetos Pessoa
		Pessoa[][] matrizPessoas = new Pessoa[2][3];
		matrizPessoas[0][0] = new Pessoa("Ana", 25);
		matrizPessoas[0][1] = new Pessoa("Carlos", 30);
		matrizPessoas[0][2] = new Pessoa("Maria", 28);
		matrizPessoas[1][0] = new Pessoa("João", 22);
		matrizPessoas[1][1] = new Pessoa("Paula", 35);
		matrizPessoas[1][2] = new Pessoa("Ricardo", 40);

		// Lista para armazenar objetos Pessoa
		List<Pessoa> listaPessoas = new ArrayList<>();

		// Usando 'do-while' para adicionar elementos da matriz à lista
		int i = 0;
		int j = 0;
		do {
			listaPessoas.add(matrizPessoas[i][j]);
			j++;
			if (j == matrizPessoas[i].length) {
				j = 0;
				i++;
			}
		} while (i < matrizPessoas.length);

		// Exibindo a lista de pessoas
		System.out.println("Lista de pessoas:");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}

		// Verificando a anotação da classe Pessoa
		Informacao info = Pessoa.class.getAnnotation(Informacao.class);
		if (info != null) {
			System.out.println("Anotação encontrada: " + info.descricao());
		}

		return "***** Codigo usando comandos While Matrix Simples *****";
	}
}

//Corpo da Classe
@interface Matrix {
	String value() default "2D Matrix";
}

@Matrix(value = "3x3 Matrix Example")
class MatrixWithAnnotation {
	private int[][] matrix;

	public MatrixWithAnnotation(int rows, int cols) {
		matrix = new int[rows][cols];
	}

	public void setValue(int row, int col, int value) {
		matrix[row][col] = value;
	}

	public int getValue(int row, int col) {
		return matrix[row][col];
	}

	public List<Integer> getRow(int row) {
		List<Integer> rowList = new ArrayList<>();
		for (int col = 0; col < matrix[row].length; col++) {
			rowList.add(matrix[row][col]);
		}
		return rowList;
	}

	public List<List<Integer>> getMatrix() {
		List<List<Integer>> matrixList = new ArrayList<>();
		int row = 0;
		do {
			matrixList.add(getRow(row));
			row++;
		} while (row < matrix.length);
		return matrixList;
	}
}

class WhileMat2D {
	public String run_2D() {

		MatrixWithAnnotation matrix = new MatrixWithAnnotation(3, 3);

		// Preenchendo a matriz com alguns valores
		matrix.setValue(0, 0, 1);
		matrix.setValue(0, 1, 2);
		matrix.setValue(0, 2, 3);
		matrix.setValue(1, 0, 4);
		matrix.setValue(1, 1, 5);
		matrix.setValue(1, 2, 6);
		matrix.setValue(2, 0, 7);
		matrix.setValue(2, 1, 8);
		matrix.setValue(2, 2, 9);

		// Obtendo a matriz como uma lista
		List<List<Integer>> matrixList = matrix.getMatrix();
		for (List<Integer> row : matrixList) {
			System.out.println(row);
		}

		// Acessando a anotação
		Matrix annotation = MatrixWithAnnotation.class.getAnnotation(Matrix.class);
		if (annotation != null) {
			System.out.println("Matrix Info: " + annotation.value());
		}

		return "***** Codigo usando comandos While Matrix utilizando 2D *****";
	}
}
