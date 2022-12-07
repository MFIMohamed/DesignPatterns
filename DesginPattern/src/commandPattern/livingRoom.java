package commandPattern;

public class livingRoom implements Light{
    @Override
    public void on() {
        System.out.println("Living Room Light On");
    }

    @Override
    public void off() {
        System.out.println("Living room Light off");
    }
}
