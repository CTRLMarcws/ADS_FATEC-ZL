package controller;

/* Observa��es:
 * 
 * "extends Thread" - para que a classe herde as caracteristicas de Thread
 * 
 * Todos os parametros s�o passados por um construtor
 * 
 * M�todo run()
 * S� se executa o que esta no run()
 * "@Overright" para definir o run()
 * Right click > Source > "Override/Implement Methods..." ou "run" + CTRL + SPACE
 * 
 * Java gera um ID para cada thread -> Override/Implement Methods... > getId()
 */

public class ThreadId extends Thread
{
	private int idThread;

	public ThreadId(int idThread)
	{
		this.idThread = idThread;
	}
	
	@Override
	public void run()
	{
		System.out.println(idThread);
	}
}
