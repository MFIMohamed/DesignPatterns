package Singleton;
//Is a type of Creational design pattern.
//Singleton Design pattern ensures only one instance is ever created

public class SingletonDemo {
    private static SingletonDemo uniqueinstance; //static instance
    private SingletonDemo() {} //create a private constructor to avoid multiple instances

    public static SingletonDemo getInstance(){
        if (uniqueinstance == null ){
            uniqueinstance = new SingletonDemo();
        }
        return uniqueinstance;
    }
}

