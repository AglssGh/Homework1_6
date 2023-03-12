/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/*                      Code is here
                              |
                              |
                              V                           */
//----------------------------------------------------------
package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter title - ");
        String title = in.nextLine();
        
        System.out.print("Enter field1 - ");
        String field1 = in.nextLine();
        
        System.out.print("Enter field2 - ");
        String field2 = in.nextLine();
        
        Plant conferous = new Plant(title, field1, field2);
        Gardener vowelsHaterVgtblEnjoyer = new Gardener();
        conferous.doGrowing();
        vowelsHaterVgtblEnjoyer.filter(conferous);
        
        String output1 = conferous.getTitle();
        String output2 = conferous.getField1();
        String output3 = conferous.getField2();
        
        System.out.println("Title: " + output1 + ", field1: " + output2 + ", field2: " + output3);
        System.out.println("Шандиров Идар РИБО-02-21");
    }
}
