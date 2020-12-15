package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        Pattern neededLine = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*[A-Z])(?=.*[a-z])\\w*)");
        Matcher matcher = neededLine.matcher(text);
        boolean tester = matcher.matches();
        if(tester == true)
        {
            System.out.println("Введёная строка: " + text + " является нужным паролем");
        }
        else
        {
            System.out.println("Введёная строка: " + text + " не является нужным праолем!");
        }
    }
}

