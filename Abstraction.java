// Abstract class
abstract class Appliance {
    public abstract void turnOn(); // Abstract method
}

// Subclass that extends from Appliance
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("The fan has been turned on");
    }
}

// Subclass that also extends from Appliance
class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("The TV has been turned on");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Appliance myFan = new Fan(); // Create fan object
        Appliance myTV = new TV(); // Create TV object

        myFan.turnOn(); // Call the function in the Fan class
        myTV.turnOn(); // Call the function in the TV class
    }
}
