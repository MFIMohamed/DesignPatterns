package commandPattern;

public class onCommand implements Command{

    Light Light;

    public onCommand(Light light){

        this.Light = light;
    }
    @Override
    public void execute() {
        this.Light.on();
    }
}
