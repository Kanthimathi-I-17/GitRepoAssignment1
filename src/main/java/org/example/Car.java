package org.example;

public class Car {
    //    attributes / data ::variables
    String name;
    String model;
    int year;
    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }
    //    behaviors / methods
    public void infoOfCar(){
//        int year = 0;
        System.out.println("name: "+name+", model: "+model+", year: "+year);
    }
    //dummy method
    public void dummyMethod(String Uname){
        System.out.println("hello "+Uname);
    }

}
