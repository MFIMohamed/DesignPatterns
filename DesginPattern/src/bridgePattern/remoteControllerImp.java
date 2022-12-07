package bridgePattern;

public class remoteControllerImp implements remoteController{

    TV tv;

    public remoteControllerImp(TV tv){
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void tune(int channel) {
        tv.tune(channel);
    }
}
