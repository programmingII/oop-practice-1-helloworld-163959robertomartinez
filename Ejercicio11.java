//Roberto Martinez Palacios
//14/02/2019
//4:49pm
//5:22

import java.util.Scanner;
	public class Ejercicio11 {
	
	public static void main(String [] args) {

	Scanner circle = new Scanner(System.in);
	double r, p, a;

        System.out.println("Area de un circulo");
        r=circle.nextDouble();
	p=(2*3.14)*(r);
	a=(3.14)*(r*r);
	
	System.out.println("Perimetro"+p);
	System.out.println("Area"+a);
    }
}