1. Introduction (Packages in Java)

A package in Java is a group of related classes and interfaces.

Think of it like a folder in your computer that stores related files.

Why Packages Are Used

Organize large programs 📂

Avoid class name conflicts

Improve code reuse

Provide access protection

Example packages in Java:

java.lang

java.util

java.io

java.awt

Example program with a package:

package mypackage;

public class Test {
    public static void main(String[] args){
        System.out.println("Hello from package");
    }
}

Here mypackage is the folder containing the class.

2. Importing Packages and Classes

To use classes from another package, we use the import keyword.

Syntax
import package_name.class_name;

or

import package_name.*;
Example: Importing a Class
import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
        System.out.println(x);
    }
}

Here:

java.util → package

Scanner → class

Example: Importing Entire Package
import java.util.*;

class Test{
    public static void main(String[] args){
        System.out.println("Package imported");
    }
}

* means all classes in the package.

3. PATH in Java

PATH is an environment variable that tells the system where the Java compiler and tools are located.

It helps the computer find commands like:

javac
java

These commands belong to the Java Development Kit (JDK).

Example:

C:\Program Files\Java\jdk\bin

This folder contains:

javac.exe

java.exe

Without setting PATH, the terminal may show:

javac is not recognized as an internal or external command
4. CLASSPATH in Java

CLASSPATH tells Java where to find compiled classes (.class files).

When Java runs a program, it searches for classes in the classpath.

Example
CLASSPATH = C:\myprograms

Java will look inside C:\myprograms for .class files.

5. Difference Between PATH and CLASSPATH
Feature	PATH	CLASSPATH
Purpose	Finds Java tools	Finds Java classes
Used for	Running javac, java	Loading .class files
Contains	JDK bin folder	Program folders or libraries
Example	C:\Java\jdk\bin	C:\myproject
6. Simple Diagram
Java Program
     |
     | compile
     v
 javac  → uses PATH
     |
     v
 .class file
     |
     | run
     v
 java → uses CLASSPATH

✅ Quick Exam Summary

Package → group of related classes

Import → use classes from other packages

PATH → location of Java compiler (javac)

CLASSPATH → location of compiled classes



1. Types of Access Specifiers in Java

There are 4 access specifiers:

1️⃣ public
2️⃣ private
3️⃣ protected
4️⃣ default (no keyword)

2. Public Access Specifier

public members can be accessed from anywhere (inside or outside the package).

Example
class Test{
    public int a = 10;

    public void show(){
        System.out.println(a);
    }
}

Another class can access it easily.

class Demo{
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.a);
        t.show();
    }
}

✔ Accessible everywhere

3. Private Access Specifier

private members can be accessed only within the same class.

Example
class Test{
    private int a = 10;

    void show(){
        System.out.println(a);
    }
}

This will cause an error:

class Demo{
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.a); // ERROR
    }
}

✔ Accessible only inside the class

4. Protected Access Specifier

protected members are accessible:

Inside the same package

In subclasses (child classes) even in different packages

Example
class Parent{
    protected int a = 20;
}

class Child extends Parent{
    void show(){
        System.out.println(a);
    }
}

✔ Accessible in inheritance

5. Default Access Specifier

If no access modifier is written, it becomes default.

It is accessible only inside the same package.

Example:

class Test{
    int a = 15;   // default access
}

✔ Accessible within the same package only