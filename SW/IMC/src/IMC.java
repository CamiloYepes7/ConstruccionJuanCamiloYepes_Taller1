//me daba error utilizando metros en altura, pero no sabia la razon, entonces decidi hacerlo en centimetros

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese su peso en kg: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Ingrese su altura en centímetros: ");
	        double altura = scanner.nextDouble();

	        double alturametros = altura / 100.0;

	        double imc = peso / (alturametros * alturametros);

	        System.out.println("Su IMC es: " + imc);

	}

}
