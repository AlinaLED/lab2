package lab2;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int x = 0;
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;

            } else {
                System.out.println("Error type");
                scanner.next();

            }
        }
        System.out.println("Введите значение n: ");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
                }
            else {
                System.out.println("Error type");
                scanner.next();

            }
        }
        scanner.close();

        int a;
        int b = 1;


        if (n<15) {
            if (n >= 0) {
                for (int i = 1; i <= n; i++) {
                    a = x;
                    b = b * a;
                }
                System.out.println(b);
            }

            else{
                for (int i = -1; i >= n; i--) {
                    a = x;
                    b = b * a;

                }
                System.out.print( "1/");
                System.out.print( b);
            }


        }
        else {System.out.println("Ведите число меньше 15");}
    }
}
