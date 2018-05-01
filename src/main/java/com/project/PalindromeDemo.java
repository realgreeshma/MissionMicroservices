package com.project;

import java.util.Scanner;

public class PalindromeDemo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String orig = sc.nextLine();
      //  sc.close();

        StringBuffer reverse = new StringBuffer();
        for ( int i=orig.length()-1;i>=0;i--)
        {
            reverse = reverse.append(orig.charAt(i));
        }
        System.out.println("Reverse String" +reverse);
        if (orig.equalsIgnoreCase(reverse.toString()))
            System.out.println("It is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
