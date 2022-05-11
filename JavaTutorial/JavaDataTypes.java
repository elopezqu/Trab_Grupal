//Java Data Types

public class JavaDataTypes {
	public static void main (String[] args) {
		
		//El tipo de dato String acepta cadenas de texto 
		String str = new String("EJEMPLO DE STRING");
		
		//El tipo de dato char acepta un solo caracter
		char a = 's';
		
		//El tipo de dato byte acepta solo numeros enteros hasta 127
		byte num1 =123;
		
		//El tipo de dato short acepta solo numeros enteros hasta 32767
        short num2 = 12345;
		
		//El tipo de dato int acepta solo numeros enteros hasta 2,147,483,647
		int num3 = 1234567890;
		
		//El tipo de dato double acepta numeros decimales hasta 15 decimales
		double num01 = 3.14159265358981;
		
		//El tipo de dato float acepta numeros decimales hasta 7 decimales
		float num02 =3.1415926f;
		
		//El tipo de dato int acepta valores de verdad (V/F)
		boolean example = false;
		
		System.out.print("-String : "+str+"\n");
		System.out.print("-char : "+a+"\n");
		System.out.print("-byte : "+num1+"\n");
		System.out.print("-short : "+num2+"\n");
		System.out.print("-int : "+num3+"\n");
		System.out.print("-double : "+num01+"\n");
		System.out.print("-float : "+num02+"\n");
		System.out.print("-boolean : "+example+"\n");
		
	}
}

