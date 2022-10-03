package hw_abstra;

import java.util.Scanner;

public class IndividualEntrepreneur extends Client {
    public IndividualEntrepreneur() {
        super();
    }

    @Override
    protected int individualSum() {
        newSumLegalEntities();
        return 0;
    }

    public void newSumLegalEntities() {

        Scanner scanner = new Scanner(System.in);
        double customerAmount = scanner.nextInt();

        double percent = 1;
        double newSum = 0;
        if (customerAmount <= 1000) {

            double sumCalculation = customerAmount * percent / 100;
            newSum = customerAmount - sumCalculation;

            System.out.println("Ваша сумма: " + newSum + "$");

        } else {
            double percent1 = 0.5;
            double newSum1 = 0;
            if (customerAmount >= 1000) {

                double sumCalculation = customerAmount * percent1 / 100;
                newSum1 = customerAmount - sumCalculation;

                System.out.println("Сумма ЧП: " + newSum1 + "$");
            }
            else {
                System.out.println("Маленькая сумма");
            }

        }

    }
}
