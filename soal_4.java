/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class soal_4 
{
    public static void main(String[] args) 
    {
        int n, i, j;
        
        Scanner nilai = new Scanner(System.in);

        System.out.print("Masukkan Ukuran Pola: ");  
        n = nilai.nextInt();

        for (i = 0; i < n; i++) 
        {
            for (j = 0; j < n; j++) 
            {
                if (i == 0 || j == 0 || i == j)
                {
                    System.out.print("0 ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
