public class App {
    public static void main(String[] args) throws Exception {
        //Object = An entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type - that data is stored in the heap 
        //and accessed via a reference variable
        // Class - A blueprint for creating objects
        // It defines the attributes and methods that the objects created from 
        //the class will have


        //Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        Car SathyasCar = new Car();
        //You're effectively calling 1.Type 2. Variable Name 3. Constructor
        System.out.println(SathyasCar.isRunning);
        SathyasCar.start();
        System.out.println(SathyasCar.isRunning);
        SathyasCar.stop();
        System.out.println(SathyasCar.isRunning);



        
    }
}
