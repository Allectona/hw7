public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        int  deposit = 15000;
        int total = 0;
        int i = 1;
        while (total<2_459_000) {
            total = total + deposit;
            System.out.println("Месяц " + i++ + ", сумма накоплений равна " + total + " рублей");
        }

        /* 2 задание */

        int g = 1;
        while (g<=10) {
            System.out.print(g + " ");
            g++;
        }
        System.out.println();
        for (int a=10; a>=1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        /* 3 задание */

        int population = 12_000_000;
        int peopleBornPer1000 = 17;
        int peopleDiedPer1000 = 8;
        int difference = peopleBornPer1000 - peopleDiedPer1000;

        for (int p = 1; p<=10; p++) {
            population += population * difference / 1000;
            System.out.println("Год " + p + ", численность населения составляет " + population);
        }

        /* 4 задание */

        int Deposit = 15000;
        int Total = 0;

        for (int a = 1; Total<=12_000_000; a++) {
            Total = Total + Total*7/100;
            Total = Total + Deposit;
            System.out.println("В " + a + " месяце у вас накоплено уже " + Total);
        }

        /* 5 задание */

        int monthDeposit = 15000;
        int totalMoney = 0;
        int b = 0;
        for (; totalMoney<=12_000_000; b++) {
            totalMoney = totalMoney + totalMoney*7/100;
            totalMoney = totalMoney + monthDeposit;
            if (b % 6 == 0) {
                System.out.println("В " + b + " месяце у вас накоплено уже " + totalMoney);
            }
        }

        /* 6 задание */

        int monthDep = 15000;
        int totalMon = 0;
        int c = 0;
        for (; c<=108; c++) {
            totalMon = totalMon + totalMon*7/100;
            totalMon = totalMon + monthDep;
            if (c % 6 == 0) {
                System.out.println("За " + c + " месяцев сумма ваших накоплений равна " + totalMon);
            }
        }

        /* 7 задание */

        int friday = 4;
        for (; friday<=31; friday=friday+7) {

            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        /* 8 задание */

        int comets = 0;
        int thisYear = 2023;
        int pastYears = thisYear - 200;
        int maxFutureYear = thisYear + 100;
        for (; comets<=maxFutureYear; comets = comets+79) {
            if (comets>pastYears){
                System.out.println(comets);
            }
        }





    }
}