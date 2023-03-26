package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("System");
        System.out.println("2023-03-24");
        System.out.println("2023-03-24");

        System.out.println("World");
        System.out.println("World");
        System.out.println("World");
        System.out.println("2023-03-24");
        System.out.println("World");
        System.out.println("World");
        System.out.println("World");
        System.out.println("2023-03-24");


        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("I am");
        Random random=new Random(47);
        float[] f=new float[10];
        for (int i=0;i<10;i++){
            f[i]=random.nextFloat();

        }


        for (float x:f){
            System.out.println(x);
        }



        System.out.println("I am");

    }
}
