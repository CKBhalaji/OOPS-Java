/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balaji
 */
package ex-1

import java.util.Scanner;

public class smalllarge
{
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter your array of 10 elements");
        for (int i = 0; i < a.length; ++i) {
            a[i] = o.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Smallest element in array:\t" + min);
        System.out.println("Largest element in array:\t" + max);
    }
}
