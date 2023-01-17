package ejercicio1;

public class ejercicios1 {

	
	public static void comparaNumeros () {
		int x=10;
		int y=10;
		
		if (x == y) { 
			System.out.println("Son iguales");
		}
		else if (x > y) {
			System.out.println("X es mayor que y");
		}
		else {
			System.err.println("Y es mayor que x");
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		comparaNumeros();
		

	}

}
