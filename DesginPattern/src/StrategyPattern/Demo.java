package StrategyPattern;

public class Demo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        flyBehaviour flyBehave = new flyWithWings();
        bird.setflyBehaviour(flyBehave);
        bird.performBehaviour();

        bird.setflyBehaviour(new fastFly());
        bird.performBehaviour();

        bird.setflyBehaviour(new NoFly());
        bird.performBehaviour();

        speakBehaviour speakBehave = new noSpeak();
        bird.setSpeakbehavior(speakBehave);
        bird.performSpeak();

        speakBehaviour nspeakBehave = new Beeebeee();
        bird.setSpeakbehavior(nspeakBehave);
        bird.performSpeak();

        bird.setSpeakbehavior(new bikibiki());
        bird.performSpeak();

        bird.setSpeakbehavior(new burkyBurky());
        bird.performSpeak();

        bird.setSpeakbehavior(new burkyBurky());
        bird.performSpeak();

        bird.setflyBehaviour(new NoFly());
        bird.performBehaviour();

        bird.setflyBehaviour(new flyWithWings());
        bird.performBehaviour();

    }
}
