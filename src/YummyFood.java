
// New class to demonstrate methods
public class YummyFood {
    // main method
    public static void main(String [] args){
        System.out.println("Hello World");
        System.out.println("Goodbye");
        chocolate();
        iceCream();
        System.out.println("done");
    }
    // chocolate method
    public static void chocolate(){
        System.out.println("Chocolate");
    }

    //French Fries method
    public static void frenchFries(){
        System.out.println("french fries with ketchup");
        chocolate();
        System.out.println("that was yummy");
    }

    // iceCream method calls frenchFries which then calls chocolate
    public static void iceCream(){
        System.out.println("ice");
        frenchFries();
        System.out.println("cream");
    }
}
