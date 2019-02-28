//Roberto Martinez Palacios
//21/02/2019
//12:45pm
//1:24pm

import java.util.Scanner;
  public class ejercicio17{
   public static void main(String args []){ //Ingresar el main para inicializar
	Scanner in = new Scanner(System.in);
	
	System.out.println(""); //Ingresar un Scanner para declaracion
	
	System.out.println("Ingrese el primer numero");
	String A = in.nextLine();

	System.out.println("Ingresar el segundo numero");
	String B = in.nextLine();
	
	int conversion1 = Integer.parseInt(A,2);
	int conversion2 = Integer.parseInt(B,2);
	
	int resultado = conversion1 + conversion2;
	String resultado1 = Integer.toString(resultado,2);
	
	System.out.println("La suma es:"+ resultado1);
 }

}

