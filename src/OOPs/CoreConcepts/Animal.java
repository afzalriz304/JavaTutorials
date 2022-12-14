package OOPs.CoreConcepts;

public class Animal {
    private String name;
    private int age;

    // constructor overloading
    public Animal(String givenName, int givenAge) {
        this.name = givenName;
        this.age = givenAge;
    }

    // constructor overloading
    public Animal(String givenName) {
        this.name = givenName;
    }


    // constructor overloading
    public Animal(int givenAge) {
        this.age = givenAge;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
