import java.util.*;
public class Recursion{
	public static void main(String[] args){
		//Este programa calcula el factorial de un numero 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int num = sc.nextInt();
		System.out.println("El factorial de "+num+" es "+factorial(num));
	}
	public static int factorial(int n){
		int f = 1;
		if(n !=1 ){
			f=n*factorial(n-1);
		}
		return f;
	}
}
