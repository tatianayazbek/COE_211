import java.util.Scanner;
public class Service{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		Scanner scan3= new Scanner(System.in);
		Scanner scan4= new Scanner(System.in);
		Scanner scan5= new Scanner(System.in);
			int your;
			String mom, yes;
			AdvancedDays AD= new AdvancedDays();
			BasicDays BD= new BasicDays();
			do{
			do{
			System.out.println("Which service would you like to use?"+"\n"+
						     "[1]: Basic week visualizer"+"\n"+
						     "[2]: Advanced week visualizer"+"\n"+
						     "[3]: Basic calculator"+"\n"+
						     "[4]: Employee repertoire");
			your= scan.nextInt();
			
			switch(your){
			case 1: 
				System.out.println("The basic days of the week are: " + BD.getBasicDays());
				break;
			case 2: 
				System.out.println("The advanced days of the week are: "+AD.getAdvancedDays());
				break;
			case 3:
				System.out.println("Input the first number: ");
				int i=scan.nextInt();
				System.out.println("Input the operator: ");
				String l=scan3.nextLine();
				System.out.println("Input the second number: ");
				int y=scan.nextInt();
				Calculator calc= new Calculator(i, l, y);
				System.out.println(i + l + y+ " = "+calc.getResult());
				break;
			case 4: 
				System.out.println("Please input the employee’s first name:");
				String meep= scan4.nextLine();
				System.out.println("Please input the employee’s last name:");
				String mweep= scan5.nextLine();
				System.out.println("Please input the employee’s age:");
				int meesp= scan.nextInt();
				System.out.println("Please input the employee’s salary:");
				double mweesp= scan.nextDouble();

				Employee myanee= new Employee(meep, mweep, meesp, mweesp);
				
				System.out.println("Employee information: "+ myanee.getInfo());
				break;
			default: 
				System.out.println("Please make sure you pick a number between 1 and 4");
			}

			
			System.out.println("Would you like to perform another operation? (y/n)");
			mom= scan2.nextLine();
			yes= "y";

			}while (mom.equalsIgnoreCase(yes));
				break;
			}while(true);

	}
}