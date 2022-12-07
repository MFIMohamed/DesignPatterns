package StrategyPattern;

public class Bird{

    flyBehaviour newFlyBehaviour;

    public void setflyBehaviour(flyBehaviour newFlyBehaviour){

        this.newFlyBehaviour = newFlyBehaviour;
    }

    void performBehaviour(){
        this.newFlyBehaviour.fly();
    }

    speakBehaviour Speakbehavior;

    public void setSpeakbehavior(speakBehaviour speakbehavior) {
        Speakbehavior = speakbehavior;
    }

    public void performSpeak(){
        this.Speakbehavior.speak();
    }
}
