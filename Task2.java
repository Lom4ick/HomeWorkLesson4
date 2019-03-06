package com.groupqa1;


import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter positive number to convert to binary code: ");
        int dec = sc.nextInt();

        Task2 dtb = new Task2();
        String res = dtb.toBinary(dec);
        System.out.println("Your binary code:" + res);
    }

    public String toBinary(int decCode) {
        if(decCode == 0) {
            return "0";
        }
        String binary = "";
        while(decCode > 0) {
            int bin = decCode % 2;
            binary = bin + binary;
            decCode = decCode / 2;
        }
        return binary;
    }


}