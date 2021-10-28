package controller;

public class ThreadId extends Thread
{
	//Declaração de variaveis
	private long id;
	
	//Método construtor
	public ThreadId()
	{
		this.id = id;
	}
	
	//Método RUN chamando o método getThreadId
	@Override
	public void run()
	{
		getThreadId();
	}

	//Método que coleta o ID e demonstra no Console
	private void getThreadId()
	{
		id = getId();
		System.out.println("TID #" + id);
	}
}
