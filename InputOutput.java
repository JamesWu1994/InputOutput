import java.io.*;
import java.util.Scanner;

// 10/25/16, James Wu, CIS 2830

public class InputOutput
{

	public static void main(String []args)
			throws IOException
	{
		// TODO Auto-generated method stub
		
		PrintWriter outputFile = new PrintWriter("E://InputOutput/StudentData.txt");
	
		outputFile.println("The Beatles");
		outputFile.println("Abbey Road");
		outputFile.println("your name");
		
		outputFile.close();
		
		FileWriter fwriter = new FileWriter("E://InputOutput/StudentData.txt", true);
		PrintWriter outputAppendFile = new PrintWriter(fwriter);
		outputAppendFile.println("Uriah Heep");
		outputAppendFile.println("Def Leopard");
		outputAppendFile.println("Froghat");
		
		outputAppendFile.close();
		
		File myFile = new File("E://InputOutput/StudentData.txt");
		Scanner inputFile = new Scanner(myFile);
		String line = inputFile.nextLine();
		System.out.println("The  first line in the file is:");
		System.out.println(line);
		String line2 = inputFile.nextLine();
		System.out.println("The second line is");
		System.out.println("line2");
	}
}
