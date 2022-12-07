package bridgePattern;

public class main {
    public static void main(String[] args) {
        TV lgtv = new LGTV();
        TV sonytv = new SonyTV();

        new remoteControllerImp(lgtv).on();
        new remoteControllerImp(lgtv).off();
        new remoteControllerImp(lgtv).tune(20);

        new remoteControllerImp(sonytv).on();
        new remoteControllerImp(sonytv).off();
        new remoteControllerImp(sonytv).tune(1);

    }
}
