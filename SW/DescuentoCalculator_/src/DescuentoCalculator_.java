import java.util.Scanner;

public class DescuentoCalculator_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el precio del producto");
		double precio = scanner.nextDouble();
		
		System.out.print("Ingrese el descuento del producto");
		double descuento = scanner.nextDouble();
		
		
		double preciodescontado = precio * (1 - descuento / 100);
		System.out.println("El precio con el descuento es: " + preciodescontado);
		
		

		

		
		
		
		

	}

}
