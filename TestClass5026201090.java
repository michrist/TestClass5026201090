import java.util.Scanner;
public class TestClass5026201090 {
	public static void main (String[] args){
	ComputeMethods5026201090 coba = new ComputeMethods5026201090(); 	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input fahrenheit: ");
	double degreeF = sc.nextDouble();
	System.out.print("Input length of a: "); 
	int a = sc.nextInt();
	System.out.print("Input length of b: ");
	int b = sc.nextInt();
	
	double degreeC = coba.fToC(degreeF);
	System.out.println("Temp in celsius is " + degreeC);
	
	double c = coba.hypotenuse(a, b);
	System.out.println("Hypotenuse is " + c);

	int diceValues = coba.roll();
	System.out.println("The sum of the dice values is " + diceValues);
	}
}
