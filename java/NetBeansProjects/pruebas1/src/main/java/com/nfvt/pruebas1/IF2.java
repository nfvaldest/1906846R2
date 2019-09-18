package com.nfvt.pruebas1;
import java.util.Scanner;

public class IF2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
	System.out.print("vamos a organizar 3 numero\n");
	System.out.print("ingrese el primer numero: ");
	n1=sc.nextInt();
	System.out.print("ingrese el segundo numero: ");
	n2=sc.nextInt();
	System.out.print("ingrese el tercer numero: ");
	n3=sc.nextInt();
	if((n1<n2)&&(n2<n3))
	{
		System.out.print("1	123\n");
		System.out.print("el numero menor es: "+n1+"\n");
		System.out.print("el numero medio es: "+n2+"\n");
		System.out.print("el numero mayor es: "+n3+"\n");
	}
	else
		if((n1<n3)&&(n3<n2))
		{
			System.out.print("2	132\n");
			System.out.print("el numero menor es: "+n1+"\n");
			System.out.print("el numero medio es: "+n3+"\n");
			System.out.print("el numero mayor es: "+n2+"\n");
		}
		else
			if((n2<n1)&&(n1<n3))
			{
				System.out.print("3	213\n");
				System.out.print("el numero menor es: "+n2+"\n");
				System.out.print("el numero medio es: "+n1+"\n");
				System.out.print("el numero mayor es: "+n3+"\n");
			}
			else
				if((n2<n3)&&(n3<n1))
				{
					System.out.print("4	312\n");
					System.out.print("el numero menor es: "+n3+"\n");
					System.out.print("el numero medio es: "+n1+"\n");
					System.out.print("el numero mayor es: "+n2+"\n");
				}
				else
					if((n3<n1)&&(n1<n2))
					{
						System.out.print("5	231\n");
						System.out.print("el numero menor es: "+n2+"\n");
						System.out.print("el numero medio es: "+n3+"\n");
						System.out.print("el numero mayor es: "+n1+"\n");
					}
					else
						if((n3<n2)&&(n2<n1))
						{
							System.out.print("6	321\n");
							System.out.print("el numero menor es: "+n3+"\n");
							System.out.print("el numero medio es: "+n2+"\n");
							System.out.print("el numero mayor es: "+n1+"\n");
						}
						else
							if((n1==n2)||(n2==n3))
							{
								System.out.print("por favor vuelva a ejecutar el proceso sin repetir numeros\n");
							}
        
    }
    
}