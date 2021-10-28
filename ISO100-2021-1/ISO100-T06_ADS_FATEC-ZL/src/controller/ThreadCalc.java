package controller;

public class ThreadCalc extends Thread
{
	//Declaração de variaveis
	private int x;
	private int mat[][] = new int [3][5];

	//Método construtor
	public ThreadCalc(int x, int[][] mat)
	{
		this.x = x;
		this.mat = mat;
	}

	//Método RUN chamando o procedimento somaLinha
	@Override
	public void run()
	{
		somaLinha();
	}

	//Procedimento que recebe a matriz e o valor de x, calcula e exibe a soma. 
	private void somaLinha()
	{
		int res = 0;
		for (int i = 0; i < 5; i++)
		{
			res += mat[x][i];
		}
		System.out.println("Soma da linha " + (x + 1) + ": " + res);
		
	}
}
