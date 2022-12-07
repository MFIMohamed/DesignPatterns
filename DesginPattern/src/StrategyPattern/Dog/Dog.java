package StrategyPattern.Dog;

public class Dog {
    behaviour behave;

    public void setBehave(behaviour behave){
        this.behave = behave;
    }
    public void performBehaviour(){
        this.behave.behaviour();
    }
}

