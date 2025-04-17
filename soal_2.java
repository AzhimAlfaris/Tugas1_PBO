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
public class soal_2
{
    public static void main(String[] args) 
    {
        int A[], B[], C[];
        int uaA, uaB, i;
        
        Scanner nilai = new Scanner(System.in);
 
        Random rand = new Random();
        System.out.print("Masukkan Ukuran Array A: ");
        uaA = nilai.nextInt();
        System.out.print("Masukkan Ukuran Array B: ");
        uaB = nilai.nextInt();
        
        A = new int[uaA];
        B = new int[uaB];
        C = new int[uaA + uaB];
        
        System.out.println("Array A: ");
        for (i = 0; i < uaA; i++) 
        {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array B: ");
        for (i = 0; i < uaB; i++) 
        {
            B[i] = rand.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array C: ");
        if (uaA >= uaB) 
        {
            for(i = 0; i < uaA; i++)
            {
                System.out.print(A[i] + "  ");
            }
            for(i = 0; i < uaB; i++)
            {
                System.out.print(B[i] + "  ");
            }
        } 
        else 
        {
            for(i = 0; i < uaB; i++)
            {
                System.out.print(B[i] + "  ");
            }
            for(i = 0; i < uaA; i++)
            {
                System.out.print(A[i] + "  ");
            }
        }      
        System.out.println();
        
    }
}
