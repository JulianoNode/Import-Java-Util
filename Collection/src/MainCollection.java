
import java.util.Scanner;

import collevetor.For_Matrix;
import collevetor.If_Else_IF;
import collevetor.Simples;
import collevetor.Vetor_;
import collevetor.While_Matrix;
import util.LimparConsole;
import util.Pausar;

public class MainCollection {
	public static void main(String[] args) {
		
		Pausar pausar = new Pausar();
		LimparConsole clear = new LimparConsole();
		Scanner scanner = new Scanner(System.in);

		// Vetor de opções do menu
		String[] menuOptions = { "Collection = Simple", 
								 "Collection = If e else if",								 
								 "Collection = For com Matrix",
								 "Collection = do while com Matrix",
								 "Collection = Vetor",
								 "Sair" };

		int choice;
		do {
			// Exibindo o menu
			System.out.println("\n\t=== Import java.itul.Collection ===\n");
			for (int i = 0; i < menuOptions.length; i++) {
				System.out.println((i + 1) + ". " + menuOptions[i]);
			}

			System.out.print("Escolha uma opção: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consumir o '\n'

			switch (choice) {
			case 1:
				Simples simples = new Simples();
				System.out.println(simples.Simples_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 2:
				If_Else_IF else_IF = new If_Else_IF();
				System.out.println(else_IF.If_Else_IF_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 3:
				For_Matrix for_Matrix = new For_Matrix();
				System.out.println(for_Matrix.matrix_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 4:
				While_Matrix matrix = new While_Matrix();
				System.out.println(matrix.VetorMatrix_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 5:				
				Vetor_ vetor_ = new Vetor_();
				System.out.println(vetor_.VetorMatrix_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;
			
			case 6: // Sair
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (choice != 6);
		scanner.close();
	}
}
