# Theory

## 1. Access modifiers
>There are four types of Java access modifiers:
><p><b>Private:</b> The access level of a private modifier is only within the class. It cannot be accessed from outside the class.</p>
><p><b>Default:</b> The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.</p>
><p><b>Protected:</b> The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.</p>
><p><b>Public:</b> The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.</p>

<br/>
<br/>
<br/>

## 2. Difference between Constructor and Destructor
<img src="https://imgur.com/McpNRUB.png" alt="Difference between Constructor and Destructor" />

## Depend upon the language there are 3 type of Constructor are there 
>Default Constructor ( Also know as non-parametrized Constructor )<br/>
>Parametrized Constructor<br/>
>Copy Constructor

<br/>
<br/>
<br/>

## 3. overriding and overloading
## Comparing 
<img src="https://imgur.com/fctrug4.png" alt="Difference between Constructor and Destructor" />

<br/>

## Difference between method overloading and method overriding in java
<img src="https://imgur.com/D5J3Pek.png" alt="Difference between Constructor and Destructor" />

<br/>

## Overloading
><p>Overloading refers to the ability to define multiple methods or functions with the same name but with different parameters. This allows the same name to be used to perform different operations based on the arguments passed to it.</p>
><p>Overloading can be done with methods in classes or with functions in a module. When a method or function is overloaded, the compiler or interpreter is able to determine which version of the method or function to call based on the number, type, and order of the arguments passed to it.</p>
><p>For example, a class might have multiple constructors with the same name but different arguments. When an object is created using the class, the constructor with the appropriate arguments is called based on what is passed.</p>
><p>Overloading is a powerful feature of object-oriented programming that allows developers to write code that is more expressive, easier to read and understand, and more flexible.</p>

<br/>

## Overriding
><p>Overriding is a feature that allows a subclass to provide its own implementation of a method that is already defined in its superclass. When a subclass overrides a method, it provides a new implementation of the method that replaces the implementation inherited from the superclass.</p>
><p>Method overriding is used to provide a specialized implementation of a method in a subclass. This allows the subclass to customize the behavior of the method without modifying the superclass. By providing a new implementation of the method, the subclass can change the behavior of the method to better suit its needs.</p>
><p>To override a method in a subclass, the method in the subclass must have the same name, return type, and parameter list as the method in the superclass. The access modifier of the method in the subclass can be the same or more accessible than the access modifier of the method in the superclass. The method in the subclass must also be marked with the @Override annotation to indicate that it is intended to override a method in the superclass.</p>
><p>When a method is invoked on an object of the subclass, the JVM checks if the subclass has overridden the method. If the method is overridden, the JVM invokes the implementation of the method in the subclass. If the method is not overridden, the JVM invokes the implementation of the method in the superclass.</p>

<br/>
<br/>
<br/>

## 4. Getter & setter

| [GeeksforGeeks](https://www.geeksforgeeks.org/getter-and-setter-in-java/) | [W3Schools](https://www.w3schools.com/java/java_encapsulation.asp) | [Scaler](https://www.scaler.com/topics/getter-and-setter-in-java/) | 

><p>Getter and Setter are methods used to protect your data and make your code more secure. Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc. For the program’s convenience, getter starts with the word “get” followed by the variable name.</p>
><p>While Setter sets or updates the value (mutators). It sets the value for any variable used in a class’s programs. and starts with the word “set” followed by the variable name. Getter and Setter make the programmer convenient in setting and getting the value for a particular data type. In both getter and setter, the first letter of the variable should be capital.</p>

## Here's an example that shows how to use getters and setters:

```java
class Person {
  private String name;

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}
```

><p>In this example, we have a `Person` class with a private data member `name`. We have a `getName` method that returns the value of `name` and a `setName` method that sets the value of `name`. In the `main` method, we create an object of the `Person` class and use the `setName` method to set the value of `name` to `"John"`. Then we use the `getName` method to retrieve and print the value of `name`.</p>


<br/>
<br/>
<br/>

## 5. public static void main(String[] args)
><p>In Java, the main method is the entry point of a Java program, and it is the first method that gets executed when you run a Java program.</p>
><p>The main method has a specific signature that must be followed exactly for the program to run correctly. It takes an array of String objects as an argument, which can be used to pass command-line arguments to the program.</p>


><p><b>public</b> - The access modifier that makes the method accessible from outside the class.</p>
><p><b>static</b> - The keyword that allows the method to be called without creating an instance of the class.</p>
><p><b>void</b> - The return type of the method, which means it does not return a value.</p>
><p><b>main</b> - The name of the method. This name is reserved in Java and must be used for the entry point of the program.</p>
><p><b>String[] args</b> - The parameter of the method, which is an array of String objects. The parameter name args is a convention but can be changed.</p>

><p>The main method is required in every Java program, and it is typically where the program starts and ends. It contains the code that defines what the program does and how it operates.</p>

>// javac means java-complier <br/>
>// for compile use javac MyFirst.java<br/>
>// It will create a file called First.class<br/>
>// NOTE: MyFirst.class will contain C file "bit code"<br/>
>//  then use Java MyFirst it will run the file<br/>
>// As we know JVM is interpertor it will convert bitcode into  machine code and it will execute a programme<br/>
>// "public" : So that it can be accessable from this class to JVM when it call main()<br/>
>// "Static" : we cannot use class unless we created a object <br/>
>//            if we want to create any thing without using a object in class that can be achieve by declaring "static"<br/>


## 6. Difference between java 17 and 18
> Java 18 has improvements in terms of its foreign function memory.<br/>
> What is foreign function memory.<br/>
> The Foreign Function and Memory (FFM) API enables Java programs to interoperate with code and data outside the Java runtime. This API enables Java programs to call native libraries and process native data without the brittleness and danger of Java Native Interface.

## 7. 
> Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data, in the form of attributes, and code, in the form of methods. There are four pillars of OOP that are essential to understand when developing software using this paradigm. These pillars are:

> <b>Encapsulation</b> : Encapsulation is the process of hiding the implementation details of an object from the outside world, and only exposing a public interface that can be used to interact with the object. This helps to maintain the integrity of the object's data and methods, and prevents unauthorized access or modification. 

> Real-life example of encapsulation : A vehicle consists of many complex systems and components, such as the engine, transmission, brakes, and suspension. However, from the driver's perspective, all of these systems are hidden, and they only interact with the vehicle through a simple interface, such as a steering wheel, pedals, and dashboard controls. The vehicle may also use encapsulation to protect the driver and passengers by providing safety features like airbags and seat belts.
```java 
// Encapsulation example
public class Car {
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Suspension suspension;
    private Airbags airbags;
    private SeatBelts seatBelts;
    
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    // other methods that interact with the hidden components
}
```

> <b>Abstraction</b> : Abstraction is the process of simplifying complex systems by breaking them down into smaller, more manageable components. In OOP, abstraction is achieved through the use of abstract classes and interfaces, which provide a common set of methods and properties that can be used to interact with a group of related objects. 

> Real-life example of abstraction :  A vehicle may offer a variety of features and capabilities, such as GPS navigation, entertainment systems, and automatic parking. However, from the driver's perspective, all of these features are presented as a simple set of options that can be accessed through the vehicle's dashboard or touchscreen interface. The vehicle may also use abstraction to simplify the design process by breaking down complex systems into smaller, more manageable components.
```java
// Abstraction example
public interface CarInterface {
    void turnOnAC();
    void playMusic(String song);
    void navigateToDestination(String destination);
    void parkAutomatically();
}

public class Car implements CarInterface {
    @Override
    public void turnOnAC() {
        // implementation of turning on the AC
    }

    @Override
    public void playMusic(String song) {
        // implementation of playing music
    }

    @Override
    public void navigateToDestination(String destination) {
        // implementation of navigation to a destination
    }

    @Override
    public void parkAutomatically() {
        // implementation of automatic parking
    }
}
```

> <b>Inheritance</b> : Inheritance is the process of creating new classes that inherit properties and methods from existing classes. This allows for code reuse, and helps to simplify the development process by reducing the amount of code that needs to be written. 

> Real-life example of inheritance:  A vehicle may come in different models, such as sedan, SUV, or truck, which offer different features and capabilities. These models may inherit properties and methods from a common vehicle class, reducing the amount of code that needs to be written.
>
```java
public class Vehicle {
    // common properties and methods for all vehicles
}

public class Car extends Vehicle {
    // properties and methods specific to cars
}

public class Truck extends Vehicle {
    // properties and methods specific to trucks
}

```

> <b>Polymorphism</b> : Polymorphism is the ability of objects to take on different forms, depending on the context in which they are used. This allows for more flexible and modular code, as objects can be easily swapped in and out without affecting the rest of the system. 

> Real-life example of polymorphism : A vehicle may be driven in different ways, such as on the highway, in the city, or off-road. The vehicle may use polymorphism to ensure that it can handle different driving conditions and situations, without requiring the driver to make any additional adjustments or changes to the vehicle.
```java
public class Vehicle {
    public void drive() {
        // general driving code that can be used by any vehicle
    }
}

public class Car extends Vehicle {
    @Override
    public void drive() {
        // specific driving code for cars
    }
}

public class Truck extends Vehicle {
    @Override
    public void drive() {
        // specific driving code for trucks
    }
}

```



## 7. Diffrence between SQL and NoSQL
> SQL and NoSQL are two different types of database management systems (DBMS) that differ in their data storage models, structure, query languages, and scalability.

> SQL (Structured Query Language) databases are based on a relational model, which means that data is stored in tables with pre-defined schemas, and relations between tables are defined by foreign keys. SQL databases typically use SQL as the query language to perform operations like insert, update, delete, and select on the data stored in the tables.

> NoSQL (Not Only SQL) databases, on the other hand, do not rely on a fixed schema or tables with predefined relationships. Instead, NoSQL databases use various data models like key-value, document-based, column-family, or graph-based to store data. NoSQL databases typically use their own query languages or APIs to manipulate the data stored in them.

> Here are some of the main differences between SQL and NoSQL databases:<br/>
> <p><b>Data model:</b> SQL databases are based on the relational data model, while NoSQL databases can use various models like key-value, document-based, column-family, or graph-based.</p>
> <p><b>Schema:</b> SQL databases have a predefined schema with fixed data types for each column, while NoSQL databases do not have a predefined schema and can store any type of data in a flexible format.</p>
> <p><b>Scalability:</b> SQL databases are typically vertically scalable, meaning that they require more powerful hardware to handle increasing amounts of data, while NoSQL databases are horizontally scalable, meaning that they can handle increasing amounts of data by adding more nodes to the database cluster.</p>
> <p><b>Query language:</b> SQL databases use SQL as the query language, while NoSQL databases use their own query languages or APIs to manipulate the data stored in them.</p>
> <p><b>ACID compliance:</b> SQL databases are usually ACID (Atomicity, Consistency, Isolation, and Durability) compliant, meaning that transactions are executed in a reliable and predictable manner, while NoSQL databases may not provide full ACID compliance, but offer higher scalability and performance.</p>

> In general, SQL databases are well-suited for applications with a structured data model and high consistency requirements, while NoSQL databases are better suited for applications with unstructured or semi-structured data that require high scalability and performance.
<img src="https://imgur.com/So5itds.png" alt="sql">




<br/>
<br/>
<br/>

# Coding

## 1. print hello world if number is divisible by both
```java
import java.util.Scanner;

public class print {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = myObj.nextInt();

        if(num%3==0){
            System.out.print("Hello ");
        }
        if(num%5==0){
            System.out.print("World");
        }
    }
}

// NOTE: Do no put else or else if in the above code 
```

## 2.Linked List palindrome

```java
public class palindrome {
    private Node head;

    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        String value = "asdfghjkXkjhgfdsa";
        for (int i = 0; i < value.length(); i++) {
            list.push(value.charAt(i));
        }
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome");
        } else {
            System.out.println("The linked list is not a palindrome");
        }
    }
}

```


## 3. Binary Search
>Here's how the binary search algorithm works:
>First, the middle element of the array is selected as the starting point.
>If the middle element is equal to the target element, the search is successful and the index of the element is returned.
>If the middle element is greater than the target element, the search is narrowed to the left half of the array.
>If the middle element is less than the target element, the search is narrowed to the right half of the array.
>The search interval is then divided in half and the process is repeated until the target element is found or the search interval is empty.

```java
public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return -1;
}

```


# 4. pattern printing
         *
     *   *   *
*    *   *   *   *
```java
public static void printPattern() {
    int n = 3;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            System.out.print("  ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
            if (j < i) {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}
```

## 5.  First 20 even numbers and add them up
```java
public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    int i = 1;
    while (count < 20) {
        if (i % 2 == 0) {
            sum += i;
            count++;
        }
        i++;
    }
    System.out.println("Sum of the first 20 even numbers is " + sum);
}

```

## 6. check for prime and find next Prime 
```java
import java.util.Scanner;
public class NextNumberisPrime {
   public static int isPrime(int num){
      int prime = 1;
      for(int i = 2; i < num; i++) {
         if((num % i) == 0) {
            prime = 0;
         }
      }
      return num;
   }
   public static int nextPrime(int num) {
      num++;
      for (int i = 2; i < num; i++) {
         if(num%i == 0) {
            num++;
            i=2;
         } else {
            continue;
         }
      }
      return num;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      int num = sc.nextInt();
      int result = 0;
      int prime = isPrime(num);
      if (prime == 1) {
         System.out.println(num+" is a prime number");
      } else {
         System.out.println(num+" is not a prime number");
      }
      System.out.println("Next prime number is: "+nextPrime(num));
   }
}
``` 

```
output
Enter a number ::
25
25 is not a prime number
Next prime number is: 29
```



## 7. Fibonacci using Recursion
```java
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        else if (num == 1 || num == 2) {
            return 1;
        }
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}

```

## 8. Is Palindrome
```java
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        }
        else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return original == reversed;
    }
}

```

## 9. frequency of number in given array
```java
import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            }
            else {
                frequencyMap.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(number + " appears " + frequency + " times.");
        }
    }
}

```

## 10. String Palindrome
```java
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        }
        else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

## 11. Anagram
```java
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String str1 = "Race";
    String str2 = "Care";
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}
```

## 12. Reverse Array

> In this implementation, we use two pointers to swap elements from the beginning and end of the array, until they meet in the middle. This has a time complexity of O(n/2), which simplifies to O(n), where n is the length of the array.

```java
public class ReverseArrayExample {
    
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
```

> In this code, we define a reverseArray function that takes an integer array as an argument and reverses it using the method described in my previous answer. We also define a main function that creates an example array, calls reverseArray to reverse it, and then prints the original and reversed arrays using the Arrays.toString method. When you run this program, you should see output similar to the following:

> Original array: [1, 2, 3, 4, 5]
> Reversed array: [5, 4, 3, 2, 1]

## 13. Longest Palindromic Substring
```java
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        String longestPalindrome = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandPalindrome(s, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            
            // Check for even-length palindromes
            String evenPalindrome = expandPalindrome(s, i, i+1);
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        
        return longestPalindrome;
    }
    
    private static String expandPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left+1, right);
    }
    
    public static void main(String[] args) {
        String s = "babad";
        String longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome); // Output: "bab" or "aba"
    }
}

```