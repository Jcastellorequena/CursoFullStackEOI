package holaMundo;


/**
 * Esta es la clase incial del curso
 * @author jaimie
 *@since 1.0
 */
public class HolaMundo {

	
	public static void ejemplosComentarios () {
		/*
		 * Este es mi primer programa
		 * Jose 17/01/2023
		 */
		// System.out.println("Hola Jose");
		System.out.println("Adios mundo!");
		System.out.println("Segundo mundo!");
		System.out.println("Tercer mundo!");
		System.out.println("Tercer mundo!");
		System.out.println("Tercer mundo!");

		
	}
	
	private static void ejemplosTipos() {
		//Numero entero
		int numero =5;
		int numero2 =7;
		int suma = numero + numero2 ;
		int resta =numero2 - numero;
		double division = (double)numero2/numero;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("la division sobre la marcha es:" + (numero2/numero));
		//Numeros decimales
		
	double decimales1 = 3.14;
	double decimales2 = 2.22;
	System.out.println("La multiplicacion es : "+ decimales1*decimales2);
	System.out.println("La suma es: "+(decimales1+decimales2));
    double sumadecimales = numero + decimales1;
    System.out.println("Suma con decimales es:" + sumadecimales);
    //Enteros largos
    int maxInt = Integer.MAX_VALUE; //2147483647
    int minInt = Integer.MIN_VALUE; //-2147483648
    System.out.println("Suma de dos largos: " + (maxInt+minInt));
    long largo1 =2000000000;
    long largo2 =1000000000;
    System.out.println("La suma de los largos correctamente es : "+ (largo1+largo2));
    char letraA = 'a';
    char letraB = 'b';
    System.out.println("La suma de letra a y letra be es: " +letraA+letraB);
    System.out.println("La suma de letra a y letra be es: " +(letraA+letraB));
    System.out.println("La suma de letra a y 3 es: " +(letraA+3)); //100
    System.out.println("La suma de letra a y letra be es: " +(char)(letraA+3));//3
    
    
    
	}
	
	public static void main(String[] args) {
	//ejemplosComentarios();	
	ejemplosTipos();
	}

}
