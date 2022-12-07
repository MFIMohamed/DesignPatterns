package commandPattern.codeRetry;

public class main {
    remoteController remoteController = new remoteController();

    Light LRL = new Light("Living Room");
    Light BRL = new Light("Bedroom Light");

    CommandOn OLRL = new CommandOn(LRL);
    CommandOff OFLRL = new CommandOff(LRL);

    CommandOn OBRL = new CommandOn(BRL);
    CommandOff OFBRL = new CommandOff(BRL);

  //  remoteController.setCommand(0, OBRL, OFBRL);
  //  remoteController.setCommand(0, OLRL, OFLRL);
}
