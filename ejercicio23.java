//Roberto Martinez Palacios
//22/02/2019
//2:36pm
//2:43pm

import java.util.Scanner;
  public class ejercicio23{
   public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero binario a convertir a hexadecimal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado será:"+ (Integer.toHexString(Integer.parseInt(A, 2))));


 

 }
}