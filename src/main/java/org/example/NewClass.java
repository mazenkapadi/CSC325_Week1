package org.example;

public class NewClass {
    public static void main(String[] args) {

        //Instantiating 2 objects to test default and parametric constructors
        Course course1 = new Course();
        Course course2 = new Course(1, "Software Engineering", "CSC 325");

        //Intantiating an objects to test setters and getters explicitly
        Course course3 = new Course();

        //testing setter methods
        course3.setID(2);
        course3.setName("Software Engineering II");
        course3.setCode("CSC 326");

        //testing default constructor
        System.out.println(course1.toString());

        //testing parametric constructor
        System.out.println(course2.toString());

        //testing setters and getters
        System.out.println(course3.toString());

        //testing getName method
        System.out.println("Expected: Software Engineering II \nActual: " + course3.getName());
    }
}