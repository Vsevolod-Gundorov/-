package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        Pattern neededLine = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        Matcher matcher = neededLine.matcher(text);
        boolean tester = matcher.matches();
        if(tester == true)
        {
            System.out.println("Введёная строка: " + text + " является email адресом");
        }
        else
        {
            System.out.println("Введёная строка: " + text + " не является email адресом!");
        }
    }
}
