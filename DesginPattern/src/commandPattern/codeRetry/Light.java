package commandPattern.codeRetry;

public class Light {
    private String Location;

    public Light(String Location){
        this.Location = Location;
    }
    public void on (){
        System.out.println(Location + " is on");
    }
    public void off(){
        System.out.println(Location + " is off");
    }
}
