package Lessons5;


public class MainClass {
    public static void main(String[] args) {
        //Задания от 1 до 3
//        Person Person1 = new Person("Петровский Иван", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        Person Person2 = new Person("Сидоров Сергей", "Seller", "sidorov@mailbox.com", "123456789", 250000, 23);
//        Person Person3 = new Person("Галкин Павел", "Seller", "gpavel@mailbox.com", "987654321", 25000, 27);
//        Person Person4 = new Person("Петров Александр", "Director", "bos@mailbox.com", "777777777", 150000, 47);
//        Person Person5 = new Person("Овечкина Анастасия", "Accountant", "money@mailbox.com", "123987645", 50000, 50);
//        System.out.println("ФИО: "+Person1.nameSurname+", Должность: "+ Person1.position+", E-mail: "+Person1.email+", Номер телефона: "+Person1.phone+", Зарплата: "+Person1.salary+", Возраст: "+Person1.age+";");
//        System.out.println("ФИО: "+Person2.nameSurname+", Должность: "+ Person2.position+", E-mail: "+Person2.email+", Номер телефона: "+Person2.phone+", Зарплата: "+Person2.salary+", Возраст: "+Person2.age+";");
//        System.out.println("ФИО: "+Person3.nameSurname+", Должность: "+ Person3.position+", E-mail: "+Person3.email+", Номер телефона: "+Person3.phone+", Зарплата: "+Person3.salary+", Возраст: "+Person3.age+";");
//        System.out.println("ФИО: "+Person4.nameSurname+", Должность: "+ Person4.position+", E-mail: "+Person4.email+", Номер телефона: "+Person4.phone+", Зарплата: "+Person4.salary+", Возраст: "+Person4.age+";");
//        System.out.println("ФИО: "+Person5.nameSurname+", Должность: "+ Person5.position+", E-mail: "+Person5.email+", Номер телефона: "+Person5.phone+", Зарплата: "+Person5.salary+", Возраст: "+Person5.age+";");


//Задание 4

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петровский Иван", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Сидоров Сергей", "Seller", "sidorov@mailbox.com", "123456789", 250000, 23);
        persArray[2] = new Person("Галкин Павел", "Seller", "gpavel@mailbox.com", "987654321", 25000, 27);
        persArray[3] = new Person("Петров Александр", "Director", "bos@mailbox.com", "777777777", 150000, 47);
        persArray[4] = new Person("Овечкина Анастасия", "Accountant", "money@mailbox.com", "123987645", 50000, 50);

        persArray[0].printInfo();
        persArray[1].printInfo();
        persArray[2].printInfo();
        persArray[3].printInfo();
        persArray[4].printInfo();

    }
}









