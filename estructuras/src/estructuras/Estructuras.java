package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre");
		String nombre = sc.next();
		
		if(nombre.equals("Fran")) {
			System.out.println("Hola fran");
		}
		System.out.println("Pasa un buen dia");
	sc.close();
	
	}
	
  public static void ejemploIfElse() {
	
		Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el nombre");
		String nombre = sc.next();
		
	 if(nombre.equals("Fran")) {
			System.out.println("Hola fran");
			System.out.println("Encantado de verte de nuevo");
			
		} else {
			System.out.println("Hola persona desconocida");
			System.out.println("Espero verte habitualmente por aqui");
			
		}
	 
		System.out.println("Pasa un buen dia");
	sc.close();
	}
	
  public static void ejemploIfElseIfElse() {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Tira un dado y escribe que numero ha salido");
	int numero =sc.nextInt();
	
	if(numero==1) {
		System.out.println("Ha salido un uno");
		}else if(numero==2) {
	System.out.println("ha salido un 2");
		}else if(numero==3) {
			System.out.println("ha salido un 3");
		}else if(numero==4) {
			System.out.println("ha salido un 4");
		}else if(numero==5) {
			System.out.println("ha salido un 5");
		}else if(numero==6) {
			System.out.println("ha salido un 6");
		}else {
			System.out.println("Que tipo de dato tienes que puede salir diferente");
			}
	
	sc.close();
  }
  
      public static void ejemploSwitch() {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Tira un dado y escribe que numero ha salido");
    		int numero =sc.nextInt();
    		
    		switch(numero) {
    		case 1:
    			System.out.println("Ha salido un uno");
    			break;
    		case 2:
    			System.out.println("Ha salido un dos");
			break;
    		case 3:
    			System.out.println("Ha salido un tres");
    			break;
    		case 4:
    			System.out.println("Ha salido un cuatro");
    			break;
    		case 5:
    			System.out.println("Ha salido un cinco");
    			break;
    		case 6:
    			System.out.println("Ha salido un seis");
    			break;
    			default:
    				System.out.println("que numero tienes");
    				}
    		
    		    sc.close();
                }
      
      public static void ejemploTernarias () {
    	  int edad= 20;
    	 //if (edad>=18)
    		//  System.out.println("eres mayor de edad");
    	// else
    		  //System.out.println("eres menor");
    	  
    	  System.out.println(edad>=18?"eres mayor de edad":"eres menor");
    	  int descuento = edad>=18?5:20;
    	  System.out.println(descuento);
    			  
    		 
    	   }
	
    
	
	

	
	public static void main(String[] args) {
	     //ejemploIf();
		 // ejemploIfElse();
		 //ejemploIfElseIfElse();
		 //ejemploSwitch();
		//ejemploTernarias();
		
	}

}
