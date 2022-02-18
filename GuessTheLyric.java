import java.util.Scanner;
import java.util.Random;

public class GuessTheLyric{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		Random rand= new Random();
		int beep= Math.abs(rand.nextInt())%10+1;
		System.out.println(beep);
		if (beep==1){
		System.out.println("continue the lyric: "+"\n"+"Give me a sign...");
		String lol=scan.nextLine();
		String loll="Hit me baby one more time";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: Hit me baby one more time");
			}
		}
		else if (beep==2){
		System.out.println("continue the lyric: "+"\n"+"When I was a young boy...");
		String lol=scan.nextLine();
		String loll="My father took me into the city";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: My father took me into the city");
			}
		}
		else if (beep==3){
		System.out.println("continue the lyric: "+"\n"+"Just a small-town girl...");
		String lol=scan.nextLine();
		String loll="Living in a lonely world";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: Living in a lonely world");
			}
		}
		else if (beep==4){
		System.out.println("continue the lyric: "+"\n"+"I love Rock n' Roll...");
		String lol=scan.nextLine();
		String loll="So put another dime in the jukebox, baby";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: So put another dime in the jukebox, baby");
			}
		}
		else if (beep==5){
		System.out.println("continue the lyric: "+"\n"+"You were meant to be mine...");
		String lol=scan.nextLine();
		String loll="I am all that you need";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: I am all that you need");
			}
		}
		else if (beep==6){
		System.out.println("continue the lyric: "+"\n"+"I dreamed a dream in times gone by...");
		String lol=scan.nextLine();
		String loll="When hope was high and life worth living";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: When hope was high and life worth living");
			}
		}
		else if (beep==7){
		System.out.println("continue the lyric: "+"\n"+"We're smashing mics in Karaoke bars...");
		String lol=scan.nextLine();
		String loll="You're running late with half your makeup on";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: You're running late with half your makeup on");
			}
		}
		else if(beep==8){
		System.out.println("continue the lyric: "+"\n"+"wise men say...");
		String lol=scan.nextLine();
		String loll="Only fools rush in";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: Only fools rush in");
			}
		}
		else if (beep==9){
		System.out.println("continue the lyric: "+"\n"+"take me to church...");
		String lol=scan.nextLine();
		String loll="I worship like a dog at the shrine of your life";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: I worship like a dog at the shrine of your life");
			}
		}
		else if (beep==10){
		System.out.println("continue the lyric: "+"\n"+"birds flying high,...");
		String lol=scan.nextLine();
		String loll="You know how I feel";
			if (loll.equalsIgnoreCase(lol)){
			System.out.println("You won!");
			}else{ System.out.println("You lost D: The answer was: You know how I feel");
			}
		}
	}
}