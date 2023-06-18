public class StaticDemo {
    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed.");
        count++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Accessing static variables and methods
        System.out.println("Accessing static variables and methods:");
        System.out.println("Count: " + count);
        displayCount();

        // Creating objects to access instance variables and methods
        System.out.println("\nAccessing instance variables and methods:");
        StaticDemo obj1 = new StaticDemo();
        obj1.incrementCount();
        StaticDemo obj2 = new StaticDemo();
        obj2.incrementCount();
    }

    // Instance method
    void incrementCount() {
        count++;
        System.out.println("Count incremented. New count: " + count);
    }
}