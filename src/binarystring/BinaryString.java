/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarystring;

import java.util.Scanner;

/**
 *
 * @author neerajsah
 */
public class BinaryString {

    public static void main(String[] args) 
    {
        
        int numberOfOnes=0,count=0;
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Binary String");
        String binary=scn.next();
        
        
        for(int i=0;i<binary.length();i++)
        {
           
          if(binary.charAt(i)=='1')
          {
              count++;
          }

          if(binary.charAt(i)=='0')
          {
            if(numberOfOnes<count)
              {
                numberOfOnes=count;
                 count=0;
              }
          }
        }
        System.out.println(numberOfOnes);
    }
    
}
