/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhalaji
 */
package ex-1

import java.util.Scanner;

public class swap
{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter your a,b value");
        int a = o.nextInt();
        int b = o.nextInt();
        System.out.println("Before swapping values are");
        System.out.println("a=" + a + "\tb=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping values are a=" + a + "\tb=" + b);
    }
}
