//Roberto Martinez Palacios
//14/02/19
//5:25
//5:39

import java.util.Scanner;
  public class ejercicio12 {
    public static void main(String args []) {
     Scanner in = new Scanner(System.in);
	
	System.out.println("Ingrese el primer numero");
	int num1 = in.nextInt();

	System.out.println("Ingrese el segundo numero");
	int num2 = in.nextInt();

	System.out.println("Ingrese el tercer numero");
	int num3 = in.nextInt();

	System.out.println("Ingrese el cuarto numero");
	int num4 = in.nextInt();

	System.out.println("Igrese el quinto numero");
	int num5 = in.nextInt();

	System.out.println("El promedio de los numeros anteriores es:" + (num1 + num2 + num3 +num4 +num5) / 5);

 }
}