package projeto_final_bloco_um;


import java.util.Scanner;

import projeto_final_bloco_um.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.YELLOW + Cores.Ansiblueb
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LOJA VULPIN TETRAX                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Fazer Login                          ");
			System.out.println("            3 - Comprar Produto                      ");
			System.out.println("            4 - Colocar no carrinho                  ");
			System.out.println("            5 - Escolher outro Produto               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.Purplebb + "\nLoja Vulpin Tetrax, onde suas compras serão ótimas!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.Bluebb + "Criar Conta\n\n");
				
                    break;
				case 2:
					System.out.println(Cores.Bluebb + "Login \n\n");

					break;
				case 3:
					System.out.println(Cores.Bluebb+ "Iniciando a compra\n\n");
					break;
					
					
				case 4:
					System.out.println(Cores.Bluebb + "Inserindo o produto no carrinho\n\n");

					break;
				case 5:
					System.out.println(Cores.Bluebb + "Escolha outro produto\n\n");

					break;
				default:
					System.out.println(Cores.Bluebb + "\nVocê selecionou uma opção não válida!!\n" + Cores.RESET);
					break;
			}
		}

	}


}
