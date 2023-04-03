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

class speed{
    float velocidad;
    
    public void Setspeed(){
    Scanner sp = new Scanner(System.in);
    System.out.println("Enter the speed you are traveling: ");
    velocidad = sp.nextFloat();
}
}

class Distance extends speed{
    
    float distancia;
    
    public void SetDistance(){
        Scanner Dt = new Scanner(System.in);
        System.out.println("At what distance is your objective?");
        distancia = Dt.nextFloat();
    }
    
}

class time extends Distance{
    float tiempo;
    
    public void SetTime(){
        tiempo = distancia / velocidad;
        
    }
}

public class HomeCollege extends time {
    
    public static void main (String args []) {
        
        HomeCollege HC = new HomeCollege();
        HC.SetDistance();
        HC.Setspeed();
        HC.SetTime();
        System.out.println("It will take: "+HC.tiempo);
        
        
        
    }
    
}
