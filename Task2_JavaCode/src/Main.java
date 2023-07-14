package Task2_JavaCode.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height, width, areaOfRectangle;

        // calculate the area of a rectangle
        System.out.print("Enter height and width: ");
        height = input.nextInt();
        width = input.nextInt();
        areaOfRectangle = height*width;

        System.out.println("The Area of Rectangle is: "+areaOfRectangle);

        // Creating objects of Person
        Person raj = new Person("Raj", 22, 5.2);
        System.out.println("Persons Name: "+raj.getName()+" Persons Age: "+raj.getAge()+" Persons Height: "+raj.getHeight());

        //creating object of a Student
        Student nowrin = new Student("Nowrin", 21, 5.4, 11, "1st");
        System.out.println(nowrin.getName()+" is a Student of Metropolitan University. She is in Software Engineering Department, at "+nowrin.getBatch()+" batch. Her ID is: "+nowrin.getId()+". Her age is: "+nowrin.getAge());
    }

}

class Person {
    private String name;
    private int age;
    private double height;

    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

}

class Student extends Person {

    public int id;
    public String batch;

    Student(String name, int age, double height, int id, String batch) {
        super(name, age, height);
        this.id = id;
        this.batch = batch;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public String getBatch(){
        return batch;
    }
}