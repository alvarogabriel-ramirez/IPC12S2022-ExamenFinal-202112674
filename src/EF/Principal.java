package EF;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("--------------MENU--------------");

            System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion : ");

            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    break;
                case 5:
                    System.out.println("Programa cerrado");
                    System.exit(0);
                default:
                    System.out.println("Opcion no Valida");
                    break;
            }
        } while (opcion != 5);
    }

    public static void Ejercicio1() {
        System.out.println("--------------Ejercicio 1--------------");
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un numero : ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero : ");
        num2 = leer.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es el mayor : " + num1);
            leer.nextLine();
        } else {
            System.out.println("El Segundo numero es el mayor : " + num2);
            leer.nextLine();
        }
    }

    public static void Ejercicio2() {
        System.out.println("--------------Ejercicio 2--------------");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero Impar: ");
        int n = leer.nextInt();

        if (n % 2 == 0) {
            System.out.println("Solo numeros impares!");
            leer.nextLine();

        } else {
            int num = (n + 1) / 2;

            for (int i = 1; i <= num; ++i) {
                int espacio = num - i;

                while (espacio != 0) {
                    System.out.print(" ");
                    --espacio;
                }
                int asterisco = 2 * i - 1;
                while (asterisco != 0) {
                    System.out.print("*");
                    --asterisco;
                }
                System.out.println();
            }
        }
    }
}
