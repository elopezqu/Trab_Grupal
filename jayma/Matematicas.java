import java.util.*;
class Matematicas{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//Máximo y mínimo
	System.out.println("Ingrese primer número");
	int a = sc.nextInt();
	System.out.println("Ingrese segundo número");
	int b = sc.nextInt();
    
	int max = Math.max(a,b);
	int min = Math.min(a,b);
	System.out.println("El número mayor es: "+max);
	System.out.println("El número menor es: "+min);
	System.out.println("Valor absoluto del primer número: "+ Math.abs(a));
	System.out.println("Valor absoluto del segundo número: "+ Math.abs(b));
	//calculando el teorema de pitágoras con dos numeros random entre 1-10
	int ran1 = (int)(Math.random()*11+1);
	int ran2 = (int)(Math.random()*11+1);

	System.out.println("\nPITÁGORAS CON DOS NÚMEROS RANDOM");
	System.out.println("Número 1: "+ ran1);
	System.out.println("Número 2: "+ ran2);
	double sumaCuadrados = Math.pow(ran1, 2) + Math.pow(ran2, 2);
	double raiz = Math.sqrt(sumaCuadrados);
	System.out.println("El resultado es: "+ raiz);
  }
}

