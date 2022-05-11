import java.util.*;
public class While{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese cuantos números desea ver: ");
		int cantidad = sc.nextInt();
		System.out.print("Ingrese menor rango: ");
		int menor = sc.nextInt();
		System.out.print("Ingrese mayor rango: ");
		int mayor = sc.nextInt();
		System.out.println("Los números son: ");
		while(cantidad > 0){
			System.out.println((int)(Math.random()*(mayor-menor)+menor));
			cantidad--;
		}
	}
}
