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
```
// javac means java-complier
// for compile use javac MyFirst.java
// It will create a file called First.class
// NOTE: MyFirst.class will contain C file "bit code"
//  then use Java MyFirst it will run the file

// As we know JVM is interpertor it will convert bitcode into  machine code and it will execute a programme

// "public" : So that it can be accessable from this class to JVM when it call main()
// "Static" : we cannot use class unless we created a object 
//            if we want to create any thing without using a object in class that can be achieve by declaring "static"
```


<br/>
<br/>
<br/>
<br/>

# Coding

print hello world if number is divisible by both
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

Linked List palindrome

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

