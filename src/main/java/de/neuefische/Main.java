package de.neuefische;

/*

Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.

Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.

Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.

Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.

Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.


BONUS
Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.
Write code in the main method to call the 'add' method and print the result.
Optional: Implement additional static methods in the 'Calculator' class
(subtraction, multiplication, division) and call them in the main method.
 */

public class Main {
    public static void main(String[] args) {

        // Step 4
        CounterClass counter1 = new CounterClass();
        CounterClass counter2 = new CounterClass();
        CounterClass counter3 = new CounterClass();
        CounterClass counter4 = new CounterClass();

        CounterClass.incrementTotalCount();
        counter1.incrementInstanceCount();

        CounterClass.incrementTotalCount();
        counter2.incrementInstanceCount();

        CounterClass.incrementTotalCount();
        counter3.incrementInstanceCount();

        CounterClass.incrementTotalCount();
        counter4.incrementInstanceCount();

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(counter4);

        System.out.println(Calculator.add(2,2));
        System.out.println(Calculator.subtract(2,3));
        System.out.println(Calculator.multiplicate(2,2));
        System.out.println(Calculator.divide(2.1,0.0));
        System.out.println(Calculator.divide(2.1,0.01));
    }
}