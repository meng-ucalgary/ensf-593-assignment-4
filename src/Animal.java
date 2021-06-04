/**
 * Animal is an abstract class. It's speak() and eat() method is abstract and
 * meant to be implemented in Animal subclasses, such as Dog, Cat.
 *
 * @author Bhavyai Gupta
 * @version 1.0
 * @since June 4, 2021
 */
public abstract class Animal {
    protected String kind; // Cow, pig, cat, etc.

    /**
     * Animal() default constructor
     */
    public Animal() {
    }

    /**
     * toString() method overrides the Object toString() method.
     */
    public String toString() {
        return String.format("%nI am a %s and I go %s.%nI eat %s", kind, speak(), eat());
    }

    /**
     * speak() returns an appropriate String representing the way a certain kind of
     * animal speaks. It is implemented in the Animal subclasses.
     *
     * @return String representing how the animal speaks
     */
    public abstract String speak(); // Abstract method

    /**
     * eat() returns an appropriate String representing the general diet of the
     * animal. It is implemented in the Animal subclasses.
     *
     * @return String representing the general diet of the animal
     */
    public abstract String eat();

    /**
     * main() creates instances of Animal subclasses and invokes their speak()
     * methods, their eat() method.
     */
    public static void main(String[] args) {
        Animal animal = new Cow();
        System.out.println(animal.toString());

        animal = new Cat();
        System.out.println(animal.toString());

        animal = new Bat();
        System.out.println(animal.toString());
    }
}
