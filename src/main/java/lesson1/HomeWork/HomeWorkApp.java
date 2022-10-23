package lesson1.HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 3;
        int b = 3;

        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 104;

        if (value <= 0){
            System.out.println("Красный");
        } else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    private static void checkSumSign() {
        int a = 10;
        int b = 2;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

}
