
class Light {
    boolean lightState = false;
    String lightName;

    public Light(String lightName){
        this.lightName = lightName;
    }


    public void turnOn(){
        this.lightState = true;
    }

    public void turnOff(){
        this.lightState = false;
    }

    public boolean isRed(){
        if (this.lightName == "red"){
            return true;
        }
        return false;
    }

    public boolean isGreen(){
        if (this.lightName == "green"){
            return true;
        }
        return false;
    }

    public boolean isYellow(){
        if ("yellow".equals(this.lightName)){
            return true;
        }
        return false;
    }

    public boolean showState(){
        return this.lightState;
    }


    public void status(){
        System.out.println("A light is "+ this.showState());
    }    

}

/*class redLight extends Light{ 


    @Override
    public void status(){
        if (showState()){
        System.out.println("A red light on");}
        else{System.out.println("A red light off");}

    }
}

class yellowLight extends Light{


    @Override
    public void status(){
        if (showState()){
        System.out.println("A yellow light on");}
        else{System.out.println("A yellow light off");}

    }
}

class greenLight extends Light{


    @Override
    public void status(){
        if (showState()){
        System.out.println("A green light on");}
        else{System.out.println("A green light off");}

    }
}*/





