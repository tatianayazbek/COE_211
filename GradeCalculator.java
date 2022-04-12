import java.util.Scanner;
public class GradeCalculator{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int[] assignment= new int[5];
		int sumAss=0;
		for(int n=0; n<assignment.length; n++){
			System.out.println("Input the grade of assignment "+ (n+1));
			assignment[n]= scan.nextInt();
			sumAss= sumAss+ assignment[n];
		}
		
		System.out.println("Input the number of attended labs (/7)");
		int attendance= scan.nextInt();

		System.out.println("Input the midterm grade (/100)");
		int midterm= scan.nextInt();


		System.out.println("Assignments (30%): "+ ((double)(sumAss)/assignment.length)*0.3
					+"\nAttendance (5%): "+ attendance*5/7
					+"\nMidterm (30%): "+ midterm*0.3);
	}
}