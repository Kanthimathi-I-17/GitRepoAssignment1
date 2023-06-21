package org.example;

public class RecursionClass {
    public int facto(int number){
        if (number==0){
            return 1;
        } else {
            return number * facto(number - 1);
        }
    }
}
