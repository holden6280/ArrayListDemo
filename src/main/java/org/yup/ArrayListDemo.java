package org.yup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){

        try {

            FileReader finder = new FileReader("students.csv");
            BufferedReader reader = new BufferedReader(finder);

            reader.readLine();

            ArrayList<String> students = new ArrayList<>();

            System.out.println(students);
            System.out.println(students.size());
            String theLine;
            while((theLine = reader.readLine()) != null){

                String[] studInfo = theLine.split("\\|");

                students.add(studInfo[1]);
            }

            System.out.println(students);
            students.remove(6);
            System.out.println(students.size());
            System.out.println(students);
            students.remove(5);
            System.out.println(students.size());
            System.out.println(students);
            students.set(0, "Eric Schwartz");
            System.out.println(students.size());
            System.out.println(students);
            students.clear();
            System.out.println(students);
            System.out.println(students.size());

        }catch(IOException e){

            System.out.println("No");

        }
    }
}