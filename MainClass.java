// MainClass.java
public class MainClass {

    // The main method - Entry point of the program
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Example of calling a method in the same class
        greetUser("John");
    }

    // A sample method in the main class
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the Java program.");
    }
}
