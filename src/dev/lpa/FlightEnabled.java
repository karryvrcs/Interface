package dev.lpa;

class Satellitew implements OrbitEarth {

    @Override
    public void achieveOrbit() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

// An interface extends another interface (can't implement!)
interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
}

// An interface is usually named, according to the set of behaviors it describes.
// Many interfaces will end in 'able', like Comparable, Iterable,
// again meaning something is capable or can do, a given set of behaviors.

// Interfaces allow us to type our objects differently, by behavior only.
public interface FlightEnabled {

    // Always public, static and final field (CONSTANT!)
    // a final field means an object's field can't be reassigned or given a different value, after its initialization.
    // Static field is a class field.
    // Constants in JAVA, are usually named with all uppercase letters, and with underscores between words.
    // A static constant means we access it via the type name.
    // INTEGER.MAX_VALUE
    double MILES_TO_KM = 1.60934;

//    public static final double MILES_TO_KM = 1.60934;
    double KM_TIO_MILES = 0.621371;

//    public abstract void takeOff();
    void takeOff();
//    abstract void land();
    void land();
    void fly();

    // In fact, we don't have to declare the interface type abstract, because this modifier is implicitly declared.
    // Any method declared without a body, is really implicitly declared both [public and abstract].
    //接口中也允许定义静态方法和默认方法（Java 8 之后）

    // If we omit an access modifier on a class member, it's implicitly package private (Default access modifier).

    // If we omit an access modifier on an interface member, it's implicitly public.
    // We can't change the access modifier to protected in interface.
    // Only a concrete method can have private method.

}

