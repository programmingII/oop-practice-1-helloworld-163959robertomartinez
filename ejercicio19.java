//Roberto Martinez Palacios
//21/02/2019
//4:02pm
//4:38pm

import java.util.Scanner;
  public class ejercicio19{
   public static void main(String args []){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese su numero en decimal:");
	int num = scanner.nextInt();
	String binary = "";

	if (num > 0) {
	  while (num > 0) {
	   if (num % 2 == 0){
	  binary = "0" + binary;
	
	  } else {
	  binary = "1" + binary;	
	   }
	 num = (int) num / 2;
            }
	} else  if (num == 0) {
	  binary = "0";
	} else {
	  binary = "ingrese solo numeros positivos";
	}
	System.out.println("El numero en binario es:"+binary);




 }
}