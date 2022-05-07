import java.util.*;
public class Boolean{
	public static void main(String[] args){
		//Una aplicación que imprime si un numero es par o impar
		Scanner sc = new Scanner(System.in);
		//Variable booleana
		boolean par = false;
		//Número del usuario 
		System.out.print("Ingrese su número: ");
		int num = sc.nextInt();
		//El if espera un resultado booleano 
		if(num%2==0)
			par = true; //De ser verdadero se cambia la variable par a TRUE
		System.out.print("El número es ");
		if(par)
			System.out.println("par"); //Si par es TRUE imprime par
		else
			System.out.println("impar"); //Si es FALSE imprime impar
	}
}
