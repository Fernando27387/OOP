/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferna
 */
import java.util.Scanner;

public class Assigment_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of people to survey: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); 

        
        Person[] people = new Person[numPeople];

        
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter data for person " + (i+1) + ":");

            
            System.out.print("Enter gender (M/F): ");
            String gender = scanner.nextLine();

            
            System.out.print("Does the person deposit garbage? (Y/N): ");
            String depositsGarbageStr = scanner.nextLine();
            boolean depositsGarbage = depositsGarbageStr.equalsIgnoreCase("Y");

            
            System.out.print("Does the person litter? (Y/N): ");
            String littersStr = scanner.nextLine();
            boolean litters = littersStr.equalsIgnoreCase("Y");

            
            Person person = new Person(gender, depositsGarbage, litters);
            people[i] = person;
        }

       
        int numMaleNoDepositOrLitter = 0;
        int numFemaleNoDepositOrLitter = 0;

        for (Person person : people) {
            if (person.gender.equalsIgnoreCase("M") && !person.depositsGarbage && person.litters) {
                numMaleNoDepositOrLitter++;
            } else if (person.gender.equalsIgnoreCase("F") && !person.depositsGarbage && person.litters) {
                numFemaleNoDepositOrLitter++;
            }
        }

        
        System.out.println("Number of males who do not deposit garbage and litter: " + numMaleNoDepositOrLitter);
        System.out.println("Number of females who do not deposit garbage and litter: " + numFemaleNoDepositOrLitter);
    }
}

class Person {
    String gender;
    boolean depositsGarbage;
    boolean litters;

    public Person(String gender, boolean depositsGarbage, boolean litters) {
        this.gender = gender;
        this.depositsGarbage = depositsGarbage;
        this.litters = litters;
    }
}
