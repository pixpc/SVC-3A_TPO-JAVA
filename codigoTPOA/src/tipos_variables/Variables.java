package tipos_variables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		int numero, edad, caso = 12; 
		char sexo = 'M';
		boolean flag = true; 
		double precio = 45.4;
		float cantidad = 77.7f;
		String nombre ="checoflo";
		
		System.out.println("Hola " +precio);
		System.out.print("hola" + cantidad + "Total");
		
		Scanner captura = new Scanner(System.in);
		while (flag) {
		
			System.out.println("Selecciona MENU una opcion");
			System.out.println("\n1: Suma");
			System.out.println("\n2: Resta");
			System.out.println("\n3: Salir");
			int op = captura.nextInt();
			
			
			int result,num1,num2;
			
			switch(op) {
				case 1:
					System.out.println("Valor 1");
					num1 = captura.nextInt();
					
					System.out.println("Valor 2");
					num2 = captura.nextInt();
					
					result = num1+num2;
					System.out.println("Resultado :"+ result);
					break;
				case 2          :
					System.out.println("Valor 1");
					num1 = captura.nextInt();
					
					System.out.println("Valor 2");
					num2 = captura.nextInt();
					
					result = num1-num2;
					System.out.println("Resultado :"+ result);
					break;
				case 3:
					flag = false;
					System.out.println("adios papa");
					break;
			}

	}

	}
}
