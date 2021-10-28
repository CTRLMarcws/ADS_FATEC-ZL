package view;

import java.io.IOException;
import java.util.Scanner;

import controller.FileController;
import controller.IFileController;

public class Main
{

	public static void main(String[] args)
	{
		IFileController fileCont = new FileController();

		String dirPath = "C:\\TEMP\\SO1";
		String fileName = "generic_food";
		String fileExtension = ".csv";

		try
		{
			fileCont.readDir(dirPath);
			fileCont.readFile(dirPath, fileName, fileExtension);
			
			System.out.println("Do you wanna open the file?\nPress 1 to open, press any key to close.");
			
			Scanner sc = new Scanner(System.in);
			
			int opt = sc.nextInt();
			
			if (opt == 1)
			{
				fileCont.openFile(dirPath, fileName, fileExtension);
				System.out.print("opening the file and ");
			}
			
			System.out.println("shutting down...");
			sc.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
