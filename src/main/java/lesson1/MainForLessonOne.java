package lesson1;

import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGeneratorFactory;
public class MainForLessonOne {

    public static void main(String[] args){
        System.out.println("OLOLOLololol");
       // printHello();
     //   testVars();
        checkAppraisal();
    }

    private static void checkAppraisal() {
        int appraisal = ThreadLocalRandom.current().nextInt(-1, 7);
        System.out.println("apr" + appraisal);

        if (appraisal == 5){
            System.out.println("OLOLOLololol");
        } else if (appraisal>= 1 && appraisal <= 3){
            System.out.println("готовь уроки лучше");
        } else {
            System.out.println("не мухлюй");

        }
    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;

        System.out.println(1.0 * varA / varB);

        double varDoubA = 9.1;
        double varDoubB = 5.0;

        System.out.println(varDoubA / varDoubB);

        int result1 = (int)(varA / varDoubB);
        double result2 = varA / varDoubB;

        String helloStr = "hello";
        String wrldStr = "world";

        System.out.println(helloStr + ", " + wrldStr + (3 + 5));
    }

    static void printHello(){
        System.out.println("привет");
        System.out.println("");
    }
}
