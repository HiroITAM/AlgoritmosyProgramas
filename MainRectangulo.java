/*Eduardo Hiroki Yamada Ortiz
 * 22 sep 2023
 * Clase para probar la clase rectangulo
*/ 

import java.util.Scanner;
public class MainRectangulo {

	public static void main(String[] args) {
		Scanner lectura;
		Rectangulo rec1, rec2;
		double areaRec, periRec;
		double base, altura;
		boolean iguales;
		
		
		rec1 = new Rectangulo(8, 3);
		rec2 = new Rectangulo(1, 3);
		
		lectura = new Scanner(System.in);
		
		System.out.println(rec1.getBase());
		
		areaRec = rec1.area();
		
		System.out.println(areaRec);
		
		System.out.println("Vamos a pedir la base y la altura");
		System.out.println("Dame la base");
		base = lectura.nextDouble();
		System.out.println("Dame la altura");
		altura = lectura.nextDouble();
		
		rec2.setAltura(altura);
		rec2.setBase(base);
		
		System.out.println("El area del rectangulo 2 es: " + rec2.area());
		System.out.println("El perimetro del rectangulo 2 es: " + rec2.perimetro());
		
		iguales = rec1.equals(rec2);
		System.out.println(iguales);
	
	}

}
