package controller;

import java.io.IOException;

public interface IDataController
{
	public void readDir(String path) throws IOException;

	public void createFile(String path, String name) throws IOException;
	public void readFile(String path, String name) throws IOException;
	public void openFile(String path, String name) throws IOException;
}
