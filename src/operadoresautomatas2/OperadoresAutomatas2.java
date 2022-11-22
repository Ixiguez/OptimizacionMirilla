package operadoresautomatas2;
import java.util.Scanner;
public class OperadoresAutomatas2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = entrada.nextInt();
        switch(numero){
            case 1: System.out.println("Tengo un lagarto"); break;
            case 2: System.out.println("Tengo un perro"); break;
            case 3: System.out.println("Tengo un gato"); break;
            case 4: System.out.println("Tengo una serpiente"); break;
            case 5: System.out.println("Tengo un loro"); break;
            default: System.out.println("No tengo mascota"); break;
        }
    }   
}
