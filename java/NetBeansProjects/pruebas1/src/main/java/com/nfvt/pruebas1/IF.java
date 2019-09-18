package com.nfvt.pruebas1;
import java.util.Scanner;

public class IF
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite 1 para ejecutar el ejercicio For\n"+"Digite cualquier otro numero para termiar el proceso\n"+"Digite un numero: ");
        int n1=sc.nextInt();
        if(n1<=1)
        {
        int x;
        Scanner sc1=new Scanner(System.in);
        System.out.print("\n\nVamos a realizar un conteo\n");
        System.out.print("Ingrese el numero de ciclos: ");
        x=sc1.nextInt();
            for(int i=1;i<=x;i++)
            {
                System.out.println("Ciclo numero: "+i);
            }
        }
        else
        {
            System.out.print("Proceso terminado!");
        }
    }
    
}
