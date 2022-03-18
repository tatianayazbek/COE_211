public class Employee{
	String meep, mweep;
	int meesp;
	double mweesp;
	
	public Employee(String meep, String mweep, int meesp, double mweesp){
		this.meep = meep;
		this.mweep = mweep;
		this.meesp = meesp;
		this.mweesp = mweesp;
	}

	public String getInfo(){
		String DAGOAT= meep+" "+mweep+", "+meesp+", "+mweesp;
		return DAGOAT;
	}
}