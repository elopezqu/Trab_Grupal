import java.util.*;
public class Condiciones{
	public static void main(String[] args){
		//Aplicación para sacar el mayor de tres números
		Scanner sc = new Scanner(System.in);
		//Se pide al usuario los tres números
		System.out.print("Primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Tercer número: ");
		int num3 = sc.nextInt();
		//Se llama a la función mayorNum
    int mayor = mayorNum(num1, num2, num3);
		System.out.println("El mayor número es : "+mayor);
	}
	public static int mayorNum(int a,int b,int c){
		//Se establece como mayor a "a"
		int mayor = a;
		//Si b es mayor que c pasa a la siguiente condición 
		if(b > c){
			if(b > mayor)
				mayor = b; //Si b es mayor se cambia la variable
		}//Si c es mayor se cambia a la variable
		else if(c > mayor)
			mayor = c;
		return mayor;
	}
}
