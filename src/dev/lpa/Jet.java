package dev.lpa;
// There are many things that can fly but not animals.
// Jet (喷气式飞机) is not animal which different from bird, but it can fly and be tracked like bird.
// So Jet implements the same interface below.
public class Jet implements FlightEnabled, Trackable {
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
