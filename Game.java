import java.util.Scanner;
import java.util.Random;
public class Game{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Input a random integer less than 10:");
		int num1= scan.nextInt();
		Random rand= new Random();
		int num2= Math.abs(rand.nextInt())%10+1;
		if (num1==num2){ 
		System.out.println("You won!!");
		} else {
		System.out.println("You lost D:, the number was " + num2);
		}
	}
}