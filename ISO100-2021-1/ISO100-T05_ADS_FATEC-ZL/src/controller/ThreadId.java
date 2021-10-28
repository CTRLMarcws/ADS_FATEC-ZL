package controller;

public class ThreadId extends Thread
{
	//Declara��o de variaveis
	private long id;
	
	//M�todo construtor
	public ThreadId()
	{
		this.id = id;
	}
	
	//M�todo RUN chamando o m�todo getThreadId
	@Override
	public void run()
	{
		getThreadId();
	}

	//M�todo que coleta o ID e demonstra no Console
	private void getThreadId()
	{
		id = getId();
		System.out.println("TID #" + id);
	}
}
