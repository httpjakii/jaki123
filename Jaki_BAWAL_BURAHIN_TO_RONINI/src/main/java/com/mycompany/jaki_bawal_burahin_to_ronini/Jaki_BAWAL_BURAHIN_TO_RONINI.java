/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jaki_bawal_burahin_to_ronini;
import java.util.Scanner;
/**
 *
 * @author CL3-PC36
 */
public class Jaki_BAWAL_BURAHIN_TO_RONINI {

    public static void main(String[] args)
        {
        Scanner input = new Scanner (System.in);
        
        System.out.println(" [1] - Snacks ");
        System.out.println(" [2] - Drinks ");
        
        System.out.println(" Enter your Choice: ");
        int  cha1 = input.nextInt();
        
        if (cha1==1)
        {
            System.out.println(" Snacks ");
            System.out.println(" [1] - Pyatos [20 Pesos] ");
            System.out.println(" [2] - Noba [20 Pesos] ");
            
            System.out.println(" Enter the snacks of your choice: ");
            int cha2 = input.nextInt();
 
            if (cha2==1)
            {
                System.out.println(" Pyatos 20 Pesos ");
                int Pya, Noba;
                
                Pya = 20;
                Noba = 20;
                
                System.out.println(" Would you like to order drinks? [1] - YES or [2] - NO ");
                int cha3 = input.nextInt();
                
                if (cha3==1)
                {
                    System.out.println(" Drinks ");
                    System.out.println(" [1] - Cowk [25 Pesos] ");
                    System.out.println(" [2] - Wata [30 Pesos] ");
                      
                    System.out.println(" Enter the drinks of your choice: ");
                    int cha4 = input.nextInt();
                    int Cowk, Wata;
                      
                    Cowk= 25;
                    Wata = 30;
                      
                    if (cha4==1)
                    {
                        System.out.println(" Cowk 25 Pesos ");
                        int tot;
                        tot = Cowk + Pya;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (cha4==2)
                    {
                        System.out.println(" Wata 30 Pesos ");
                        int tot;
                        tot = Wata + Pya;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else
                    {
                        System.out.println(" Invalid Input ");
                        int tot;
                        tot = 20;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                }
                
                else if (cha3==2)
                {
                    System.out.println(" Pyatos 20 Pesos ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else if (cha3 > 2)
                {
                    System.out.println(" Invalid Input "); //y89tity8t8
                     int tot = 20;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                }
            }
            
            if (cha2==2)
            {
                System.out.println(" Noba 20 Pesos ");
                int Pya, Noba;
                
                Pya = 20;
                Noba = 20;
                
                System.out.println(" Would you like to order drinks? [1] - YES or [2] - NO ");
                int cha6 = input.nextInt();
                    
                if (cha6==1)
                {
                    System.out.println(" Drinks ");
                    System.out.println(" [1] - Coke [25 Pesos] ");
                    System.out.println(" [2] - Wata [30 Pesos] ");
                      
                    System.out.println(" Enter the drinks of your choice: ");
                    int cha7 = input.nextInt();
                    int Cowk, Wata;
                      
                    Cowk = 25;
                    Wata = 30;
                      
                    if (cha7==2)
                    {
                        System.out.println(" Wata 30 Pesos ");
                        int tot;
                        tot = Wata + Noba;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (cha7==1)
                    {
                        System.out.println(" Coke 25 Pesos ");
                        int tot;
                        tot = Cowk + Noba;
                        
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (cha7>=3)
                    {
                        System.out.println(" Invalid Input ");
                    }
                }
                
                else if (cha6==2)
                {
                    System.out.println(" Nova 20 Pesos ");
                    int tot;
                    tot = Noba;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else if (cha6>=3)
                {
                    System.out.println(" Invalid Input ");
                    System.out.println(" Nova 20 Pesos ");
                    int tot;
                    tot = 20;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            else if (cha2>=3)
            {
               System.out.println(" Invalid Input ");      
            }   
        } 

        else if (cha1==2)
        {
            System.out.println(" Drinks ");
            System.out.println(" [1] - Cowk [25 Pesos] ");
            System.out.println(" [2] - Wata [30 Pesos] ");
            
            System.out.println(" Enter the drinks of your choice: ");
            int cha8 = input.nextInt();
            
            if (cha8==1)
            {
                System.out.println(" Cowk 25 Pesos ");
                int Cowk, Wata;
                
                Cowk = 25;
                Wata = 30;
                
                System.out.println(" Would you like to order snacks? [1] - YES or [2] - NO ");
                int cha9 = input.nextInt();
                
                if (cha9==1)
                {
                    System.out.println(" Snacks ");
                    System.out.println(" [1] - Pyatos [20 Pesos] ");
                    System.out.println(" [2] - Noba [20 Pesos] ");
                    
                    System.out.println(" Enter the snacks of your choice: ");
                    int cha10 = input.nextInt();
                    int Pya, Noba;
                    
                    Pya = 20;
                    Noba = 20;
                    
                    if(cha10==1)
                    {
                        System.out.println(" Pyatos 20 Pesos ");
                        int tot;
                        tot = Cowk + Pya;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (cha10==2)
                    {
                        System.out.println(" Noba 20 Pesos ");
                        int tot;
                        tot = Cowk + Noba;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                        
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (cha10>=3)
                    {
                        System.out.println(" Invalid Input ");
                    }
                }
                
                else if (cha9==2)
                {
                    System.out.println(" Cowk 25 Pesos ");
                    int tot;
                    tot = 25;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else if (cha9>=3)
                {
                    System.out.println(" Invalid Input ");
                    System.out.println(" Cowk 25 Pesos ");
                    int tot;
                    tot = 25;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            
            if (cha8==2)
            {
                System.out.println(" Wata 30 Pesos ");
                int Cowk, Wata;
                
                Cowk = 25;
                Wata = 30;
                
                System.out.println(" Would you like to order snacks? [1] - YES or [2] - NO ");
                int cha11 = input.nextInt();
                
                if (cha11==1)
                {
                    System.out.println(" Snacks ");
                    System.out.println(" [1] - Pyatos [20 Pesos] ");
                    System.out.println(" [2] - Noba [20 Pesos] ");
                    
                    System.out.println(" Enter the snacks of your choice: ");
                    int cha12 = input.nextInt();
                    int Pya, Noba;
                    
                    Pya = 20;
                    Noba = 20;
                    
                    if (cha12==1)
                    {
                        System.out.println(" Pyatos 20 Pesos ");
                        int tot;
                        tot = Wata + Pya;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    
                    if (cha12==2)
                    {
                        System.out.println(" Noba 20 Pesos ");
                        int tot;
                        tot = Wata+ Noba;
                            
                        System.out.println("Total is: " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                        
                        while (csh<tot)
                        {
                            System.out.println(" Try Again ");
                            System.out.println(" Enter your cash: ");
                            csh = input.nextInt();
                        }
                            
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println(" Change is: " + chng);
                        }
                    }
                    else if (cha12>=3)
                    {
                        System.out.println(" Invalid Input ");
                    }
                }
                
                else if (cha11==2)
                {
                    System.out.println(" Wata 30 Pesos ");
                    int tot;
                    tot = 30;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
                else if (cha11>=3)
                {
                    System.out.println(" Invalid Input ");
                    System.out.println(" Wata 30 Pesos ");
                    int tot;
                    tot = 30;
                    
                    System.out.println("Total is: " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                        
                    while (csh<tot)
                    {
                        System.out.println(" Try Again ");
                        System.out.println(" Enter your cash: ");
                        csh = input.nextInt();
                    }
                        
                    if (csh>=tot)
                    {
                        int chng;
                        chng = csh - tot;
                        System.out.println(" Change is: " + chng);
                    }
                }
            }
            else if (cha8>=3)
            {
               System.out.println(" Invalid Input ");
            }
        }
        else if(cha1 > 2)
        {
            System.out.println(" Invalid Input ");
        }
    }
}



