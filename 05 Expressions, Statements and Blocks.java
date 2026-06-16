double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
IO.println("d1 == 1 ? " + (d1 == 1.0));

//it prints false


// assignment statement
aValue = 8933.234;

// increment statement
aValue++;

// method invocation statement
IO.println("Hello World!");

// object creation statement
Bicycle myBike = new Bicycle();

class BlockDemo {
     public static void main(String[] args) {
          boolean condition = true;
          if (condition) { // begin block 1
               IO.println("Condition is true.");
          } // end block one
          else { // begin block 2
               IO.println("Condition is false.");
          } // end block 2
     }
}
