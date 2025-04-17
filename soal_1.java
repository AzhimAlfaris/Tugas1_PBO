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
public class soal_1
{
    public static void main(String[] args) 
    {
        int k, n, i;
        int pmts, kmb, m;

        Scanner nilai = new Scanner(System.in);

        System.out.print("Masukkan Nilai n: ");
        n = nilai.nextInt();
        System.out.print("Masukkan Nilai k: ");
        k = nilai.nextInt();
        
        pmts = 1;
        kmb = 1;
        m = 1;
        
        for (i = n; i > (n-k); i--) 
        {
            pmts = i * pmts;
        }
        for (i = k; i > 1; i--) 
        {
            m = i * m;
        }

        kmb = pmts / m;
        
        System.out.println("------------------");
        System.out.println("Permutasi: "+pmts);
        System.out.println("Kombinasi: "+kmb);
    }
}
