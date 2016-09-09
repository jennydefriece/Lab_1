import java.util.Scanner;


public class equations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //declares that input is a variable whose type is scanner
		
		//monthly income
		System.out.print("Enter monthly income: "); //prints statement
		double monthlyIncome=input.nextDouble(); //pulls input from user and assigns it to variable
		
		//monthly SS
		System.out.print("Enter monthly SSI: " );
		double monthlySSI=input.nextDouble();
		
		//calculate income required for withdraw
		double requiredIncome=monthlyIncome-monthlySSI;
		
		//savings rate
		System.out.print("Enter annual savings rate as decimal: ");
		double SavingsRate=input.nextDouble();
		
		//interest rate on savings during retirement period
		System.out.print("Enter annual return of savings during retirement as decimal: ");
		double RetirementRate=input.nextDouble();
		
		//r value
		double annualRate=RetirementRate/12;
		
		//Years remaining of work
		System.out.print("Enter number of years left to work: ");
		double yearsWork=input.nextDouble();
		
		//years expected to be retired for
		System.out.print("Enter years retired: ");
		double yearsRetired=input.nextDouble();
		
		
		//Calculates required savings
		double requiredSaved=requiredIncome*(1-(Math.pow(1+RetirementRate/12,-yearsRetired*12)))/(annualRate); //Math.Pow computes exponent
		
		//calculates montly payments
		double Payment = requiredSaved/((Math.pow(1+SavingsRate/12, 12*yearsWork)-1)/(SavingsRate/12));
		
		//Display results
		System.out.println("The amount you need to save per month is $" + Payment);
		System.out.println("The total amount you need saved is $" + requiredSaved);
		
						
	}
}
