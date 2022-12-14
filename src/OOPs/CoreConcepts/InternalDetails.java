package OOPs.CoreConcepts;

public class InternalDetails {

    public static void main(String[] args) {
        /**
         * Animal = class
         * rupesh = it's a reference variable which contains the hashcode of the object;
         * new = create an object in heap memory
         * Animal() = default constructor
         */
        Animal animal1 = new Animal("elephant", 120);
        Animal animal2 = new Animal("turtle", 200);
        Animal animal3 = new Animal("Lion");
        Animal animal4 = new Animal(2000);

        System.out.println(animal1.hashCode());
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}
