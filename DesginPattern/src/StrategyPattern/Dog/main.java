package StrategyPattern.Dog;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog ();
        dog.setBehave(new play());
        dog.performBehaviour();

        System.out.println("********************************");
        dog.setBehave(new dance());
        dog.performBehaviour();
        System.out.println("********************************");

        dog.setBehave(new bark());
        dog.performBehaviour();
    }
}
