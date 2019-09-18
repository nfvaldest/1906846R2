package com.nfvt.pruebas1;
import java.util.Scanner;

public class Do_while 
{
    public static void main(String[] args)
    {
        System.out.print("Ingrese dos numeros diferentes\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int n1=sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int n2=sc.nextInt();
        do
        {
            System.out.print("Por favor vuelva a ingresar el segundo numero :");
            n2=sc.nextInt();
        }
        while (n2<=n1);
        do
        {
            System.out.println(n1);
            n1++;
        }
        while (n1<=n2);
    }
}
