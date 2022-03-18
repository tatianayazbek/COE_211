import java.util.Scanner;
public class Calculator{
	public int i;
	public int y;
	public String l;
	private String plus= "+";
	private String minus= "-";
	private String times= "*";
	private String divides= "/"; 

	public Calculator(int i, String l, int y){
	this.i=i;
	this.l=l;
	this.y=y;
	this.plus=plus;
	this.minus=minus;
	this.times=times;
	this.divides=divides;
	}

	public int getResult(){
		int x=0;
		if (l.equals(plus)){
			x= i+y;
		}else if (l.equals(minus)){
			x= i-y;
		}else if (l.equals(times)){
			x= i*y;
		}else if (l.equals(divides)){
			x= i/y;
		}
		return x;
	}
	
}