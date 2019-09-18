package com.nfvt.pruebas1;
import java.util.Scanner;

public class For
{
    public static void main(String[] args)
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Vamos a realizar un conteo\n");
        System.out.print("Ingrese el numero de ciclos: ");
        x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            System.out.println("Ciclo numero: "+i);
        }
    }
    
}
