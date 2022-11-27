package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("barsik", 20),
                new Cat("Murzik", 10),
                new Cat("Myurka", 20)
        };

        System.out.println("Добавить еду в миску: ");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        plate.info();
        for (Cat c : cats){
            c.eat(plate);
            plate.info();
           // plate.addFood(5);
        }


    }
}
