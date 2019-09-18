package com.nfvt.pruebas1;
import java.util.Scanner;

public class character
{
    public static void main(String[] args)
    {
        char ch1;
        ch1 =' ';
        System.out.print("Digite un caracter: ");
        Scanner sc=new Scanner(System.in);
        ch1 =sc.next().charAt(0);
        System.out.print("su caracter es: "+ch1);
    }
}
