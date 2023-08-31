import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        String[] parimpar = {"par", "impar"};
        System.out.println(numero + " es un número " + parimpar[numero % 2]);
    }
}









