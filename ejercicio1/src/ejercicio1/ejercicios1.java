package ejercicio1;

public class ejercicios1 {

	
	public static void sumaNumeros() {
		int numero = 36;
		int numero2 = 27;
		int suma = numero+numero2;
		System.out.println("La suma es: " + suma );
	
	}
	public static void variableNumeros() {
		int numero = 15;
		int numero2 = 4;
		int suma = numero + numero2;
		int resta = numero - numero2;
		int division = (int) numero/numero2;
		System.out.println("15+4: "  + suma);
		System.out.println("15-4: " + resta);
		System.out.println("15/4: " + division);
		System.out.println("15*4: "+ numero*numero2);
		System.out.println("15%4: " + numero%numero2);
		
		
	}
	
	
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
		sumaNumeros();
		variableNumeros();

	}

}
