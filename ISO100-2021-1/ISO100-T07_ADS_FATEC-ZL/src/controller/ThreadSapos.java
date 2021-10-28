package controller;

import java.util.Random;

public class ThreadSapos extends Thread
{
	//Declara��o de Variaveis
	private int puloMax, percurso, id;
	static int i = 1;

	//M�todo construtor
	public ThreadSapos(int percurso, int puloMax, int id)
	{
		this.percurso = percurso;
		this.puloMax = puloMax;
		this.id = id;
	}

	//M�todo RUN chamando o procedimento puloSapo
	@Override
	public void run() 
	{
		puloSapo();
	}

	//Procedimento que, calcula randomicamente o pulo do sapo e exibe caso o mesmo tenha passado a linha de chegada.
	private void puloSapo()
	{
		Random random = new Random();
		int pulo;
		int posicao = 0;

		while (posicao < percurso)
		{
			pulo = random.nextInt(puloMax + 1);
			posicao += pulo;
			System.out.println("Sapo " + id + " pulou " + pulo + " metros - faltam: " + (percurso - posicao) + " metros");
		}
		System.out.println("\n=========================================\n"
				+ "    Sapo " + id + " chegou a linha de chegada." + "\n               " + i + "� colocado"
						+ "\n=========================================\n");
		i++;
	}
}
