//Roberto Martinez Palacios
//21/02/2019
//1:32pm
//2:53pm

import java.util.Scanner;
  public class ejercicio18{
   public static void main(String args []){
	Scanner binary = new Scanner(System.in);
	
	System.out.println("Ingresar los dos numeros binarios");
	System.out.print("Ahora ingrese el primero numero:");
	String bin1 = binary.nextLine();
	
	System.out.print("Ahora ingrese el segundo numero:");
	String bin2 = binary.nextLine();
	
	System.out.println("Primera linea:"+bin1); 
	System.out.println("Segunda linea:"+bin2); 
	
	
	System.out.println("El resultado es:"+Integer.toBinaryString((Integer.parseInt(bin1, 2) * (Integer.parseInt(bin2, 2))))); 
	 
	 
	
 }
}
