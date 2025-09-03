package practicas;
import java.util.*;

public class Practica1 {

    public static void main(String[] args) {
        
        int[] numeros = new int[15];
        int num, contador_neg = 0, suma_impares = 0, contador_impares = 0;
        
        Scanner captura = new Scanner(System.in);
        
        // Captura de los 15 números
        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Dame el valor " + (x+1) + ": ");
            num = captura.nextInt();
            numeros[x] = num;
        }
        
        System.out.println("\n--- Resultados ---");
        
        
        for (int i = 0; i < numeros.length; i++) {
            
            
            if (numeros[i] % 2 == 0 && numeros[i] > 0) {
                double raiz = Math.sqrt(numeros[i]);
                System.out.println("La raíz cuadrada de " + numeros[i] + " es " + raiz);
            }
            
            
            if (numeros[i] < 0) {
                contador_neg++;
            }
            
            
            if (numeros[i] % 2 != 0) {
                suma_impares += numeros[i];
                contador_impares++;
            }
        }
        
        //Resultados
        System.out.println("Total de números negativos: " + contador_neg);
        
        if (contador_impares > 0) {
            double promedio = (double) suma_impares / contador_impares;
            System.out.println("Promedio de los números impares: " + promedio);
        } else {
            System.out.println("No se ingresaron números impares.");
        }
        
        captura.close();
    }
}
