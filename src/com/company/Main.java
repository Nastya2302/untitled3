package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        char c2;
        byte b;
        float f;
        int i = -500;
        Random random = new Random(1000000);
        int min=0; int max=1000000;
        f=(float)Math.random()*1000000;
        System.out.println("f="+f);
        i=(int)Math.round(f);
        System.out.println("i="+i);
        b=(byte)i;
        System.out.println("b="+b);
        double y;
        y= Math.pow(Math.sin(f),2)+2*Math.cbrt((b));
        System.out.println("y="+y);

    }
}