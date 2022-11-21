package lesson5;

public class Comp {
    public static void main(String[] args){
        Employee[] emplArray = new Employee[5]; // Вначале объявляем массив объектов
        emplArray[0] = new Employee("Ivan","Ivanov","Engineer", "ivivan@mailbox.com","892312312",300,30);
        emplArray[1] = new Employee("Ann","Ivanova","HR", "ivann@mailbox.com","892314412",300,30);
        emplArray[2] = new Employee("Kate","Sidorova","Manager", "sikate@mailbox.com","894412312",500,41);
        emplArray[3] = new Employee("Boris","Petrov","CEO", "peboris@mailbox.com","892312344",3000,43);
        emplArray[4] = new Employee("Peter","Borisov","Engineer", "bopeter@mailbox.com","892315512",300,38);

        for (int i = 0;i<5; i++){
            if (emplArray[i].getAge() > 40){
                emplArray[i].info();
            }
        }
    }
}
