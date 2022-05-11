public class breakContinue {

	public static void main(String[] args) {
		//Recorre lo 100 primeros numeros naturales
		//Me imprimir los multiplos de 4 pero no de 10, y en caso de encontrar un múltiplo de 4 y 23 acaba el proceso(break)
		for(int i=1; i<=100;i++) {
			//Me asegura que sea múltiplo de 4
			if(i%4==0) {
				//Si encuentra un múltiplo de 4 y 23 rompe el bucle
				if(i%23==0) {
					System.out.println("************************************");
					System.out.println("Número con multiplo común de 23 y 4: "+i+" (fin del proceso)");
					break;
				}
				//Si se encuentra un cun múltiplo de 10 imprime 2 asterismos
				if(i%10==0) {
					System.out.println("**");
					continue;
				}
				//Imprime el múltiplo de 4
				System.out.println(i);
			}
		}
	}

}
