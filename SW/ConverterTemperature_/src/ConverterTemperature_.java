import java.util.Scanner;

public class ConverterTemperature_ {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Elija una opción (1 para Celsius a Fahrenheit, 2 para Fahrenheit a Celsius): ");
	        int opcion = scanner.nextInt();

	        System.out.print("Ingrese la temperatura: ");
	        double temperatura = scanner.nextDouble();
	        
	        
	        double temperaturafinal = 0.0;

	        temperaturafinal = (opcion == 1) ? (temperatura * 9.0 / 5.0) + 32.0 :
	                            (opcion == 2) ? (temperatura - 32.0) * 5.0 / 9.0 : 0.0;

	        String unidad = (opcion == 1) ? "°F" : (opcion == 2) ? "°C" : "";

	        System.out.println("Equivalente: " + temperaturafinal + " " + unidad);

		
	

		

	}

	
	}


