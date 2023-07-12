package com.mycompany.hypotenusecalculation;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=aTFQx24WEEs&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=4
 * @author Farida Fatali
 */

/* 
Write a program that takes the lengths of its perpendicular sides and calculates the hypotenuse of the triangle 
(sides 3 and 4, hypotenuse 5). Write a formula that calculates the perimeter and area of a triangle.
 */
public class HypotenuseCalculation {

    public static void main(String[] args) {

        // 1st method    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side A: ");
        double a = sc.nextDouble();
        System.out.println("Enter side B: ");
        double b = sc.nextDouble();

        double sideA = Math.pow(a, 2.0);
        double sideB = Math.pow(b, 2.0);

        double c = Math.sqrt(sideA + sideB);
        System.out.println("Size of hypotenuse: " + (int) c);

//        OR
//        double sideC = sideA + sideB;
//        double c1 = Math.sqrt(sideC);   
//        System.out.println("Size of hypotenuse: " + c1);

        double perimeter = a + b + c;
        System.out.println("Perimeter of the triangle: " + (int) perimeter);

        double area = (a * b) / 2;
        System.out.println("Area of the triangle: " + (int) area);

        System.out.println();

        
        // 2nd method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st side: ");
        int aSide = scanner.nextInt();

        System.out.print("Enter the 2nd side: ");
        int bSide = scanner.nextInt();

        double cSide = Math.sqrt((aSide * aSide) + (bSide * bSide));
        System.out.println("Hypotenuse: " + (int) cSide);

        double param = aSide + bSide + cSide;
        System.out.println("Parameter of the triangle: " + (int) param);

        double halfParam = (aSide + bSide + cSide) / 2;
        double areaSqr = halfParam * (halfParam - aSide) * (halfParam - bSide) * (halfParam - cSide);
        double area1 = Math.sqrt(areaSqr);
        System.out.println("Area of the triangle: " + (int) area1);

       
    }
}
