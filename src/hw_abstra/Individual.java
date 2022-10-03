package hw_abstra;

import java.util.Scanner;

public class Individual extends Client {


    public Individual() {
        super();
    }

    @Override
    protected int individualSum() {
        individualNewSum();
        return 0;
    }

    public void individualNewSum(){
        Scanner scanner = new Scanner(System.in);
        double nySum = scanner.nextInt();

        if (nySum >= 1000){
            System.out.println("Сумма физического лица: " + nySum + "$");
        }else {
            System.out.println("Маленькая сумма");
        }

    }



}
