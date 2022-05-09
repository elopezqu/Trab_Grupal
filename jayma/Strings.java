import java.util.*;
class Strings{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("DIGITE SU NOMBRE");
    String nombre = sc.nextLine();

    //Concatenación
    String saludo = "!HOLA "+nombre+"!";
    String forma2 = nombre.concat(" bienvenido");

    System.out.println(saludo);
    System.out.println(forma2);

    //Instrumentos 
    System.out.println("Cantidad de letras que tiene su nombre: "+ nombre.length());
    System.out.println("Su nombre en mayúsculas: " + nombre.toUpperCase());
    System.out.println("Su nombre en minúsculas: " + nombre.toLowerCase());


    System.out.println("");
    String linea = "hola mundo";
    System.out.println("Linea: "+ linea);
    System.out.println("Buscando ´hola´ en linea\nSe encuentra en la posición: "+ linea.indexOf("hola"));
    
    //Números y cadenas 
    int a = 2022;
    String año = "Año: "+a;
    System.out.println(año);
    
    //Caracteres Especiales
    //se debe anteponer \ ejemplo, \+\, \+", \+'

    String caracterEspecial = "El \"software\" \'libre\'";
    System.out.println("\n"+caracterEspecial);
	//Secuencias de escape
    String secuenciasE = "Me\bgusta\nescuchar\rmusica\fy\tdescansar";
    System.out.println("\n"+secuenciasE);
  }
}

