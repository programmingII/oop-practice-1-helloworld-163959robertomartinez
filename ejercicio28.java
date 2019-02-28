//Roberto Martinez Palacios
//22/02/2019
//3:41pm
//3:53pm

 import java.util.Scanner;
   public class ejercicio28{
    public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero hexadecimal a convertir a decimal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ Integer.parseInt(A, 16));
     }
    }