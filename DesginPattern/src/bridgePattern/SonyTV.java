package bridgePattern;

public class SonyTV implements TV {

    @Override
    public void on() {
        System.out.println("SonyTV switcjed on");
    }

    @Override
    public void off() {
        System.out.println("SonyTV switched off");
    }

    @Override
    public void tune(int channel) {
        System.out.println("Tv channel is tuned to " + channel);
    }
}
