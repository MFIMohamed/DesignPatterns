package commandPattern.codeRetry;

public class remoteController {
    Command[] onCommands;
    Command[] offCommands;

    public remoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i = 0; i < 7; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }
    }

        public void setCommand(int slot, Command onCommand, Command offCommand){
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
        public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
        public void offButtonWasPushed(int slot){
        onCommands[slot].execute();
        }

}
