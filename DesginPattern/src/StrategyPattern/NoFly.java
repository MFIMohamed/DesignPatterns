package StrategyPattern;

public class NoFly implements flyBehaviour{
    public void fly(){
        System.out.println("Cannot Fly");
    }
}
