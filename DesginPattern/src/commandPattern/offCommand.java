package commandPattern;

public class offCommand implements Command{
    Light Light;

    public offCommand(Light Light){
        this.Light = Light;
    }

    public void execute() {
        this.Light.off();
    }
}
