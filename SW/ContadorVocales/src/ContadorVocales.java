import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        int nvocales = texto.replaceAll("[^aeiouAEIOU]", "").length();

        System.out.println("La cantidad de vocales en el texto es: " + nvocales);


	}

}
