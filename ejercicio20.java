//Roberto Martinez Palacios
//21/02/2019
//6:05pm
//7:03pm

import java.util.Scanner;
  public class ejercicio20{
   public static void main(String args []){
	Scanner lee = new Scanner(System.in); 
	
	System.out.println("Ingresa un numero:"); 
	String num = ""; 

	int n = lee.nextInt(); 
	num = Integer.toHexString(n); 

	System.out.println("Numero decial a hexadecimal: "+ num); 
 } 
}