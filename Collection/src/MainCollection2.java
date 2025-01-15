
import java.util.Scanner;

import collevetor.Vetor_;
import util.LimparConsole;
import util.Pausar;

public class MainCollection2 {
	public void racunnho() {
		
		Pausar pausar = new Pausar();
		LimparConsole clear = new LimparConsole();
		Scanner scanner = new Scanner(System.in);

		// Vetor de opções do menu
		String[] menuOptions = { "Collection = Simple", "Collection = If", "Collection = If e else",
				"Collection = If e else if", "Collection = For", "Collection = For, if e else", "Collection = Wheli",
				"Collection = Wheli, for, if e else ", "Collection = Do wheli", "Collection = Do wheli, for, if e else",
				"Collection = Switch case", "Collection = Switch case, do wheli, for, if e else",
				"Collection = Switch case, do wheli, for, if e else if", "Collection = Vetor",
				"Collection = Vetor, switch case, do wheli, for, if e else",
				"Collection = Vetor, switch case, do wheli, for, if e else if ",
				"Collection = Vetor, switch case, do wheli, for, if e else if, String ",
				"Collection = Vetor, switch case, do wheli, for, if e else if, Flot ",
				"Collection = Vetor, switch case, do wheli, for, if e else if, diferentes Operadores",
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
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 2:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 3:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 4:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 5:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 6:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 7:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 8:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 9:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 10:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 11:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 12:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 13:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 14:
				Vetor_ vetor_ = new Vetor_();
				System.out.println(vetor_.VetorMatrix_Run());
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				
				break;

			case 15:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 16:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 17:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;

			case 18:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;
				
			case 19:
				
				pausar.run_Pause();
				clear.CleanConsole_Run();
				break;
			
			case 20: // Sair
				System.out.println("Encerrando o programa...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (choice != 20);
		scanner.close();
	}
}
