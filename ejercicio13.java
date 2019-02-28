//Roberto Martinez Palacios
//14/02/2019
//5:45pm
//5:58pm

import java.util.Scanner;
  public class ejercicio13{
   public static void main(String args []){
	Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese la altura");
	double altura = in.nextDouble();	
	
	System.out.println("Ingrese la base");
	double base = in.nextDouble();	
	
	System.out.println("Area del rectangulo:");
	System.out.println("El perimetro es:"+((base+altura)*2));
  }
}