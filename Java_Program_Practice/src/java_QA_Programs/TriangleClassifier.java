package java_QA_Programs;

public class TriangleClassifier { 
    public static void main(String[] args) { 
        int side1 = 5; // Replace with the lengths of your triangle's 
        int side2 = 4; 
        int side3 = 4; 
 
        if (side1 == side2 && side2 == side3) { 
            System.out.println("Equilateral triangle"); 
        } else if (side1 == side2 || side1 == side3 || side2 == side3) { 
            System.out.println("Isosceles triangle"); 
        } else { 
            System.out.println("Scalene triangle"); 
        } 
    } 
} 
