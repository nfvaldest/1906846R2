package com.nfvt.pruebas1;
import java.util.Scanner;

public class string2
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String nom1,nom2,nom3,nom4,c1,c2,c3,c4;
    System.out.print("Ingrese el nombre del primer estudiante:\t");
    nom1=sc.nextLine();
    System.out.print("Ingrese el nombre del segundo estudiante:\t");
    nom2=sc.nextLine();
    System.out.print("Ingrese el nombre del tercero estudiante:\t");
    nom3=sc.nextLine();
    System.out.print("Ingrese el nombre del cuarto estudiante:\t");
    nom4=sc.nextLine();
    System.out.print("Ingrese la calificación de "+nom1+" :\t");
    c1=sc.nextLine();
    System.out.print("Ingrese la calificación de "+nom2+" :\t");
    c2=sc.nextLine();
    System.out.print("Ingrese la calificación de "+nom3+" :\t");
    c3=sc.nextLine();
    System.out.print("Ingrese la calificación de "+nom4+" :\t");
    c4=sc.nextLine();
    System.out.println("\n\nLa calificación de "+nom1+" es: "+c1);
    System.out.println("La calificación de "+nom2+" es: "+c2);
    System.out.println("La calificación de "+nom3+" es: "+c3);
    System.out.println("La calificación de "+nom4+" es: "+c4);
    }
}