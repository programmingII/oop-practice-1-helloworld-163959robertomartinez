//Roberto Martinez palacios
//22/02/2019
//10:20am
//10:51am

import java.util.Scanner;
  public class ejercicio21 {
   
    public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero decimal:");
	String A = sc.nextLine();

	System.out.println("El resultado será:"+ Integer.toOctalString((Integer.parseInt(A, 10))));

 }
}