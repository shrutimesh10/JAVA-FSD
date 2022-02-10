package Com.WRA;

import java.io.FileWriter;
import java.io.IOException;


public class FileWrite {

	public static void main(String[] args) {
		{
			String data= "hello! Write file created successfully ";
			try 
			{
				FileWriter output= new FileWriter("File.txt");
				output.write(data);
				System.out.println("data written successfully:");
				System.out.println(data);
			    output.close();
				
			}
			catch(IOException ex)
			{
				System.out.println("File write error..:");
			}
		}
		// TODO Auto-generated method stub

	}

}
