package com.RestAssured;

public class Chaining {
    public static void main(String[] args){
        Chaining objChaining = new Chaining();
        objChaining.a1();
        objChaining.a2();
        objChaining.a3();
    }

    public void a1(){
        System.out.println("Method - a1");
    }

    public void a2(){
        System.out.println("Method - a2");
    }

    public void a3(){
        System.out.println("Method - a3");
    }
}
