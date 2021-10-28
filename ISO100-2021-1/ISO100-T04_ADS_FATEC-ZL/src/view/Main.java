package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main
{

	public static void main(String[] args)
	{
		//Declaração de variaveis
		Random random = new Random();
		int x;
		int vet [] = new int [1000];

		//Populando vetor com valores aleatorios de 1 a 100
		for (int i = 0; i < vet.length; i++)
		{
			vet[i] = random.nextInt(101);
		}

		//Chamada das Threads enviando 1 e 2
		for (x = 1; x < 3; x++)
		{
			Thread threadVetor = new ThreadVetor(x, vet);
			threadVetor.start();			
		}
	}
}
