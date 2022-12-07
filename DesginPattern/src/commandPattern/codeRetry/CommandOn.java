package commandPattern.codeRetry;

public class CommandOn implements Command {

    Light light;

    public CommandOn( Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
