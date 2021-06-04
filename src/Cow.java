/**
 * Cow is a subclass of Animal.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class Cow extends Animal {
    /**
     * Cow() constructor sets its kind variable
     */
    public Cow() {
        kind = "cow";
    }

    /**
     * speak() implements the Animal speak() method. When a cow speaks it says moo.
     */
    @Override
    public String speak() {
        return "moo";
    }

    /**
     * eat() implements the Animal eat() method. Cow eats hay.
     */
    @Override
    public String eat() {
        return "hay";
    }
}