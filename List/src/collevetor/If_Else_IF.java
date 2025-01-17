package collevetor;

import java.util.ArrayList;
import java.util.List;

import util.Linhas;

public class If_Else_IF {
	public String If_Else_IF_Run() {

		Linhas linhas = new Linhas();
		String collec = "\n\tList<E>: Representa uma lista ordenada.\n";
		System.err.println(collec);
		linhas.run_LinhaRedNew();

		If_Else_Inteiro if_else = new If_Else_Inteiro();
		System.out.println(if_else.ifElse_Run());
		linhas.run_LinhaRedNew();

		If_Else_String if_Else_String = new If_Else_String();
		System.out.println(if_Else_String.ifElse1_Run());
		linhas.run_LinhaRedNew();

		If_Else_Matrix else_Matrix = new If_Else_Matrix();
		System.out.println(else_Matrix.ifElseMatrix_Run());
		linhas.run_LinhaRedNew();

		If_Else_Matrix1 else_Matrix1 = new If_Else_Matrix1();
		System.out.println(else_Matrix1.ifElseMatrix_Run1());

		linhas.run_LinhaRedNew();

		If_Else_Matrix4 else_Matrix4 = new If_Else_Matrix4();
		System.out.println(else_Matrix4.ifElseMatrix_Run4());

		linhas.run_LinhaRedNew();

		If_Else_Matrix7 else_Matrix7 = new If_Else_Matrix7();
		System.out.println(else_Matrix7.ifElseMatrix_Run7());

		return linhas.run_LinhaRed();
	}
}

//Corpo da Classe
class If_Else_Inteiro {

	// Definição do Record Produto
	record Produto(String nome, double preco, String categoria) {
	}

	public String ifElse_Run() {

		List<Produto> produtos = new ArrayList<>();

		// Adicionando produtos
		produtos.add(new Produto("Notebook", 3500.00, "Eletrônico"));
		produtos.add(new Produto("Smartphone", 2500.00, "Eletrônico"));
		produtos.add(new Produto("Livro Java", 150.00, "Livro"));
		produtos.add(new Produto("Cadeira Gamer", 1200.00, "Móveis"));
		produtos.add(new Produto("Mesa Escritório", 800.00, "Móveis"));

		// Filtrar produtos com base no preço e categoria
		filtrarProdutos(produtos, 2000.00, "Eletrônico");
		return "\n\n***** Codigo usando comandos If_Else_IF com numeros inteiros *****";
	}

	public static void filtrarProdutos(List<Produto> produtos, double precoMax, String categoria) {
		System.out.println("Produtos filtrados:");
		for (Produto p : produtos) {
			if (p.preco() <= precoMax && p.categoria().equalsIgnoreCase(categoria)) {
				System.out.println(p);
			} else if (p.preco() > precoMax && p.categoria().equalsIgnoreCase(categoria)) {
				System.out.println("Produto acima do preço máximo: " + p.nome());
			} else if (!p.categoria().equalsIgnoreCase(categoria)) {
				System.out.println("Produto de categoria diferente: " + p.nome());
			}
		}

	}

}

//Corpo da Classe

//Anotação personalizada
@interface ProductInfo {
	String category();

	double minPrice();
}

//Classe Produto
@ProductInfo(category = "Eletrônico", minPrice = 100.0)
class Product {
	String name;
	String category;
	double price;

	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
}

class If_Else_Matrix {
	public String ifElseMatrix_Run() {

		List<Product> products = new ArrayList<>();
		products.add(new Product("Celular", "Eletrônico", 1200));
		products.add(new Product("Fone de ouvido", "Eletrônico", 200));
		products.add(new Product("Livro", "Educação", 50));
		products.add(new Product("Monitor", "Eletrônico", 700));
		products.add(new Product("Caderno", "Educação", 30));

		// Filtrando produtos
		for (Product p : products) {
			if (p.category.equals("Eletrônico") && p.price > 1000) {
				System.out.println(p.name + " é um eletrônico caro.");
			} else if (p.category.equals("Eletrônico") && p.price > 500) {
				System.out.println(p.name + " é um eletrônico moderado.");
			} else if (p.category.equals("Eletrônico")) {
				System.out.println(p.name + " é um eletrônico barato.");
			} else if (p.category.equals("Educação") && p.price > 40) {
				System.out.println(p.name + " é um material educacional premium.");
			} else {
				System.out.println(p.name + " é um material educacional comum.");
			}
		}

		return "\n\n***** Codigo usando comandos If_Else_IF usando Matrix *****";
	}
}

//Corpo da Classe
class If_Else_String {

	public record Aluno(String nome, double nota) {
	}

	public String ifElse1_Run() {

		List<Aluno> alunos = List.of(new Aluno("Alice", 9.5), new Aluno("Bob", 6.0), new Aluno("Carlos", 4.5),
				new Aluno("Diana", 7.2));

		for (Aluno aluno : alunos) {
			if (aluno.nota() >= 9) {
				System.out.println(aluno.nome() + " está na categoria: Excelente.");
			} else if (aluno.nota() >= 7) {
				System.out.println(aluno.nome() + " está na categoria: Bom.");
			} else if (aluno.nota() >= 5) {
				System.out.println(aluno.nome() + " está na categoria: Regular.");
			} else {
				System.out.println(aluno.nome() + " está na categoria: Insuficiente.");
			}
		}

		return "\n\n***** Codigo usando comandos If_Else_IF com String *****";
	}
}

//Corpo da Classe
//Anotação personalizada
@interface Role {
	String level();
}

//Classe Usuário
@Role(level = "Admin")
class User {
	String name;
	String role;

	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}
}

class If_Else_Matrix1 {

	public String ifElseMatrix_Run1() {
		List<User> users = new ArrayList<>();
		users.add(new User("Alice", "Admin"));
		users.add(new User("Bob", "Editor"));
		users.add(new User("Charlie", "Viewer"));
		users.add(new User("David", "Editor"));
		users.add(new User("Eve", "Admin"));

		// Verificando níveis de acesso
		for (User u : users) {
			if (u.role.equals("Admin")) {
				System.out.println(u.name + " tem acesso total ao sistema.");
			} else if (u.role.equals("Editor")) {
				System.out.println(u.name + " pode editar conteúdos.");
			} else if (u.role.equals("Viewer")) {
				System.out.println(u.name + " pode apenas visualizar conteúdos.");
			} else {
				System.out.println(u.name + " tem um papel desconhecido.");
			}
		}
		return "\n\n***** Codigo usando comandos If_Else_IF usando Matrix *****";
	}
}

//Corpo da Classe

@interface TemperaturaIdeal {
	double valor() default 22.0;
}

class Cidade {
	String nome;
	double[][] temperaturas; // Matriz de temperaturas por dia e horário

	public Cidade(String nome, double[][] temperaturas) {
		this.nome = nome;
		this.temperaturas = temperaturas;
	}

	public double calcularMedia() {
		double soma = 0;
		int count = 0;
		for (double[] dia : temperaturas) {
			for (double temp : dia) {
				soma += temp;
				count++;
			}
		}
		return count > 0 ? soma / count : 0;
	}

	public String classificarClima() {
		double media = calcularMedia();
		if (media >= 30) {
			return "Muito quente";
		} else if (media >= 22) {
			return "Agradável";
		} else if (media >= 15) {
			return "Frio";
		} else {
			return "Muito frio";
		}
	}
}

class If_Else_Matrix4 {
	public String ifElseMatrix_Run4() {

		List<Cidade> cidades = new ArrayList<>();
		cidades.add(new Cidade("São Paulo", new double[][] { { 22, 24, 23 }, { 20, 22, 21 } }));
		cidades.add(new Cidade("Curitiba", new double[][] { { 15, 14, 16 }, { 13, 12, 14 } }));
		cidades.add(new Cidade("Rio de Janeiro", new double[][] { { 30, 32, 31 }, { 29, 30, 33 } }));

		for (Cidade cidade : cidades) {
			System.out.println("Cidade: " + cidade.nome);
			System.out.println("Média de temperatura: " + cidade.calcularMedia());
			System.out.println("Clima: " + cidade.classificarClima());
			System.out.println("-----------");
		}

		return "\n\n***** Codigo usando comandos If_Else_IF usando Matrix *****";
	}
}

//Corpo da Classe
@interface Aprovacao {
	double notaMinima() default 7.0;
}

class Aluno {
	String nome;
	double[][] notas; // Matriz de notas por matéria e avaliação

	public Aluno(String nome, double[][] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public double calcularMedia() {
		double soma = 0;
		int count = 0;
		for (double[] materia : notas) {
			for (double nota : materia) {
				soma += nota;
				count++;
			}
		}
		return count > 0 ? soma / count : 0;
	}

	public String getClassificacao() {
		double media = calcularMedia();
		if (media >= 9) {
			return "Excelente";
		} else if (media >= 7) {
			return "Bom";
		} else if (media >= 5) {
			return "Regular";
		} else {
			return "Reprovado";
		}
	}
}

class If_Else_Matrix7 {

	@Aprovacao(notaMinima = 7.0)

	public String ifElseMatrix_Run7() {
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Carlos", new double[][] { { 8, 7, 9 }, { 6, 8, 7 } }));
		alunos.add(new Aluno("Mariana", new double[][] { { 5, 6, 5 }, { 4, 5, 6 } }));
		alunos.add(new Aluno("Ana", new double[][] { { 10, 9, 10 }, { 9, 10, 10 } }));

		for (Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.nome);
			System.out.println("Média: " + aluno.calcularMedia());
			System.out.println("Classificação: " + aluno.getClassificacao());
			System.out.println("-----------");
		}

		return "\n\n***** Codigo usando comandos If_Else_IF usando Matrix *****";
	}
}
