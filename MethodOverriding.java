// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animals make different sounds");
    }
}

// The Dog subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dogs bark");
    }
}

// The Cat subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cats meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create the Dog object
        Cat myCat = new Cat(); // Create the Cat object

        myDog.makeSound(); // Call the function from the dog subclass
        myCat.makeSound(); // Call the function from the cat subclass
    }
}

