package hw_abstra;

import java.util.Scanner;

public class LegalEntities extends Client {
    public LegalEntities() {
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
        if (customerAmount >= 1000) {

            double sumCalculation = customerAmount * percent / 100;
            newSum = customerAmount - sumCalculation;

            System.out.println("Сумма юридического лица: " + newSum + "$");

        } else {
            System.out.println("Маленькая сумма");
        }

    }

}
