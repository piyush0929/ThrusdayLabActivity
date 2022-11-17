package com.Quetion1;
import java.util.Scanner;
public class HigestPlacement {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in IT:");
        int IT = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        
        if(CSE==IT && IT==MECH && CSE==MECH)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE>=0 && IT>=0 && MECH>=0)
        {
        
            if (MECH>IT && MECH>CSE)
            {
                System.out.println("Highest placement MECH");
            }
            else if(CSE>MECH && CSE>IT)
            {
                System.out.println("Highest placement CSE");
            }
            else if(IT>MECH && IT>CSE)
            {
                System.out.println("Highest placement IT");
            }
            else if(IT==MECH)
            {
                System.out.println("Highest Placement IT MECH");
            }
            else if(CSE==IT)
            {
                System.out.println("Highest Placement CSE IT");
            }
            else if(CSE==MECH)
            {
                System.out.println("Highest Placement CSE MECH");
            }
        }  
        else
        {
            System.out.println("Input is invalid");
        }
    }
}
