package view;

import java.util.Scanner;
import controller.RedesController;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner (System.in);

		RedesController redController = new RedesController();

		int opc = 0;

		String oS = redController.verificaOs();
		
		System.out.println("Ol�! Bem-vindo.\n\nSeu sistema operacional atual �: " + oS);

		while (opc != 9) {
// inserir os no menu
			System.out.println("Pressione:\n  1 para listar os adaptadores (nome e IPV4)"
					+ "\n  2 para obter a m�dia de PING com Google\n  9 para finalizar");
			opc = scanner.nextInt();

			switch (opc)
			{
			case 1:
				System.out.println(redController.ip(oS));
				limpar();
				break;

			case 2:
				redController.ping(oS);
				limpar();
				break;

			case 9:
				System.out.println("Finalizando, at� a pr�xima (=");
				break;

			default:
				System.out.println("Op��o Invalida");
				break;
			}
		}
		scanner.close();
	}
	private static void limpar() {
		System.out.println("====================================================\n");		
	}
}