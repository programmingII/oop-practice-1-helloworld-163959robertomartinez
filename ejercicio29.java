//Roberto Martinez Palacios
//22/02/2019
//4:02pm
//4:16pm

 import java.util.Scanner;
   public class ejercicio29{
    public static void main(String args []){
  	Scanner sc = new Scanner(System.in);
		
	System.out.println("Ingrese el numero hexadecimal a convertir a binario:");
	String A = sc.nextLine();
	
	System.out.println("El resultado sera:"+ Integer.toBinaryString(Integer.parseInt(A, 5)));
     }
    }