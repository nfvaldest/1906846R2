package com.nfvt.pruebas1;
import java.util.Scanner;

public class While_do 
{
    public static void main(String[] args)
    {
        System.out.print("Ingrese dos numeros diferentes\n");
        Scanner sc1=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1=sc1.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2=sc1.nextInt();
        while(num2<=num1)
        {
            System.out.print("El segundo numero tiene que ser mayor que el primero");
            System.out.print("\nIngrese de nuevo el segundo numero: ");
            num2=sc1.nextInt();
        }
        while(num1<=num2)
        {
            System.out.println(num1);
            num1++;
        }
    }
}
