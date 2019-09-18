package com.nfvt.pruebas1;
import java.util.Scanner;

public class for3
{
    public static void main(String[] args)
    {
        int cantidad,i,j,fila,columna,auxiliar;
        int vector[]=new int[50];
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese la cantidad de numeros a ingresar: ");
        cantidad=entrada.nextInt();
        for (i=1;i<=cantidad;i++)
        {
            System.out.print("\nIngrese el numero en el indice del vector ["+i+"] : ");
            vector[i]=entrada.nextInt();
        }
        for (fila=1;fila<=cantidad-1;fila++)
        {
            for (columna=1;columna<=cantidad-1;columna++)
            {
                if (vector[columna]>vector[columna+1])
                {
                    auxiliar=vector[columna];
                    vector[columna]=vector[columna+1];
                    vector[columna+1]=auxiliar;
                }
            }
        }
        System.out.println("Ascendente:");
        for (i=1;i<=cantidad;i++)
        {
            System.out.println("Posición "+i+" es : "+vector[i]);
        }
        System.out.println("Descendente:");
        for (i=cantidad;i>=1;i--)
        {
            System.out.println("Posición "+i+" es : "+vector[i]);
        }
    }
    
}