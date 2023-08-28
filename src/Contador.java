import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro numro: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Informe o segundo numro: ");
        int numeroDois = scanner.nextInt();

        while (numeroUm > numeroDois) {
            ParametrosInvalidosException();
            System.out.println("Informe o primeiro numro: ");
            numeroUm = scanner.nextInt();
            System.out.println("Informe o segundo numro: ");
            numeroDois = scanner.nextInt();                       
        }    

        int total = numeroDois - numeroUm;
        for( int i = 1; i <= total; i++){
            System.out.println("Imprimindo o nº: " + i);
        }        
    }

    static void ParametrosInvalidosException(){
            System.out.println("O segundo numero deve ser maior que o primeiro ");
            System.out.println();
    }
}