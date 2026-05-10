public class Car {
    //behaves as a blueprint for creating objects
    //The below are attributes, things that a car has
    String make = "Honda";
    String model = "Civic";
    int year = 2012;
    double price = 8999.99;
    boolean isRunning = false;

    void start(){
        System.out.println("You started the engine");
        isRunning = true;
    }
    void stop(){
        System.out.println("You stopped the engine.");
        isRunning = false;
    }
}
