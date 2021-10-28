package controller;

import java.io.IOException;

public class SteamController
{
	IDataController dataCont = new DataController();

	public SteamController()
	{
		super();
	}
	public void dataOnConsole(String path, String name, int year, int month, double avg) throws IOException
	{
		dataCont.readDir(path);
		dataCont.readFile(path, name);

		filterByYear(year);
		filterByMonth(month);
		filterByAvg(avg);

		displayData();

	}

	public void dataOnFile(String path, String name, int year, int month, double avg) throws IOException
	{
		dataCont.readDir(path);
		dataCont.readFile(path, name);

		filterByYear(year);
		filterByMonth(month);

		dataCont.createFile(path, name);
	}

	public void openFile(String path, String name, String extension) throws IOException
	{
		dataCont.openFile(path, name);
	}

	private void filterByYear(int year)
	{

	}


	private void filterByMonth(int month)
	{

	}

	private void filterByAvg(double avg)
	{

	}

	private void displayData()
	{
		
	}
}
