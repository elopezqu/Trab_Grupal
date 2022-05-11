import java.util.*;
class Metodos{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese su nombre");
	String nombre = sc.next();
	String nR = nombreAlReves(nombre);
	System.out.println("Su nombre al revés es: "+nR);
    }

    public static String nombreAlReves(String nombre){
	String nombreAlReves = "";

	for(int i=(nombre.length()-1); i>=0; i--){
	    nombreAlReves += nombre.charAt(i);
	}

	return nombreAlReves;

    }
}

