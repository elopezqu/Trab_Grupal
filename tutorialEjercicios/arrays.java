public class arrays {

	public static void main(String[] args) {
		//Declaro mi arreglo que contentrá a los primeros 10 números naturales
		int [] primerosNaturales = new int[10];
		//Este loop for asigna los valores correspondientes al array
		for(int i=1; i<=10;i++) {
			primerosNaturales[i-1]=i;
		}
		//Este loop for-each imprime todos los elementos del array
		for(int num : primerosNaturales) {
			System.out.println(num);
		}

	}

}