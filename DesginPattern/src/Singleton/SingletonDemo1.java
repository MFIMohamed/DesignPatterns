package Singleton;

public class SingletonDemo1 {
    private static SingletonDemo1 uniqueinstance; //static instance
    private SingletonDemo1() {} //create a private constructor to avoid multiple instances

    public static synchronized SingletonDemo1 getInstance(){
        if (uniqueinstance == null ){
            uniqueinstance = new SingletonDemo1();
        }
        return uniqueinstance;
    }
}

//adding the keyword synchronized after the method keyword static would not allow multi-threaded issues
