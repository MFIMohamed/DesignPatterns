package commandPattern;

public class remoteController {

    Command onCommand;
    Command offCommand;

    void setCommand(Command onCommand, Command offCommand){
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    void onButtonPushed(){
        onCommand.execute();
    }
    void offButtonPushed(){
        offCommand.execute();
    }
}
