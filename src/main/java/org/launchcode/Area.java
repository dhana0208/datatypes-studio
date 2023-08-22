package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a radius:");
        String radius = sc.next();
        try {
            while (Double.parseDouble(radius) < 0) {
                System.out.println(radius + " is not a valid value");
                System.out.println("Enter a radius:");
                radius = sc.next();
            }
            Double area = Circle.getArea(Double.valueOf(radius));
            System.out.println("The area of a circle of radius  " + radius + " is : " + area);
        }catch (NumberFormatException e){
            System.out.println(radius +" entered is a string which is not a valid number");
            System.exit(1);
        }
    }
}
