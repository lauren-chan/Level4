package file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEncryptor {
	
	public static File openSecretFile()
	{
		File f = new File("secret.txt");
		return f;
	}
	
	public static String readOneLine(File f) throws FileNotFoundException
	{
		Scanner scan = new Scanner(f);
		return scan.nextLine();
		
	}	
	public static String readFileContents(File f) throws FileNotFoundException
	{
		String ret = "";
		Scanner scan = new Scanner(f);
		while(scan.hasNextLine())
		{
			ret = ret+scan.nextLine();
		}
		return ret;
	}
	public static String encrypt(String s)
	{
		
	}
	
	

}
