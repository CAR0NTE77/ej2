import java.util.Scanner;

public class ifEj {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroIf;

        System.out.println("Ingrese un numero positivo o negativo: ");
        numeroIf=teclado.nextInt();
        if(numeroIf > 0){
            System.out.println("su numero es Positivo");
        } else if (numeroIf == 0) {
            System.out.println("su numero es cero, este es un elemento neutro, por lo tanto no es ni positivo ni negativo");
        }else {
            System.out.println("su numero es negativo ");
        }
    }
}
