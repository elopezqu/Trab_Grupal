import java.util.*;
public class Switch{
	public static void main(String[] args){
		//Esta aplicación realiza diferentes saludos
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("| 1. ¡Hola Mundo!  |");
		System.out.println("| 2.¡Hola Sistemas!|");
		System.out.println("| 3. ¡Bienvenidos! |");
		System.out.println("--------------------");
		System.out.print("Indique el número del saludo: ");
		int num = sc.nextInt();
		switch(num){
			case 1 : System.out.println("¡Hola Mundo!");
							 break;
			case 2 : System.out.println("¡Hola Sistemas!");
							 break;
			case 3 : System.out.println("¡Bienvenidos!");
		}
	}
}
