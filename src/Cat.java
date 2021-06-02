/**
 * 
 * Cat is a subclass of Animal.
 * 
 * @author 
 * 
 */
public class Cat extends Animal {

    /**
     * Cat() constructor sets its kind variable
     */
    public Cat() {
        kind = "cat";
    }

    /**
     * speak() implements the Animal speak() method. 
     *  When a cat speaks it says meow.
     */
    public String speak() {
        return "meow";
    }
}