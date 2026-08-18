package aula04;

import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pagamento = scanner.nextDouble();
        scanner.close();

        String us = "$" + Double.toString(pagamento);
        String india = "Rs." + Double.toString(pagamento);
        String china = "￥" + Double.toString(pagamento);
        String france = Double.toString(pagamento) + " €";

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
