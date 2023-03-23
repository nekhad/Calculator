package org.example;

import java.util.Scanner;

public class Calculator {
    public void calculate(){
        Scanner scanner = new Scanner(System.in);
        boolean tekrar = true;

        while (tekrar) {
            System.out.print("İlk ədədi daxil edin: ");
            double number1 = scanner.nextDouble();

            System.out.print("İkinci ədədi daxil edin: ");
            double number2 = scanner.nextDouble();

            System.out.print("Əməliyyat növünü daxil edin (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2==0){
                        System.err.println("Neynədinnnnn,0-a bölmək olmaz axııııı!");
                    }else {
                        result = number1 / number2;
                    }
                    break;
                default:
                    System.out.println("Yanlış əməliyyat,ədədləri yenidən daxil edin!");
                    continue;
            }

            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

            System.out.print("Davam etmək istəyirsiniz? İstəyirsinizsə istədiyiniz düyməni klikləyin,istəmirsinizsə o və ya O yazmaöğınız kifayət edir:) ");
            char choice = scanner.next().charAt(0);
            if (choice == 'O' || choice == 'o') {
                tekrar = false;
            }
        }

        scanner.close();
    }
}
