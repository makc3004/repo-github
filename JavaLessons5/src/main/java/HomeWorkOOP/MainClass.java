package HomeWorkOOP;

public class MainClass {

    public static void main(String[] args) {
        Animals Cat = new Cat("Кот",200,0,2);
        Animals Dog = new Dog("Собака",150, 10, 0.4);
        Animals Horse = new Horse("Лошадь",1500,100, 3);
        Animals Bird = new Bird("Птица",5, 0, 0.1);

        Cat.move();
        Dog.move();
        Horse.move();
        Bird.move();

    }


}
