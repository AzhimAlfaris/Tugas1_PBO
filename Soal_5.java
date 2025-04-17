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

public class Soal_5 
{
    public static void main(String[] args) 
    {
        int mx, my, mz, hargax, hargay, hargaz;
        double totx, toty, totz, diskonx, diskony, diskonz;
        double totaldiskon, totalpembelian, totalbayar;
        
        Scanner nilai = new Scanner(System.in);

        System.out.println("-- Pembelian Kotak Susu --");
        System.out.print("Jumlah Merk X: ");
        mx = nilai.nextInt();
        System.out.print("Jumlah Merk Y: ");
        my = nilai.nextInt();
        System.out.print("Jumlah Merk Z: ");
        mz = nilai.nextInt();
        
        hargax = 40000;
        hargay = 50000;
        hargaz = 60000;
        
        totx = mx * hargax;
        toty = my * hargay;
        totz = mz * hargaz;

        diskonx = 0;
        diskony = 0;
        diskonz = 0;
        
        if (mx >= 3)
        {
            diskonx = totx * 0.10;
        }
        if (my > 3)
        {
            diskony = toty * 0.12;
        }
        if (mz > 1)
        {
            diskonz = (mz - 1) * hargaz * 0.15;
        }
        
        totaldiskon = diskonx + diskony + diskonz;
        totalpembelian = totx + toty + totz;
        totalbayar = totalpembelian - totaldiskon;
        
        System.out.println("Total Pembelian : Rp. " + totalpembelian);
        System.out.println("Total Diskon    : Rp. " + totaldiskon);
        System.out.println("Total Tagihan   : Rp. " + totalbayar);
    }
}
