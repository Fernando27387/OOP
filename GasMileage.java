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

class Brands {
    String B1;
    int Y1;
    int M1;
    int M2;
    int G1;
    int Mt, Gt;
    
    public void Model () {
        B1 = "Honda";
        System.out.println("The model of the car is: " + B1);
    }

    public void Year () {
        Y1 = 2022;
        System.out.println("The year of the car is: " + Y1);
    }

    public void Mileage () {
        Scanner Mile = new Scanner(System.in);
        System.out.println("Enter the starting mileage: ");
        M1 = Mile.nextInt();
        System.out.println("Enter the ending mileage: ");
        M2 = Mile.nextInt();
        Mt = M2 - M1;
    }

    public void Gas () {
        Scanner Gass = new Scanner(System.in);
        System.out.println("Enter the amount of total gas used in this trip: ");
        G1 = Gass.nextInt();
        Gt = Mt / G1;
    }
    
}

public class GasMileage extends Brands {
    
    public static void main(String args[]){
        
        GasMileage Br = new GasMileage();
        Br.Mileage();
        Br.Gas();
        System.out.println("The total of bla bla vbla is:"+Br.Gt);

        
    }
    
}
