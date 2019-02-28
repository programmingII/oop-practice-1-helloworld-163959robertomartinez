//Roberto Martinez Palacios
//22/02/2019
//3:01pm
//3:10pm

import java.util.Scanner;
  public class ejercicio25{
   public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero octal a convertir a decimal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ ((Integer.parseInt(A, 8))));
 }
}