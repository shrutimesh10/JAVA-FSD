package Filehandling;

    import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Scanner;
	
	public class FileHandling {



	//Create and write to file 
		static void CreateWriteFile() throws IOException{
			//create file
			File file=new File("D:\\fileHandling\\FileHandling.txt");
//			if(file.createNewFile())
//				System.out.println("File is created named : FileHandling.txt");
//			else
//				System.out.println("File Already Exists");		
			//write to file
			FileWriter writer= new FileWriter(file);
			writer.write("Hello ! Third Project Creating File");
			writer.close();
			if(file.canWrite())
				System.out.println("This content is write to file : Hello ! Third Project Creating File");
		}
		//read file
		public static List<String> readFile(String fileName)
		{
			List<String> list= Collections.emptyList();
			try {
				list= Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			} catch (Exception e) {
				e.printStackTrace();
			}		
			return list;
		}
		//append to file
		public static void AppendFile(String fileName, String str) throws IOException {
			 try {
	  		   BufferedWriter out = new BufferedWriter(new FileWriter("D:\\fileHandling\\FileHandling.txt", true));
	  		   out.write(str);
	  		   out.close();
	  	   }
	  	   catch (IOException e) {
	  		   System.out.println("exception occurred" + e);
	  	   		}
		}
	//main method
		public static void main(String[] args) throws IOException {
			System.out.println("Enter your choice: 1.Write to File\t2.Read file\t3.Append to File");
			Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
			if(n==1)
			{
				//Create-Write File	
				try {
					CreateWriteFile();
				} catch (IOException e) {
					System.out.println(e);
				}	
			}
			else if(n==2)
			{
				//Read file		
						List<String> result= readFile("D:\\fileHandling\\FileHandling.txt");
						Iterator<String> it= result.iterator();
						System.out.println();
						while(it.hasNext())
						{
							System.out.println(it.next());
						}
			}
			else if(n==3)
			{
				//Append file	
							String data="\nWelcome to MPhasis Full Stack Development\n";
							AppendFile("D:\\fileHandling\\FileHandling.txt", data);
							Scanner scan= new Scanner(System.in);
							System.out.println("Enter string to append : ");
							String data1= scan.next();
							AppendFile("D:\\fileHandling\\FileHandling.txt", data1);
							scan.close();
			
						//printing file content again
							System.out.println();
							System.out.println("Content after append string : ");
							try {
							System.out.println();
							FileReader fr=new FileReader("D:\\fileHandling\\FileHandling.txt");    
					        BufferedReader br=new BufferedReader(fr);    
							int i;    
					        while((i=br.read())!=-1){  
					         System.out.print((char)i);  
					         }  
							System.out.println();
							} catch (IOException e) {
								System.out.println(e);
							}
			
		
			}
			sc.close();			
		// TODO Auto-generated method stub

	}

}
