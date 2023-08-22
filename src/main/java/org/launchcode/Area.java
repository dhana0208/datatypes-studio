package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a radius:");
        Double radius = sc.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius  "+ radius +" is : "+area);
    }
}
