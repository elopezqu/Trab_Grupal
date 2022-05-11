import java.util.*;
class Operadores{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //usando operadores aritméticos 
     
    System.out.println("OPERADORES ARÍTMETICOS");
    System.out.println("");
    System.out.println("1) F(x) = 4*(x+7), representa la ganancia de 3 trabajadores, x = días");

    int x = 30;
    int ganancia =  4*(x+7);
    int resto = ganancia % 3;
    double gananciaxTrabajador = (ganancia-resto)/3;

    int J = (int) gananciaxTrabajador;
    int regalo = resto;

    System.out.println("Desean repartirse en cantidades enteras y regalar el resto");
    System.out.println("Ganancia por trabajador: "+ gananciaxTrabajador);
    System.out.println("Regalan: "+ resto);
    System.out.println("Un trabajador J regala 1 unidad más de su dinero");
    J--;
    regalo++;
    System.out.println("J se queda con: "+J);
    System.out.println("se regala: "+ regalo);
    
    //usando operadores de asignación
    System.out.println("\n\nOPERADORES DE ASIGNACIÓN:  A+(operador)+´=´+B, ejemplo");
    int A = 7;
    int B = 6;
    A%=B;
    System.out.println("7%=6; el valor actual de A es: "+A);

    //usando operadores de comparación(== ,!=, >, <, <=, >=) y lógicos( &&, ||, !)
    System.out.println("\n\nOPERADORES DE COMPARACIÓN Y LÓGICOS");
    int l = 2;
    System.out.println("Ejemplo con el número 2");
    if( l == 3){
	System.out.println("Es igual a 3");
    }
    if(l != 3){
	System.out.println("Es diferente de 3");
    }
    if(l < 3){
	System.out.println("Es menor 3");
    }
    if(l > 3){
	System.out.println("Es mayor 3");
    }
    

    if(l>1 && l<4){
	System.out.println("Es mayor a 1 y menor a 4");
    }

    if(l == 2 || l == 6){
	System.out.println("Es igual a 2 o igual a 6");
    }
    if( !(l == 3) ){
	System.out.println("No es cierto que es igual a 3");
    }

  }
}

