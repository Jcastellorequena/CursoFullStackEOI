package ejerciciosclase1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejerciciosclase1 {


	
	public static void ejercicio1 () {
		int numero = 36;
		int numero2 = 27;
		int suma = numero+numero2;
		System.out.println("La suma es:" + suma);
		
		
	}
	public static void ejercicio2 () {
		int numero = 15;
		int numero2 = 4;
		int suma = numero + numero2;
		int resta = numero- numero2;
		int division = (int) numero/numero2;
		System.out.println("15+4: "  + suma);
		System.out.println("14-4: " + resta);
		System.out.println("15/4: " + division);
		System.out.println("15*4: "+ numero*numero2);
		System.out.println("15%4: " + numero%numero2);
		
		}
	public static void ejercicio3() {
		int valor1 =6, valor2=6;
		System.out.println(valor1 + " es menor que " + valor2 + ": " + (valor1<valor2));  
		System.out.printf("%d y %d son iguales: %b \n",valor1,valor2,valor1==valor2); 
		System.out.println(valor1>=valor2); 
	}
	public static void ejercicio4() {
	double variable1 = 1;
	double variable2 = 2;
	double variable3 = 3;
	double variable4 = 4;
	double resultado = variable1+variable2;
	double resultado2 = resultado*variable3;
	
	System.out.println("El resultado " +  variable1  +" + "+  variable2  + "  = " + (resultado));
	System.out.println( "El resultado de " + resultado + " * " + variable3 + " = " + (resultado*variable3));
	System.out.println("El resultado de "  + resultado2 + " / " + variable4 + "  = " + (resultado2/variable4));              
	
	}
	
	public static void ejercicio5() {
	
		int N = 3;
		System.out.println("Valor inicial de N = " + N );
		N=N+77;
		System.out.println("N+77 = " +   N  );
		N=N-3;
		System.out.println("N-3 = " +  N );
		N=N*2;
		System.out.println("N*2  =  " +   N);
		
	}
	
	public static void ejercicio6() {
		int A= 1;
		int B=2;
		int C=3;
		int D=4;
		int auxB=2;
		
		B=C;
		System.out.println("B toma el valor de C ->B =  " + B);//
		C=A;
		System.out.println("C toma el valor de A ->B =  " + C);//1
		A=D;
		System.out.println("A toma el valor de D ->B =  " + A );//4
		D=B;
		System.out.println("D toma el valor de B ->B =  " + auxB );//2
		
	}
	public static void ejercicios8() {
	int a=5;
	int b=++a;
	int c=a++;
	System.out.println(b);
	System.out.println("B es igual = " + b*5);
	System.out.println("A es igual = " + a*2 );
	
	
	}
	public static void ejercicio9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
		
	}
	
	public static void ejercicio10(){
	Scanner sc = new Scanner(System.in);
	System.out.println("inster un numero");
    double numero =sc.nextDouble ();
	System.out.println("El doble de "+ numero +" : " + 2*numero + "  El triple de " + numero +" : " + 3*numero );
			
		
		
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//ejercicio1();
		 //ejercicio2 ();
		//ejercicio3();
		//ejercicio4();
		 //ejercicio5();
		// ejercicio6();
		//ejercicios8();
		//ejercicio9();
		 ejercicio10();
	}
	

}
