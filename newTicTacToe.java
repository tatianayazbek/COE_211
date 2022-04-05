import java.util.Scanner;
import java.util.Arrays;
public class newTicTacToe{
	public static void main(String []args){
	String[] a= {"_" , "_" , "_"};
	String[] b= {"_" , "_" , "_"};
	String[] c= {"_" , "_" , "_"};
	int i;
	Scanner scan=new Scanner(System.in);
		
	for ( i=0; i<a.length+b.length+c.length ; i++){
		
		System.out.println("enter a row and a column: \n  1  2  3\n"
				+"a"+ Arrays.toString(a)+"\n"
				+"b"+Arrays.toString(b)+"\n"
				+"c"+Arrays.toString(c));

		String shoubaddak= scan.nextLine();

		System.out.println("Which are you? (x/o)");
		String minenta=scan.nextLine();

		int n= Integer.parseInt(shoubaddak.substring(1));

		if (shoubaddak.substring(0,1).equals("a")){
			a[n-1]=minenta;
		}else if(shoubaddak.substring(0,1).equals("b")){
			b[n-1]=minenta;
		}else if(shoubaddak.substring(0,1).equals("c")){
			c[n-1]=minenta;
		}
		String d[]={minenta, minenta, minenta};

		if( Arrays.equals(a, d) || 
		    Arrays.equals(b, d) ||
		    Arrays.equals(c, d) || 
		    a[0].equals(b[1]) && a[0].equals(c[2]) && c[2].equals(minenta)||
		    a[2].equals(b[1]) && a[2].equals(c[0]) && c[0].equals(minenta) ||
		    a[0].equals(b[0]) && a[0].equals(c[0]) && c[0].equals(minenta) ||
		    a[1].equals(b[1]) && a[1].equals(c[1]) && c[1].equals(minenta)||
		    a[2].equals(b[2]) && a[2].equals(c[2]) && c[2].equals(minenta)){ 
			System.out.println( "1  2  3\n"
				+"a"+Arrays.toString(a)+"\n"
				+"b"+Arrays.toString(b)+"\n"
				+"c"+Arrays.toString(c)+"\n"
				+minenta +" won this round!");
			
			break;	
		}else{
			continue;

		}
					
		}
		if(i==a.length+b.length+c.length) System.out.println("No one won this round");	
		
	}
}
