//Roberto Martinez Palacios
//22/02/2019
//2:52pm
//3:01pm

import java.util.Scanner;
  public class ejercicio24{
   public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero binario a convertir a octal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ (Integer.toOctalString(Integer.parseInt(A, 2))));
 }
}