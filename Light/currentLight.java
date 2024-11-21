

public class currentLight {
    private Light redLight, greenLight, yellowLight,currentlight;

    public currentLight(){
        this.redLight = new Light("red");
        this.greenLight = new Light("green");
        this.yellowLight = new Light("yellow");
        this.currentlight = this.redLight;
    }

    public void switchLight(){
        this.currentlight = this.greenLight;
        
    }    
}
