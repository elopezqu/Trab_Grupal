public class forLoop {

	public static void main(String[] args) {
		//Declaro mi arreglo que contendrá a los primeros 10 múltiplos de 5
		int [] primerosMultiplos5 = new int[10];
		int count=0;
		for(int i=1; count<10;i++) {
			//Si "i" es multiplo de 5 aumenta el "count" y se agrega al arreglo
			if(i%5==0) {
				primerosMultiplos5[count]=i;
				count++;
			}
		}
		//Este loop for-each imprime todos los elementos del array
		for(int multiplo : primerosMultiplos5) {
			System.out.println(multiplo);
		}
	}

}