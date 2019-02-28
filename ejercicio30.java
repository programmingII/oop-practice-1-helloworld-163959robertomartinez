//Roberto Martinez Palacios
//22/02/2019
//4:27pm
//4:49pm

 import java.util.Scanner;
   public class ejercicio30{
    public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero hexadecimal a convertir a octal:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ Integer.toOctalString(Integer.parseInt(A, 5)));
     }
    }