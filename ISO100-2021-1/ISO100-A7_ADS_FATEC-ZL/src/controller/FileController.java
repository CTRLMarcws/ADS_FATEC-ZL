package controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileController implements IFileController
{
	// CTRL + 3
	// dir /w/p - listagem "diferente" no cmd
	public FileController()
	{
		super();
	}

	@Override
	public void readDir(String path) throws IOException
	{
		File dir = new File(path);

		if (dir.exists() && dir.isDirectory())
		{
			File[] files = dir.listFiles();
			for (File f : files)
			{
				if(f.isFile())
				{
					System.out.println("     \t" + f.getName());
				}
				else
				{
					System.out.println("<DIR>\t" + f.getName());
				}
			}
		}
		else
		{
			invDir();
		}
	}

	@Override
	public void createFile(String path, String name, String extension) throws IOException
	{
		File dir = new File(path);
		File file = new File(path, name + extension);

		if (dir.exists() && dir.isDirectory())
		{
			boolean exists = false;
			// se o arquivo existir, ele fará um append
			// se o arquivo não existir, fará um write

			if (file.exists()) exists = true;

			String content = textGenerator();
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


	@Override
	public void readFile(String path, String name, String extension) throws IOException
	{
		File file = new File(path, name + extension);

		if(file.exists() && file.isFile())
		{
			FileInputStream stream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);

			String line = buffer.readLine();
			while (line != null)
			{
				System.out.println(line);
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
	public void openFile(String path, String name, String extension) throws IOException
	{
		File file = new File(path, name + extension);
		
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


	private String textGenerator()
	{
		StringBuffer buffer = new StringBuffer();
		String line = "";

		while (!line.equalsIgnoreCase("end"))
		{
			line = JOptionPane.showInputDialog(null, "Type a phrase"
					+ "\nor type 'end' to terminate the entry\n\n",
					"Text entry", JOptionPane.INFORMATION_MESSAGE);

			if (!line.equalsIgnoreCase("end")) buffer.append(line + "\r\n");
		}

		return buffer.toString();
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
