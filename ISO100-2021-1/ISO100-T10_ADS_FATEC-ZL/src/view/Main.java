package view;

import java.util.concurrent.Semaphore;

import controller.Operacoes;

public class Main
{

	public static void main(String[] args)
	{
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		
			System.out.println("Tipos de requisi��es:\n"
					+ "tipo a - 4 opera��es com: 0,2 a 1s de calculos e 1s de transa��o com BD;\n"
					+ "tipo b - 6 opera��es com: 0,5 a 1,5s de calculos e 1,5s de transa��o com BD;\n"
					+ "tipo c - 6 opera��es com: 1 a 2s de calculos e 1,5s de transa��o com BD.\n");
		
		for (int idThread = 1; idThread < 22; idThread++)
		{
			Thread t = new Operacoes(idThread, semaforo);
			t.start();
		}
	}

}
