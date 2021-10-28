package controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DataController implements IDataController
{
	public DataController()
	{
		super();
	}

	@Override
	public void readDir(String path) throws IOException
	{
		File dir = new File(path);

		if (!dir.exists() || !dir.isDirectory())
		{
			invDir();
		}
	}


	@Override
	public void readFile(String path, String name) throws IOException
	{
		File file = new File(path, name);

		if (file.exists() && file.isFile())
		{
			FileInputStream stream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);

			String line = buffer.readLine();

			int aux = 0;
			while (line != null)
			{
				if (aux != 0)
				{
					String object[] = line.split(",");					
				}
				else
				{
					aux = 1;
				}
				line = buffer.readLine();
			}

			buffer.close();
			reader.close();
			stream.close();
		}
		else
		{
			invFile();
		}
	}


	@Override
	public void openFile(String path, String name) throws IOException
	{
		File file = new File(path, name);

		if (file.exists() && file.isFile())
		{
			Desktop desktop = Desktop.getDesktop();
			desktop.open(file);
		}
		else
		{
			invFile();
		}
	}

	@Override
	public void createFile(String path, String name) throws IOException
	{
		File dir = new File(path);
		File file = new File(path, name);

		if (dir.exists() && dir.isDirectory())
		{
			boolean exists = false;

			if (file.exists()) exists = true;

			String content = "";
			FileWriter fileWriter = new FileWriter(file, exists);

			PrintWriter print = new PrintWriter(fileWriter);
			print.write(content);
			print.flush();
			print.close();
			fileWriter.close();
		}
		else
		{
			invDir();
		}
	}

	private String invDir() throws IOException
	{
		throw new IOException ("Invalid Directory.");
	}
	private String invFile() throws IOException
	{
		throw new IOException ("Invalid File.");
	}
}
