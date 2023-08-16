public class Main {
    public static void main(String[] args) {

        /* 1 задание */

        int  deposit = 15000;
        int total = 0;
        int i = 0;
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



    }
}