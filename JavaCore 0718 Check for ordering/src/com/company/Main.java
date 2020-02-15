package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

0718 Check for ordering

1. Enter 10 words from the keyboard into the list of lines.
2. Determine whether the list is ordered by increasing row length.
3. If the answer is no, display the index of the first element that violates this ordering.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. Read 10 lines from the keyboard and add them to the list.
3. If the list is ordered by increasing line length, then you do not need to display anything.
4. If the list is not ordered by increasing line length,
then you need to display the number of the first element,
breaking such an order.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<10;i++) {
            list.add(reader.readLine());
        }
        int length =-1;
                for(int i=0;i<list.size();i++) {
                    if(list.get(i).length()<length) {
                        System.out.println(i);
                    }
                    length=list.get(i).length();
                }
    }
}







