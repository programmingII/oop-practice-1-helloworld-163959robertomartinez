//Roberto Martinez Palacios
//08/02/2019
//1:28pm
//1:53

import java.util.Scanner;
	public class Ejercicio7 {
	public static void main(String [] args) {
	int num;

	Scanner in = new Scanner(System.in);

	System.out.println("Ingresa el numero:");
	num = in.nextInt();

	for(int i=0; i<10; i++){
	System.out.println((i+1)*num);
      }

    }
  }