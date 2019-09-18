package com.nfvt.pruebas1;
import java.util.Scanner;

public class For2
{
    public static void main(String[] args)
    {
	int cantidad[4][4];
	for(int i=0;i<4;i++)
	{
		System.out.print("inicio de ciclo "+(i+1)+" .\n");
		for(int j=0;j<4;j++)
		{
			Scanner cn1=new Scanner(System.in);
			System.out.print("Digite el numero ["+i+"]["+j+"] : ");
			cantidad[i][j]=cn1.nextInt();
		}
		System.out.print("\n");
	}
	System.out.print("\nmatriz\n\n"+"-----------------------------------------------------------------\n");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print("|	"+cantidad[j][i]+"	|");
		}
		System.out.print("\n-----------------------------------------------------------------\n");
	}
	System.out.print("\nmatriz traspuesta\n\n"+"-----------------------------------------------------------------\n");
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print("|	"+cantidad[i][j]+"	|");
		}
		System.out.print("\n-----------------------------------------------------------------\n");
	}
    }
}