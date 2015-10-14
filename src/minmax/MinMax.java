/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmax;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
                int[] pole = new int[255];
        System.out.println("zadej První číslo.");
        int cislo = in.nextInt();
        pole[0] = cislo;
        int x = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Číslo nula ukončí zadávání a vypíše hodnoty.");
        while (true) {

            if(cislo!=0){
            if(cislo >max) max = cislo;
            if(cislo <min) min = cislo;
            }
            if (cislo == 0) {
                break;
            }
            System.out.println("zadej další číslo.");
            cislo = in.nextInt();
            pole[x] = cislo;
            x++;
            
    }
        int n = x;
            for (int a = 1; a < n ; a++) {
            for (int i = 0; i < n - a     ; i++) {
                if (pole[i] < pole[i + 1]) {
                    int y = pole[i];
                    pole[i] = pole[i + 1];
                    pole[i + 1] = y;
                }
            }
            }
            n--;
            if(n%2 == 1)
            {
                System.out.println("Median:" + pole[(n/2)]);
            }
            else
            {
                double stred = (pole[(n/2)] + pole[(n/2) -1]) / 2.0;
                System.out.println("Median sudeho :" + stred );
               // System.out.println("Median:" + pole[(n/2) -1]);
            }
        System.out.println("Nejmenší:" + min);
        System.out.println("Nejvetší: " + max);
    }
}
