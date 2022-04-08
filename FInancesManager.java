import java.io.*;
import java.util.Scanner;

public class FinancesManager{
	public static void main(String[] args) throws IOException{
		
		Scanner scan= new Scanner(System.in);
		FileWriter fw= new FileWriter(new File("Expenses.txt"));
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter outToFile= new PrintWriter(bw);
		String answer; 
		String yes="y"; 
		String no="n";

	do{	
		System.out.println("Input your name: ");
		String name= scan.nextLine();
		System.out.println("What did you purchase?");
		String purchase= scan.nextLine();
		System.out.println("How much did you pay? (in USD)");
		Double price= scan.nextDouble();
		scan.nextLine();
		outToFile.println(name+" purchased "+purchase+" for "+price+ " US Dollars.");
		System.out.println("Would you like to log another purchase? (y/n)");
		answer= scan.nextLine();
		
	}while(answer.equals(yes));

	if (answer.equals(no)) System.out.println("Get off of ZoodMall!");

	outToFile.close();
	
	}

}