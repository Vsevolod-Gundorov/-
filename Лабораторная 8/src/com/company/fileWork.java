package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWork
{
    public fileWork() throws IOException {
        try(FileWriter write = new FileWriter("File.txt", false))
        {
            String text = "Добрый день, Всеволод";
            write.write(text);
            write.append('\n');
            write.flush();
        }
        try(FileReader reading = new FileReader("File.txt"))
        {
            int c;
            while((c = reading.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        try(FileWriter write = new FileWriter("File.txt", false))
        {
            String text = "Спасибо за работу";
            write.write(text);
            write.flush();
        }
        try(FileWriter write = new FileWriter("File.txt", true))
        {
            Scanner console = new Scanner(System.in);
            String a = console.nextLine();
            write.write(a);
            write.flush();
        }
    }
}
