package collevetor;

import java.util.ArrayList;
import java.util.Collection;

import util.Linhas;

public class For_Matrix {
	public String matrix_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tCollection<E>: A interface raiz para a hierarquia de coleções.\n";
		System.err.println(collec);
		
		Matrix_Int matrix = new Matrix_Int();
		System.out.println(matrix.run_Matrix());
		linhas.run_LinhaRed();
		
		Matrix_String matrixS = new Matrix_String();
		System.out.println(matrixS.run_MatrixString());
		linhas.run_LinhaRed();		
		
		Matrix_Double matrixD = new Matrix_Double();
		System.out.println(matrixD.MaDouble_Run());
		
		return "_________________________________________";		
	}
}

class Matrix_Double{
	
	public String MaDouble_Run() {
		
        String[][] binaryMatrix = {
                {"110", "101","1101", "1011"},
                {"011", "100","1010", "1001"}
            };

            // Usar uma Collection para armazenar os valores binários convertidos para Double
            Collection<Double> binaryValues = new ArrayList<>();

            // Converter cada valor binário para Double e adicionar à coleção
            for (int i = 0; i < binaryMatrix.length; i++) {
                for (int j = 0; j < binaryMatrix[i].length; j++) {
                    String binaryString = binaryMatrix[i][j];
                    // Converter o número binário para inteiro e depois para Double
                    int decimalValue = Integer.parseInt(binaryString, 2);
                    binaryValues.add((double) decimalValue);
                }
            }

            // Exibir os valores armazenados na Collection
            System.out.println("Valores binários convertidos para Double:");
            for (Double value : binaryValues) {
            	
                System.out.println("|_ "+value);
            }
		
		return "***** Codigo usando For com Matrix Usando Double *****";
		
	}
}

class Matrix_String{
	
	public String run_MatrixString() {
		
        // Definindo uma matriz 2D de strings
        String[][] matrix = {
            {"Java", "Python", "C++"},
            {"Ruby", "JavaScript", "Go"},
            {"PHP", "Swift", "Kotlin"}
        };

        // Criando uma coleção (ArrayList) para armazenar as strings da matriz
        Collection<String> collection = new ArrayList<>();

        // Percorrendo a matriz e adicionando os elementos na coleção
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                collection.add(matrix[i][j]);
            }
        }

        // Imprimindo a coleção
        System.out.println("Elementos na coleção:");
        for (String language : collection) {
            System.out.println("|_"+language);
        }
    		
		return "***** Codigo usando For com Matrix Usando String *****";		
	}
}


class Matrix_Int{
	public String run_Matrix() {

        // Criando uma matriz 2D usando Collection<E>
        Collection<Collection<Integer>> matrix = new ArrayList<>();

        // Adicionando linhas à matriz
        Collection<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        Collection<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        Collection<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        // Adicionando as linhas à matriz
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        // Imprimindo a matriz
        System.out.println("Matriz:");
        for (Collection<Integer> row : matrix) {
            System.out.println(row);
        }

        // Somando todos os elementos da matriz
        int sum = 0;
        for (Collection<Integer> row : matrix) {
            for (Integer value : row) {
                sum += value;
            }
        }
        System.out.println("Soma dos elementos: " + sum);

		return "***** Codigo usando For com Matrix Usando Numeros Inteiros *****";	
	}
}

