package projeto_final_bloco_um;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import projeto_final_bloco_um.model.Conta;
import projeto_final_bloco_um.model.ContasPremium;
import projeto_final_bloco_um.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int op;

		while (true) {
			
			
			// Teste da COnta Premiu
			
			ContasPremium cc1 = new ContasPremium("Luke", 123, 45, 678, 700);
			cc1.descontar35();
			cc1.descontar5();
			cc1.descontar8();
			

			System.out.println(Cores.YELLOW + Cores.Ansiblueb
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LOJA VULPIN TETRAX                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta/Fazer Login              ");
			System.out.println("            2 - Comprar Produto                      ");
			System.out.println("            3 - Colocar no carrinho                  ");
			System.out.println("            4 - Escolher outro Produto               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.RESET);
			
			
			try {
				op = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nSó aceitamos valores inteiros!");
				leia.nextLine();
				op = 0;
			}


			if (op == 9) {
				System.out.println(Cores.Purplebb + "\nLoja Vulpin Tetrax, onde suas compras serão ótimas!");
				leia.close();
				System.exit(0);
			}

			switch (op) {
				case 1:
					System.out.println(Cores.Bluebb + "Criar Conta/ Fazer Login\n\n");
					keyPress();
                    break;
				case 2:
					System.out.println(Cores.Bluebb+ "Iniciando a compra\n\n");
					keyPress();
					break;
					
					
				case 3:
					System.out.println(Cores.Bluebb + "Inserindo o produto no carrinho\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Cores.Bluebb + "Escolha outro produto\n\n");
					keyPress();
					break;
				default:
					System.out.println(Cores.Bluebb + "\nVocê selecionou uma opção não válida!!\n" + Cores.RESET);
					keyPress();
					break;
			}
		}

	}
	
	public static void keyPress() {
		
		try {
			System.out.println(Cores.RESET + "\n\nPressione a tecla ENTER para prosseguir");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você apertou outra tecla!");
		}
	}


}
