package view;

import java.io.IOException;

import controller.FileController;
import controller.IFileController;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		IFileController fileCont = new FileController();

		String dirWin = "C:\\Windows";
		String dirTempSO = "C:\\TEMP\\SO1";
		String name = "test";
		String extension = ".txt";

		try
		{
//			fileCont.readDir(dirWin);
//			fileCont.createFile(dirTempSO, name, extension);
//			fileCont.readFile(dirTempSO, name, extension);
			fileCont.openFile(dirTempSO, name, extension);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
