//Roberto Martinez Palacios
//09/02/2019
//1:09pm
//1:22pm

import java.util.Scanner;
    public class Ejercicio6 {		
	
	public static void main(String [] args) {

	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese algun numero");
	int num1 = in.nextInt();
	System.out.println("Ingrese otro numero");
	int num2 = in.nextInt();
	
	System.out.println("Suma:" + (num1 + num2));
	System.out.println("Resta:" + (num1 - num2));
	System.out.println("Multiplicacion:" + (num1 * num2));
	System.out.println("Porcentaje: " + (num1 % num2));
      }
    }