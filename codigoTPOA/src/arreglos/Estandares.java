package arreglos;

import java.util.Scanner;

public class Estandares {
	
	public static void main(String[] args) {
		
		int[] edades = new int[5];
		
		Scanner captura = new Scanner(System.in);
		
		for(int i = 0; i <= edades.length; i++) {
			System.out.println("Dame la edad: " +i );
			edades[i] = captura.nextInt();
				
		}
		int x = 1;
		while(x >= edades.length) {
			System.out.println("Valor de x: " + edades[x]);
		}
	}

}
