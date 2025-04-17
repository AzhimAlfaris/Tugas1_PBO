/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class soal_3 
{    
    public static void main(String[] args) 
    {
        int opsi, baris, kolom, i, j, k;
        int matriks1[][];
        int matriks2[][];
        int hasil[][];
        char ulangi;
        
        Scanner nilai = new Scanner(System.in);
        Random rand = new Random();
        
        do 
        {
            System.out.println("Silahkan Pilih Opsi Operasi Matrisk yang Anda Inginkan");
            System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Identitas\n5. Transpose\n6. Exit");
            System.out.print("Opsi (1-6): ");
            opsi = nilai.nextInt();
                      
            if (opsi < 1 || opsi > 6) 
            {
                System.out.println("Opsi Tidak Valid.");
                System.out.print("Apakah Anda Ingin Kembali Memilih? (y/n): ");
                ulangi = nilai.next().charAt(0);
                continue;
            }
            
            if (opsi == 6) 
            {
                System.out.println("Anda Telah Keluar");
                break;
            }
            
            System.out.print("Masukkan Jumlah Baris: ");
            baris = nilai.nextInt();
            System.out.print("Masukkan Jumlah Kolom: ");
            kolom = nilai.nextInt();
            
            matriks1 = new int[baris][kolom];
            matriks2 = new int[baris][kolom];
            hasil = new int[baris][kolom];
            
            System.out.println("Matriks 1:");
            for (i = 0; i < baris; i++) 
            {
                for (j = 0; j < kolom; j++) 
                {
                    matriks1[i][j] = rand.nextInt(50) + 1;
                    System.out.print(matriks1[i][j] + "\t");
                }
                System.out.println();
            }
            
            if (opsi != 4 && opsi != 5) 
            {
                System.out.println("Matriks 2:");
                for (i = 0; i < baris; i++) 
                {
                    for (j = 0; j < kolom; j++) 
                    {
                        matriks2[i][j] = rand.nextInt(50) + 1;
                        System.out.print(matriks2[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            
            if (opsi == 1) 
            {
                System.out.println("Hasil Penjumlahan:");
                for (i = 0; i < baris; i++) 
                {
                    for (j = 0; j < kolom; j++) 
                    {
                        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (opsi == 2) 
            {
                System.out.println("Hasil Pengurangan:");
                for (i = 0; i < baris; i++) 
                {
                    for (j = 0; j < kolom; j++) 
                    {
                        hasil[i][j] = matriks1[i][j] - matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (opsi == 3) 
            {
                System.out.println("Hasil Perkalian:");
                for (i = 0; i < baris; i++) 
                {
                    for (j = 0; j < kolom; j++) 
                    {
                        for (k = 0; k < kolom; k++) 
                        {
                            hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                        }
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } 
            else if (opsi == 4) 
            {
                if (baris != kolom) 
                {
                    System.out.println("Nilai Baris dan Kolom Harus Sama. Jawaban yang Anda Dapatkan "
                            + "Tidak Akurat");
                } 
                else 
                {
                    System.out.println("Matriks Identitas:");
                    for (i = 0; i < baris; i++) 
                    {
                        for (j = 0; j < kolom; j++) 
                        {
                            hasil[i][j] = (i == j) ? 1 : 0;
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
            }
            else if (opsi == 5) 
            {
                System.out.println("Transpose dari Matriks 1:");
                for (i = 0; i < kolom; i++) 
                {
                    for (j = 0; j < baris; j++) 
                    {
                        System.out.print(matriks1[j][i] + "\t");
                    }
                    System.out.println();
                }
            }
            
            System.out.print("Apakah Anda Ingin Kembali Memilih (y/n): ");
            ulangi = nilai.next().charAt(0);
        } while (ulangi == 'y');
    }
}

