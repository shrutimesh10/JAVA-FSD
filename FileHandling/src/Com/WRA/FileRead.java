package Com.WRA;

import java.io.FileReader;
import java.io.IOException;

public class FileRead
{

	    public static void main(String[] args) {
		

		Object read;
		char[] data =new char[100];
		try
		{
		
		    FileReader output= new FileReader("File.txt");
		    output.read(data);
		    System.out.println("data received from file successfully:");
		    System.out.println(data);
		    output.close();
						
	    }
		catch(IOException ex)
			{
				System.out.println("File read error..:");
			}
			
		// TODO Auto-generated method stub

	}
}


