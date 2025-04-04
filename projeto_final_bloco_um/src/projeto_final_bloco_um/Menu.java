package projeto_final_bloco_um;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import projeto_final_bloco_um.model.Conta;
import projeto_final_bloco_um.model.ContasPremium;
import projeto_final_bloco_um.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int op;
		int CPF;
		int senha;
		int p = 1;
		int descontotipo = 0;
		String nome;
		
		
		

		while (true) {
			
			
			
			

			System.out.println(Cores.YELLOW + Cores.Ansiblueb
					+ "*******************************************************************");
			System.out.println("                                                                   ");
			System.out.println("                LOJA VULPIN TETRAX                                 ");
			System.out.println("                                                                   ");
			System.out.println("*******************************************************************");
			System.out.println("                                                                   ");
			System.out.println("            1 - Criar Conta/Fazer Login                            ");
			System.out.println("            2 - Comprar Produto                                    ");
			System.out.println("            3 - Colocar no carrinho                                ");
			System.out.println("            4 - Escolher outro Produto                             ");
			System.out.println("            5 - Loja Vulpin Tetrax, onde suas compras serão ótimas!");
			System.out.println("*******************************************************************");
			System.out.println("Entre com a opção desejada:                                        ");
			System.out.println("                                                                   " + Cores.RESET);
			
			
			try {
				op = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nSó aceitamos valores inteiros!");
				leia.nextLine();
				op = 0;
			}


			if (op == 5) {
				System.out.println(Cores.Purplebb + "\nLoja Vulpin Tetrax, onde suas compras serão ótimas!");
				leia.close();
				System.exit(0);
			}

			switch (op) {
				case 1:
					System.out.println(Cores.Bluebb + "Criar Conta/ Fazer Login\n\n");
					System.out.println("Insira o seu nome: ");
					nome = leia.next();
					System.out.println("Insira o seu CPF: ");
					CPF = leia.nextInt();
					System.out.println("Insira a sua senha: ");
					senha = leia.nextInt();
					System.out.println("Conta Premium? (1 - S/0 - N) ");
					while(p != 1 && p != 0) {
						System.out.println("Insira sua resposta: ");
						p = leia.nextInt();
					}					
					keyPress();
                    break;
				case 2:
					System.out.println(Cores.Bluebb+ "Iniciando a compra\n\n");
					
					if (p == 1) {
						System.out.println("Qual desconto? (50% - 1 35% - 2) ");
						while(descontotipo != 1 && descontotipo != 2) {
							System.out.println("Insira a sua escolha: ");
							descontotipo = leia.nextInt();
						}
						if(descontotipo == 1) {
							System.out.println("Desconto de 50%");
						} else if(descontotipo == 2) {
							System.out.println("Desconto de 35%");
						}
					}
					
					
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
