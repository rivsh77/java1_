package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumInterval(25, 5);
        checkSignPrint(3);
        checkSign(-3);
        printRepeatString("TEXT", 6);
        checkLeapYear(2020);
    }

    private static boolean checkLeapYear(int year) {
        if (((year % 4) == 0 && (year % 100 != 0)) || (year % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }

    private static void printRepeatString(String text, int count) {
        for (int i = 0; i < count; i++){
            System.out.println(text);
        }
    }

    private static boolean checkSign(int i) {
        if (i < 0){
            return true;
        }else {
            return false;
        }
    }

    private static void checkSignPrint(int i) {
        if (i >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean checkSumInterval(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
