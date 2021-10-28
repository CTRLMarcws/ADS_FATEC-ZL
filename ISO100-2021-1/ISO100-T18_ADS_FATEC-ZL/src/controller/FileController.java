package controller;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileController implements IFileController
{
	public FileController()
	{
		super();
	}

	@Override
	public void readDir(String path) throws IOException
	{
		File dir = new File(path);

		if (!dir.exists() || !dir.isDirectory())
		{
			throw new IOException ("Invalid Directory.");
		}
	}
	

	@Override
	public void readFile(String path, String name, String extension) throws IOException
	{
		File file = new File(path, name + extension);
		
		if (file.exists() && file.isFile())
		{
			FileInputStream stream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);

			String line = buffer.readLine();
			
			int i = 0;
			System.out.println("INDEX\tFOOD NAME\t\t\tSCIENTIFIC NAME\t\t\t\t\tSUBGROUP");
			while (line != null)
			{
				String object[] = line.split(",");

				if (object[2].equalsIgnoreCase("Fruits"))
				{
					System.out.print(i + "\t");
					if(object[0].length() < 8)
					{
						System.out.print(object[0] + "\t\t\t\t");
					}
					else if (object[0].length() >= 8 && object[0].length() < 16)
					{
						System.out.print(object[0] + "\t\t\t");
					}
					else if (object[0].length() >= 16 && object[0].length() < 24)
					{
						System.out.print( object[0] + "\t\t");						
					}
					else 
					{
						System.out.print(object[0] + "\t");
					}

					if(object[1].length() < 8)
					{
						System.out.println(object[1] + "\t\t\t\t\t\t" + object[3]);
					}
					else if (object[1].length() >= 8 && object[1].length() < 16)
					{
						System.out.println(object[1] + "\t\t\t\t\t" + object[3]);
					}
					else if (object[1].length() >= 16 && object[1].length() < 24)
					{
						System.out.println(object[1] + "\t\t\t\t" + object[3]);
					}
					else if (object[1].length() >= 24 && object[1].length() < 32)
					{
						System.out.println(object[1] + "\t\t\t" + object[3]);
					}
					else
					{
						System.out.println(object[1] + "\t" + object[3]);						
					}
				}
				line = buffer.readLine();
				i++;
			}
			buffer.close();
			reader.close();
			stream.close();
		}
		else
		{
			throw new IOException ("Invalid File.");
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
			throw new IOException ("Invalid File.");
		}
	}

}
