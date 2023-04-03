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
public class YieldToMaturity {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the coupon value: ");
        double couponValue = input.nextDouble();
        
        System.out.print("Enter the bond's face value: ");
        double faceValue = input.nextDouble();
        
        System.out.print("Enter the Price value: ");
        double priceValue = input.nextDouble();
        
        System.out.print("Enter the years to maturity: ");
        double yearValue = input.nextDouble();
        
        double fp = (faceValue - priceValue) / yearValue;
        double p1 = couponValue + fp;
        double p2 = (faceValue + priceValue) / 2;
        double t= p1/p2;
       
        System.out.println("Your YTM is: "+t);
    }
    
}
