package lesson6;

public class MainClass {
    public static void main(String[] args) {
        int runDistance=150;
        int swmDistance=5;

        Animal[] pets = new Animal[3];
        pets[0] = new Cat("Том");
        pets[1] = new Dog("Бобик");
        pets[2] = new Cat("Мурка");

        for (int i = 0;i<3; i++){
            if (pets[i] instanceof Cat) {
               if( ((Cat) pets[i]).run(runDistance)) {
                   System.out.println(pets[i].name + " пробежал " + runDistance + " м: ");
               }

            }
            if (pets[i] instanceof Dog) {
                if( ((Dog) pets[i]).run(runDistance)) {
                    System.out.println(pets[i].name + " пробежал " + runDistance + " м: ");
                }
                if( ((Dog) pets[i]).swim(swmDistance)) {
                    System.out.println(pets[i].name + " проплыл " + swmDistance + " м: ");
                }
            }
            }
    }
}
