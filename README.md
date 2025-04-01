# Object-Oriented-Programming-CatTwo

## Question 1(a) Encapsulation
Write a Java class Student that:
- Has `private attributes` name and grade.\
  In the code, private attributes are set, meaning they are exclusive to the student class. A String for the name, and a double for the grade.
  ```
  private String name; // variable for the name
  private double grade; // variable for the grade
  ```
- Provides public getter and setter methods.\
  The setter methods are used for write operations i.e. assigning values to the variables, while the getter methods are used to read the assigned values.
  ```
  // Getter - name
    public String getName() {
        return name;
    }

    // Getter - grade
    public double getGrade() {
        return grade;
    }

    // Setter - name
    public void setName(String newName) {
        this.name = newName;
    }

    //Setter - grade
    public void setGrade(double newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        } else {
            this.grade = 0;
        }
    }
  ```
- Ensures grade is within 0 to 100, otherwise sets it to 0.\
  The setGrade method checks whether the value assigned to the grade is withing the range of 0 to 100, and if not the value is set to 0.
  ```
    //Setter - grade
    public void setGrade(double newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        } else {
            this.grade = 0;
        }
    }
  ```

Then in the main method, the Student object is created and the name and grade set and they are printed. If a value less than 0 or one greater than 0 is set then the value printed will be 0.0
```
public static void main(String[] args) {
        Student myObj = new Student(); // create object

        myObj.setName("Abdimalik Haroon"); // set student name
        myObj.setGrade(80.2); // set student grade

        // Print values
        System.out.println("Name: " + myObj.getName());
        System.out.println("Grade: " + myObj.getGrade());
}
```

## Question 1(b) Method Overloading and Overriding
Implement method overloading in a class MathOperations by defining two multiply()
methods:
- One method multiplies `two integers.`
  ```
  static int multiplication(int num1, int num2) {
        return num1 * num2;
  }
  ```
- Another method multiplies `three integers.`
  ```
  static int multiplication(int num1, int num2, int num3) {
        return num1 * num2 * num3;
  }
  ```
  To implement method overloading in this instance, the same method name `multiplication` is used, but each of the method has different number of parameters. The functions are of type `int` thus expecting a return type of int.\
  The methods are then called and printed in the main method. The results of the functions are stored in variables before printing.
  ```
  public static void main(String[] args) {
        int value1 = multiplication(2, 3);
        int value2 = multiplication(2, 3, 4);

        // Print the result of the operation
        System.out.println("Value of the first multiplication: " + value1);
        System.out.println("Value of the second multiplication: " + value2);
  }
  ```
Implement `method overriding` by:
- Creating a makeSound() method in an Animal class.\
  The parent class `Animal` is created with the `makeSound` function which prints a general statement that `Animals make different sounds.`
  ```
  class Animal {
    public void makeSound() {
        System.out.println("Animals make different sounds");
    }
  }
  ```
- Overriding it in two subclasses (Dog and Cat).\
  Two classes, `Dog` and `Cat`  both extend the parent class `Animal`, but each class implements the `makeSound()` method specific to the sound each animal makes.
  ```
   class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dogs bark");
    }
  }
  class Cat extends Animal {
      @Override
      public void makeSound() {
          System.out.println("Cats meow");
      }
  }
  ```
- Demonstrating polymorphism by calling makeSound() on both subclasses.\
  Polymorphism is then demonstrated by creating a Dog and Cat Object using the Animal parent class, then calling the makeSound function on each subclass.
  ```
  public class MethodOverriding {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create the Dog object
        Animal myCat = new Cat(); // Create the Cat object

        myDog.makeSound(); // Call the function from the dog subclass
        myCat.makeSound(); // Call the function from the cat subclass
    }
  }
  ```

  ## Question 2(a) Abstraction
  Write a `Java program` that:
  - Defines an `abstract class Appliance` with an abstract method turnOn().\
    An abstract class `Appliance` is created with an abstract method `turnOn()`. This means the body of the method should be empty.
    ```
    abstract class Appliance {
        public abstract void turnOn(); // Abstract method
    }
    ```
  - Implements `two subclasses Fan and TV` that define turnOn().\
    Two subclasses, `Fan` and `TV` are then created. They extend the `Appliance ` class and override the `turnOn()` method and print messages relevant to each appliance.
    ```
    // Subclass that inherits from Appliance
    class Fan extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("The fan has been turned on");
        }
    }
    
    // Subclass that also inherits from Appliance
    class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("The TV has been turned on");
        }
    }
    ```
  - Demonstrates abstraction by creating objects and calling turnOn().\
    In the main method, Fan and TV objects are created from the Appliance class and then the turnOn() function is called.
    ```
    public class Abstraction {
      public static void main(String[] args) {
          Appliance myFan = new Fan(); // Create fan object
          Appliance myTV = new TV(); // Create TV object
  
          myFan.turnOn(); // Call the function in the Fan class
          myTV.turnOn(); // Call the function in the TV class
      }
    }
    ```

  ## Question 2(b) Exception Handling
  Write a `Java program` that:
  - Accepts two numbers from the user and divides the first by the second.\
    The `Scanner` class is first imported to read the user input
    ```
    import java.util.Scanner; // Import the Scanner class
    ```
    Then in the main method, the user is prompted to enter the two numbers and the values are read and stored in variables.
    ```
    Scanner myObj = new Scanner(System.in); // Create the Scanner object

    System.out.print("Enter the dividend: ");
    int dividend = myObj.nextInt(); // Read user input for the dividend
    System.out.print("Enter the divisor: ");
    int divisor = myObj.nextInt(); // Read user input for the divisor
    ```
  - Catches and handles ArithmeticException if the second number is zero.\
    A try...catch block is implemented, the division being handled in the try section whereas the error is handled in in the catch block. The ArithmeticException is then printed to the user in the event the divisor is 0.
    ```
    try {
            int value = dividend / divisor;
            System.out.println("The value of the division is " + value); // Print the value of the operation
        }
        catch(ArithmeticException e) {
            System.out.println("Error: " + e); //Print the error message
            System.out.println("Cannot divide by zero"); // Print the meaningful message
        }
    ```
  - Displays a meaningful message: "Cannot divide by zero!".\
    The message is printed below the error in the catch block.
    
