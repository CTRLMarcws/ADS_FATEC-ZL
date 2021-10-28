package view;

import java.io.IOException;
import controller.SteamController;

public class Main
{

	public static void main(String[] args)
	{
		SteamController steamCont = new SteamController();
		
		String dirPath = "C:\\TEMP\\SO1";
		String fileName = "SteamCharts.csv";
		int year = 2020;
		int month = 1;
		double avg = 741013;

		try {
			steamCont.dataOnConsole(dirPath, fileName, year, month, avg);
			steamCont.dataOnFile(dirPath, fileName, year, month, avg);

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
