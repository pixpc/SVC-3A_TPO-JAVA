package practica2;

import java.util.Scanner;

public class Distanciaentrepuntos {
	
	public static double obtenerdistancias(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Punto A (x1 y1): ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        System.out.print("Punto B (x2 y2): ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        System.out.print("Punto C (x3 y3): ");
        double x3 = entrada.nextDouble();
        double y3 = entrada.nextDouble();

   
        double ladoAB = obtenerdistancias(x1, y1, x2, y2);
        double ladoBC = obtenerdistancias(x2, y2, x3, y3);
        double ladoCA = obtenerdistancias(x3, y3, x1, y1);
        
        System.out.println("\\n--- Longitudes ---");
        System.out.println("AB: " + ladoAB);
        System.out.println("BC: " + ladoBC);
        System.out.println("CA: " + ladoCA);
        
        if (ladoAB == ladoBC && ladoBC == ladoCA) {
        	System.out.println("El triangulo es equilatero");
        } else if (ladoAB == ladoBC || ladoBC == ladoCA || ladoAB == ladoCA) {
        	System.out.println("El triangulo es Isosceles");
        } else {
            System.out.println("El triángulo es Escaleno");
	}
        entrada.close();
	}
}
