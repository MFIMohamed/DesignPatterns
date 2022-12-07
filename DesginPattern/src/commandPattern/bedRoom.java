package commandPattern;

public class bedRoom implements Light{

    @Override
    public void on() {
        System.out.println("Bedroom light On");
    }

    @Override
    public void off() {
        System.out.println("Bedroom Light off");
    }
}
