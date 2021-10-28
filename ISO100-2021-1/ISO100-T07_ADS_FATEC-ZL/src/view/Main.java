package view;

import controller.ThreadSapos;

public class Main
{

	public static void main(String[] args)
	{
		for (int id = 0; id < 5; id++)
		{
			Thread ThreadSapos = new ThreadSapos(100, 5, id);
			ThreadSapos.start();
		}
	}

}
