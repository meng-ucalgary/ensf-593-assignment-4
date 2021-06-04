/**
 * Cat is a subclass of Animal
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class Cat extends Animal {
    /**
     * Cat() constructor sets its kind variable
     */
    public Cat() {
        kind = "cat";
    }

    /**
     * speak() implements the Animal speak() method. When a cat speaks it says meow.
     */
    @Override
    public String speak() {
        return "meow";
    }

    /**
     * eat() implements the Animal eat() method. Cat eats mice.
     */
    @Override
    public String eat() {
        return "mice";
    }
}