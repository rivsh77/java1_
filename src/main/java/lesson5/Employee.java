package lesson5;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


    public Employee(String firstName, String lastName, String position, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.println("Имя сотрудника: " + firstName +
                "; Фамилия сотрудника: " + lastName+
                "; Должность: " + position +
                "; E-mail: " + email +
                "; Номер телефона: " + phoneNumber +
                "; Зарплата: " + salary +
                "; Возраст: " + age);
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    }
