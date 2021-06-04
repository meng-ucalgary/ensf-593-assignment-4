/**
 * Bat is a subclass of Animal
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class Bat extends Animal {
    /**
     * Bat() constructor sets its kind variable
     */
    public Bat() {
        kind = "bat";
    }

    /**
     * speak() implements the Animal speak() method. When a bat speaks it says
     * screech.
     */
    @Override
    public String speak() {
        return "screech";
    }

    /**
     * eat() implements the Animal eat() method. Bat eats flying insects.
     */
    @Override
    public String eat() {
        return "flying insects";
    }
}
