/**
 * Hyena is a subclass of Animal and implements Predator
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public class Hyena extends Animal implements Predator {
    /**
     * Hyena() constructor sets its kind variable
     */
    public Hyena() {
        kind = "hyena";
    }

    /**
     * speak() implements the Animal speak() method. When a hyena speaks it says
     * laugh.
     */
    @Override
    public String speak() {
        return "laugh";
    }

    /**
     * eat() implements the Animal eat() method. Hyena usually eats leftovers of
     * other predators.
     */
    @Override
    public String eat() {
        return "leftovers of other predators";
    }

    /**
     * preysOn() implements the Predator preysOn(). Hyena can prey on Cats and Bats.
     */
    @Override
    public boolean preysOn(Animal animal) {
        if (animal instanceof Cat)
            return true;

        else if (animal instanceof Bat)
            return true;

        else
            return false;
    }
}
