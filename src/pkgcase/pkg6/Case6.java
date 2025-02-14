
package pkgcase.pkg6;
import java.util.Scanner;

public class Case6 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
         String operacion;
        int opcion;
        do{
        System.out.println("ingrese un numero entre 1 y 4 para elegir la operacion matematica 1:suma, 2:resta, 3:multiplicacion, 4:division, 5: salir");
            opcion = sc.nextInt();
 
        switch(opcion ) {
            
            case 1: operacion = "suma";
                System.out.println("ingrese el primer numero");
                double number = sc.nextDouble();
                System.out.println("ingrese el segundo numero");
                double number2 = sc.nextDouble();
                double resultado;
                resultado = number + number2;
                System.out.println("el resultado es "+ resultado);
            break;
            case 2: operacion = " resta";
                System.out.println("ingrese el primer numero");
                double num1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero");
                double num2 = sc.nextDouble();
                double result;
                result = num1 -num2;
                System.out.println("el resultado es "+ result);
            break;
            case 3: operacion = "multiplicacion";
                System.out.println("ingrese le primer numero");
                double numm1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero");
                double numm2 = sc.nextDouble();
                resultado = numm1 * numm2;
                System.out.println("el resultado es "+ resultado);
            break;
            case 4: operacion = " division";
                System.out.println("ingrese el primer numero");
                double number1 = sc.nextDouble();
                System.out.println("ingrese el segundo numero");
                double numberr2 = sc.nextDouble();
                resultado = number1 / numberr2;
                System.out.println("el resultado es "+ resultado);
            break;
            case 5: 
                System.out.println("salistes del programa");
                System.exit(0);
            break;
                default: operacion = "invalida ingrese numero del 1 al 4 ";
            break;

        }

        }while(opcion !=5);
        
        sc.close();
    }
}
    

