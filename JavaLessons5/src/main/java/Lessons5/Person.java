package Lessons5;


public class Person {

    String nameSurname;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    public Person(String nameSurname, String position, String email, String phone, int salary, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    void printInfo(){
        System.out.println("ФИО: "+nameSurname+"; Должность: "+ position+"; E-mail: "+email+"; Номер телефона: "+phone+"; Зарплата: "+salary+"; Возраст: "+age+";");

    }

}

