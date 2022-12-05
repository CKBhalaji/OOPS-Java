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

public class pattern
{
    public static void main(String[] arg) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}