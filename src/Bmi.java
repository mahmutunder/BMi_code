import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight;
		double height;
		double result;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter your weight as pounds");
		weight=input.nextDouble();
		
		System.out.println("Enter your height as inches");
		height=input.nextDouble();
		
		result=(weight*703)/(height*height);
		
		if(result<18.5) {
			System.out.println("Your are underweight " + result);
		}
		else if(result>25) {
			System.out.println("Your are Overweight " +result);
			
		}else {
			System.out.println("Invalid calculated " +result);
		}
		
		
		
		

	}

}
