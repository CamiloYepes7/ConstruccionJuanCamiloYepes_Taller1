import java.util.Scanner;

public class Numero_primo {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();
	        
	        if (primo(numero)) {
	            System.out.println(numero + " es número primo.");
	        } else {
	            System.out.println(numero + " no es número primo.");
	        }
	    }
	    
	    public static boolean primo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	



	}


