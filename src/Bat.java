/**
 * Bat is a subclass of Animal and implements Trainable
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class Bat extends Animal implements Trainable {
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

    /**
     * doATrick() implements the Trainable doATrick() method. Bat can hang upside
     * down.
     */
    @Override
    public String doATrick() {
        return "I do tricks. I can hang upside down.";
    }
}
