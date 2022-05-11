public class methodParameters {

	public static void main(String[] args) {
		//declaro el valor del ancho y el largo de mi rectángulo
		int largo=5;
		int ancho=6;
		imprimirDatos(hallarPerimetro(largo,ancho),hallarArea(largo,ancho));
	}
	//Recibe los 2 parámetros(ancho y largo) y me retorna el perímetro
	public static int hallarPerimetro(int ladoA, int ladoB) {
		return 2*(ladoA+ladoB);
	}
	//Recibe los 2 parámetros(ancho y largo) y me retorna el área
	public static int hallarArea(int ladoA, int ladoB) {
		return ladoA*ladoB;
	}
	//Recibe los 2 parámetros(perímetro y área) y me imprime sus valores, sin retornar nada(void)
	public static void imprimirDatos(int perimetro, int area) {
		System.out.println("El perimetro del rectángulo es: "+perimetro+"u\nSu área es: "+area+"u²");
	}
	

}