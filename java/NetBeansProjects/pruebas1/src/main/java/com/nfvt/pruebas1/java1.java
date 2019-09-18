package com.nfvt.pruebas1;
import java.util.Scanner;

public class java1 
{
    public static void main(String[] args)
    {
        System.out.println("Hola");
        System.out.print("como va todo?\n");
        System.out.println("mucho trabajo?\n");
        int a=10;
        int b=30;
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,coco=18;
        double d1;
        System.out.println("coco = "+coco+"\n");
        System.out.print("la suma de "+a+" mas \"coco\" y "+b+" es: ");
        n1=a+b+coco;
        System.out.println(n1);
        
        Scanner tecla1=new Scanner(System.in);
            System.out.println("\n\nAhora una suma");
            System.out.print("Ingrese el primer numero:\t");
            n1=tecla1.nextInt();
            System.out.print("Ingrese el segundo numero:\t");
            n2=tecla1.nextInt();
            n3=n1+n2;
            System.out.println("El resultado de la suma es:\t"+n3);
            
            Scanner tecla2=new Scanner(System.in);
            System.out.println("\n\nAhora una resta");
            System.out.print("Ingrese el primer numero:\t");
            n4=tecla2.nextInt();
            System.out.print("Ingrese el segundo numero:\t");
            n5=tecla2.nextInt();
            n6=n4-n5;
            System.out.println("El resultado de la resta es:\t"+n6);
            
            Scanner tecla3=new Scanner(System.in);
            System.out.println("\n\nAhora una multiplicación");
            System.out.print("Ingrese el primer numero:\t");
            n7=tecla3.nextInt();
            System.out.print("Ingrese el segundo numero:\t");
            n8=tecla3.nextInt();
            n9=n7*n8;
            System.out.println("El resultado de la multiplicación es:\t"+n9);
            
            Scanner tecla4=new Scanner(System.in);
            System.out.println("\n\nAhora una división");
            System.out.print("Ingrese el primer numero:\t");
            n10=tecla4.nextInt();
            System.out.print("Ingrese el segundo numero:\t");
            n11=tecla4.nextInt();
            n12=n10/n11;
            System.out.println("El resultado de la división es:\t"+n12);
    }
}