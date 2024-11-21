//Vehicle.java
class Vehicle {

    public void showType(){
        System.out.println("this is a Vehicle");

    }
    
}

class Car extends Vehicle {

    @Override
    public void showType(){
        System.out.println("this is a Car");

    }
}

class Motocycle extends Vehicle {
    
    @Override
    public void showType(){
        System.out.println("this is a Motocycle");

    }
}

class Truck extends Vehicle {
    
    @Override
    public void showType(){
        System.out.println("this is a Truck");

    }
}