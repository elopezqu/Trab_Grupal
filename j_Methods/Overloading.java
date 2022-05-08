import java.util.*;
public class Overloading{
    //Metodo main
    public static void main(String[] args) {
        int[]num = {1,2,3,4,5};
        arrayMulti(num, 5); //Usando el primer metodo
        showArray(num);
        arrayMulti(num); // Usando el segundo metodo
        showArray(num);
        System.out.println("--+---------------------------+--");
        System.out.println(subMethod(5, 4));
        System.out.println(subMethod(5.4, 2.6));
    }

    //Mismos metodos pero con diferente cantidad de Parametros
    static void arrayMulti(int[]ar, int x){
        for(int i=0; i<ar.length; i++){
            ar[i] = ar[i]*x;
        }
    }
    static void arrayMulti(int[]ar){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el multiplicador: ");
        int mult = scan.nextInt();
        for(int i=0; i<ar.length; i++){
            ar[i] = ar[i]*mult;
        }
    }

    //Mismos metodos, igual cantidad de parametros pero de diferente tipo
    static int subMethod(int a, int b){
        return  a-b;
    }
    static double subMethod(double a, double b){
        return a-b;
    }

    //Metodo para mostrar Arrays
    static void showArray(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}