package commandPattern;

public class main {
    public static void main(String[] args) {

        remoteController remoteController = new remoteController();

        Light LivingRoom = new livingRoom();
        Command onCommandLivingRoom = new onCommand(LivingRoom);
        Command offCommandLivingRoom = new offCommand(LivingRoom);

        Light Bedroom = new bedRoom();

        Command onCommandBedRoom = new onCommand(Bedroom);
        Command offCommandBedRoom = new offCommand(Bedroom);


        remoteController.setCommand(onCommandLivingRoom,offCommandLivingRoom);
        remoteController.onButtonPushed();
        remoteController.offButtonPushed();

        remoteController.setCommand(onCommandBedRoom,offCommandBedRoom);
        remoteController.onButtonPushed();
        remoteController.offButtonPushed();

    }
}
