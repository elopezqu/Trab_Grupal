//Conversion de datos Java 

import java.util.*;
class ConversionDeTipos{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    
	// widening casting, de un tipo pequeño a uno mas grande
	// automaticamente
	
	char num1 = 4;
	double conversion = num1;

	System.out.println(conversion);
    
	// narrowing casting, de un tipo grande a uno más pequeño
	// manualmente
	
	double num2 = 3.75;
	int conversion2 = (int) num2;
	System.out.println(num2);
	System.out.println(conversion2);
    }
}

