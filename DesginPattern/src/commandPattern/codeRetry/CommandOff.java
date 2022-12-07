package commandPattern.codeRetry;

public class CommandOff implements Command {

    Light light;

    public CommandOff(Light light){
        this.light = light;
    }
    public void execute(){
        light.off();
    }
}
