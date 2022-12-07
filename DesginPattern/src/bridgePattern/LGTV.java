package bridgePattern;

public class LGTV implements TV {
    @Override
    public void on() {
        System.out.println("LGTV is switched ON");
    }

    @Override
    public void off() {
        System.out.println("LGTV is switched OFF");
    }

    @Override
    public void tune(int channel) {
        System.out.println("Switched to chanel " + channel);
    }
}
