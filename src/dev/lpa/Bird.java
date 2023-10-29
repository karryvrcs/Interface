package dev.lpa;

// A class is associated to an interface, by using the implements clause in the class declaration.
// The class bird implements the FlightEnabled interface.

// A class can only inherit a class but can extend one or more interfaces.
// We can describe Bird by what it is, and what it does.
public class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void move(){
        System.out.println("Bird flies");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is tracked");
    }
}
