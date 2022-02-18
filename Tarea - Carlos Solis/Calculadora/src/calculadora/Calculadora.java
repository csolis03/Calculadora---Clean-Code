/*
Ing. Carlos Solís Alfaro
Técnicas de programación
*/
package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        float suma, resta, multiplicacion, division;
        float valor1, valor2;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Si desea realizar una suma ingrese 1, resta 2, multiplicación 3, división 4");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.println("Ingrese el primer valor");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo valor");
                valor2 = entrada.nextInt();
                suma = valor1 + valor2;
                System.out.println("La suma es de "+ suma);
                break;
            case 2:
                System.out.println("Ingrese el primer valor");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo valor");
                valor2 = entrada.nextInt();
                resta = valor1 - valor2;
                System.out.println("La resta es de "+ resta);
                break;
            case 3:                 
                System.out.println("Ingrese el primer valor");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo valor");
                valor2 = entrada.nextInt();
                multiplicacion = valor1 * valor2;
                System.out.println("La multiplicación es de "+multiplicacion);
                break;
            case 4:
                System.out.println("Ingrese el primer valor");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese el segundo valor");
                valor2 = entrada.nextInt();
                division = valor1 / valor2;
                System.out.println("La division es de " +division);
                break; 
            default: 
                System.out.println("Dato inválido");
        }
        
    }
    
}
