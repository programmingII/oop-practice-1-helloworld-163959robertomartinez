//Roberto Martinez Palacios
//22/02/2019
//3:11pm
//3:21pm

import java.util.Scanner;
  public class ejercicio26{
   public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero octal a convertir a binario:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ Integer.toBinaryString(Integer.parseInt(A, 8)));
 }
}