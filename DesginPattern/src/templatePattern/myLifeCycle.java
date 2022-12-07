package templatePattern;

public class myLifeCycle extends Template{

    @Override
    void start() {
        System.out.println("Starting start");
    }

    @Override
    void service() {
        System.out.println("Starting Service");
    }

    @Override
    void stop() {
        System.out.println("Starting stop");
    }
}
