package dev.lpa;

import javax.sound.midi.Track;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bird bird = new Bird();
        Animal animal = bird;

        // Because of this declaration, we can use Flight Enabled as the reference type, and assign it an instance of bird.
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
        bird.move();
        // These interfaces don't have move method.
//        flier.move();
//        tracked.move();

        System.out.println();
        flier.takeOff();
        bird.takeOff();
        flier.fly();
        bird.fly();


        tracked.track();

        System.out.println("-".repeat(20));
        inFlight(bird);
        System.out.println();
        System.out.println("-".repeat(20));
        System.out.println("-".repeat(20));
        inFlight(new Jet());

        // The Truck Class does not implement the FlightEnabled interface!!
//        inFlight(new Truck());

        Truck truck = new Truck();
        Trackable anotherTruck = new Truck();
        truck.track();
        anotherTruck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TIO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);


        // 基于接口编程和基于类编程
        // Try to use the interface type as the reference variable type when possible.
        // This will make the code more extensible in the future.
        // It supports new subtypes, and helps when refactoring code.


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);

        // Coding to a Class:
        triggerFliers(fliers);

        // Better practice:
        // Coding to an Interface: (The method take a List (Interface!) of FlightEnabled objects as an argument)
        flyFliers(fliers);

        // When we try to change the declaration type from Array List, the code can't run!
        LinkedList<FlightEnabled> newFliers = new LinkedList<>();
        newFliers.add(bird);

        // Coding to a Class:
//      triggerFliers(newFliers); // Compiler error!

        // Coding to an Interface:
        flyFliers(newFliers);



        List<FlightEnabled> anotherFlier = new LinkedList<>();
        List<FlightEnabled> anotherFlier2 = new ArrayList<>();
        flyFliers(anotherFlier);
        flyFliers(anotherFlier2);


        // There are many advantages of coding to an interface.
        // The downside though, is that alterations to the interface may wreak havoc (造成极大混乱，灾难）, on the client code.
        // Imagine that you have 50 classes using your interface, and you want to add an extra abstract method, to support new functionality
        // As soon as you add a new abstract method, all 50 classes won't compile.
        // Your code isn't backwards compatible (向后兼容), with the kind of change to an interface.
        // Interfaces haven't been easily extensible in the past. (JAVA 8 try to address it)
    }

    // Coding to a Class: ArrayList
    private static void triggerFliers(ArrayList<FlightEnabled> fliers){

    }
    // Coding to a Class: List (List is an interface)
    private static void flyFliers(List<FlightEnabled> fliers){

    }

    // As long as the object passed to the method inFlight implements the FlightEnabled interface, it can be passed as
    // a parameter to this method, regardless of the type it is declared as.
    private static void inFlight (FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        // Test the Object Class whether implements the Trackable interface.
        // If the Object is a class that implements the interface, a local variable 'tracked' is set up.
        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }


}