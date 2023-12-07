# NumberGuessingGame

TO DO 
1. Add GUI 
2. Implement number of attempts
3. 
implementing the Math.random() method.
The Math.random() method in Java is a built-in function that returns a pseudorandom double greater than or equal to 0.0 and less than 1.0. It's a static method, so you can call it directly using the class name Math.

Here's a simple example of how to use it:

double rand = Math.random();
System.out.println("Random Number:" + rand);
This code will generate a random double between 0.0 (inclusive) and 1.0 (exclusive) each time it's run


If you want to generate a random number within a specific range, you can do so by multiplying the result of Math.random() with the size of the range and then adding the lower bound of the range. Here's an example of how to generate a random integer between 1 and 10:

int min = 1;
int max = 10;
int range = max - min + 1;
int rand = (int)(Math.random() * range) + min;
System.out.println(rand);

In this code, Math.random() generates a random double between 0.0 and 1.0. Multiplying this by range scales the range to between 0.0 and range. Adding min then shifts the range to between min and max# NumberGuessingGame
# NumberGuessingGame
