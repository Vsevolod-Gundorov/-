package com.company;
import java.util.Scanner;

public class Exception2 {
    public Exception2()
    {
        try
        {
            try
            {
                //try
                //{
                    Scanner myScanner = new Scanner(System.in);
                    System.out.println("Enter an integer");
                    String intString = myScanner.next();
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                //}
                //catch (Exception e)
                //{
                    //System.err.println("I can say you that you are wrong, but I don't want to say why");
                //}
            }
                catch (ArithmeticException e)
                {
                    System.err.println("You can't do 2/0, it's infinity, try again");
                }
        }
                catch (NumberFormatException e)
                {
                System.err.println("If you want this code work, write only variables of type int");
                }
    }
}
