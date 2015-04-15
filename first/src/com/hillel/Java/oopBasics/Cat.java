package com.hillel.Java.oopBasics;
import java.util.Arrays;
/**
 * Created by Mfarsikov on 10.04.2015.
 */
public class Cat {

    static final int pawCount = 4;

    private String name;
    private int age;
    private String vaccines[] = new String[10];
    private int vaccineCount = 0;
    private String ownerName;

    public Cat(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }

    public String toString() {
        String result = "Cat ";
        result += name + " ";
        result += age + " years";
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(String vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() {
        return pawCount;
    }

    public static Cat createCat() {
        return new Cat("sdf", 1);
    }


    public static void main(String[] args) {
        Cat cat = new Cat("sdf", 1);

    }

    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}