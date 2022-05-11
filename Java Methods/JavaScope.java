//Java Scope

public class JavaScope {
	public static void main (String[] args) {
		
		//Variables generales funcionan en toda la clase
		int num1, num2;
		
		num1=40;
		num2=60;
		
		{
			//Variables locales funcionan solo dentro de las llaves {}
			int num01, num02;
			num01=10;
			num02=20;
			
			System.out.println("la suma es: "+(num01+num02));
		}
		
		System.out.print("la suma es: "+(num1+num2));

	}
}
