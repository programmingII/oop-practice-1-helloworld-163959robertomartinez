//Roberto Martinez Palacios
//22/02/2019
//3:24pm
//3:36pm

import java.util.Scanner;
  public class ejercicio27{
   public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero octal a convertir a hexadecimal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ Integer.toHexString(Integer.parseInt(A, 8)));
 }
}