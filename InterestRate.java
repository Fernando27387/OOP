/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labproject1;

/**
 *
 * @author ferna
 */
import java.util.Scanner;

public class InterestRate {
    
     public static void main(String args []) {
         Scanner loan = new Scanner(System.in);
        
        System.out.print("Enter the amount of the loan: ");
        int l = loan.nextInt();
        
        System.out.println("Enter the interest rate: ");
        double i = loan.nextDouble();
        double ip= i /100;
        
        System.out.println("Term of the loan: ");
        int y = loan.nextInt();
        
        double SI = l * ip * y;
        double CP1 = 1+ip;
        double CPE = Math.pow(CP1, y);
        double CP2 = CPE * l;
        double CPF = CP2 - l;
        
        
        System.out.println("Your Simple INterest is: " +SI);
        System.out.println("Your Compound interest is: " +CPF);
        
     }

}
