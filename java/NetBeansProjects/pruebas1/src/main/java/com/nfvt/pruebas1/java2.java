package com.nfvt.pruebas1;
import java.util.Scanner;

public class java2 
{
    public static void main(String[] args)
    {
        System.out.println("Hola");
        System.out.print("como va todo?\n");
        System.out.println("mucho trabajo?\n");
        int a=10;
        int b=30;
        int n1,n2,n3,coco=18;
        double d1;
        System.out.println("coco = "+coco+"\n");
        System.out.print("la suma de "+a+" mas \"coco\" y "+b+" es: ");
        n1=a+b+coco;
        System.out.println(n1);
        
        Scanner tecla1=new Scanner(System.in);
            System.out.println("\n\nAhora unas operaciones basicas");
            System.out.print("Ingrese el primer numero:\t");
            n1=(int) tecla1.nextDouble();
            System.out.print("Ingrese el segundo numero:\t");
            n2=(int) tecla1.nextDouble();
            n3=n1+n2;
            System.out.println("El resultado de la suma es:\t"+n3);
            n3=n1-n2;
            System.out.println("El resultado de la resta es:\t"+n3);
            n3=n1*n2;
            System.out.println("El resultado de la multiplicación es:\t"+n3);
            d1=n1/n2;
            System.out.println("El resultado de la división es:\t"+d1);
            
            
    }
}