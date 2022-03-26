import java.util.*;
public class TicTacToe{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String a1="_";
		String a2="_";
		String a3="_";
		String b1="_";
		String b2="_";
		String b3="_";
		String c1="_";
		String c2="_";
		String c3="_";

		System.out.println("enter a column and a row:\n"+ "   1 2 3\n"+
								"a  "+a1+ " "+a2+" "+a3+"\n"+
								"b  "+b1+ " "+b2+" "+b3+"\n"+
								"c  "+c1+ " "+c2+" "+c3);
		for(int n=1; n<=9; ++n){
		String lol= scan.nextLine();
		System.out.println("which are you? (x/o)");
		String minenta= scan.nextLine();
		
		if (lol.equalsIgnoreCase("a1")){
			a1= a1.replace("_", minenta);
	
		}else if (lol.equalsIgnoreCase("a2")){
			a2= a2.replace("_", minenta);
		
		}else if (lol.equalsIgnoreCase("a3")){
			a3=a3.replace("_", minenta);
		
		}else if (lol.equalsIgnoreCase("b1")){
			b1= b1.replace("_", minenta);
			
		}else if (lol.equalsIgnoreCase("b2")){
			b2=b2.replace("_", minenta);
	
		}else if (lol.equalsIgnoreCase("b3")){
			b3=b3.replace("_", minenta);
			
		}else if (lol.equalsIgnoreCase("c1")){
			c1=c1.replace("_", minenta);
		
		}else if (lol.equalsIgnoreCase("c2")){
			c2=c2.replace("_", minenta);
		
		}else if (lol.equalsIgnoreCase("c3")){
			c3=c3.replace("_", minenta);
		
		}
		
		
		if( (a2.equals(minenta) && a3.equals(minenta) && a1.equals(minenta))||
		(b2.equals(minenta) && b3.equals(minenta) && b1.equals(minenta))||
		(c2.equals(minenta) && c3.equals(minenta) && c1.equals(minenta))||
		(a3.equals(minenta) && b2.equals(minenta) && c1.equals(minenta))||
		(b2.equals(minenta) && c3.equals(minenta) && a1.equals(minenta))||
		(a2.equals(minenta) && c2.equals(minenta) && b2.equals(minenta))||
		(a1.equals(minenta) && c1.equals(minenta) && b1.equals(minenta))||
		(a3.equals(minenta) && c3.equals(minenta) && b3.equals(minenta)) ){ 
			System.out.println(minenta+ " won this round!");
			System.out.println( "   1 2 3\n"+
				"a  "+a1+ " "+a2+" "+a3+"\n"+
				"b  "+b1+" "+b2+" "+b3+"\n"+
				"c  "+c1+ " "+c2+" "+c3);
		
			break;
		}else if(n==9){
			System.out.println("No one won this round :(");
		}else{
			
			System.out.println( "   1 2 3\n"+
				"a  "+a1+ " "+a2+" "+a3+"\n"+
				"b  "+b1+" "+b2+" "+b3+"\n"+
				"c  "+c1+ " "+c2+" "+c3);

			continue;
		}



		}
		
		
	}
}