#include<iostream>
using namespace std;
main()
{
	int n1,n2,n3;
	cout<<"vamos a organizar 3 numero\n";
	cout<<"ingrese el primer numero\n";
	cin>>n1;
	cout<<"ingrese el segundo numero\n";
	cin>>n2;
	cout<<"ingrese el tercer numero\n";
	cin>>n3;
	if((n1<n2)&&(n2<n3))
	{
		cout<<"1	123\n";
		cout<<"el numero menor es: "<<n1<<"\n";
		cout<<"el numero medio es: "<<n2<<"\n";
		cout<<"el numero mayor es: "<<n3<<"\n";
	}
	else
		if((n1<n3)&&(n3<n2))
		{
			cout<<"2	132\n";
			cout<<"el numero menor es: "<<n1<<"\n";
			cout<<"el numero medio es: "<<n3<<"\n";
			cout<<"el numero mayor es: "<<n2<<"\n";
		}
		else
			if((n2<n1)&&(n1<n3))
			{
				cout<<"3	213\n";
				cout<<"el numero menor es: "<<n2<<"\n";
				cout<<"el numero medio es: "<<n1<<"\n";
				cout<<"el numero mayor es: "<<n3<<"\n";
			}
			else
				if((n2<n3)&&(n3<n1))
				{
					cout<<"4	312\n";
					cout<<"el numero menor es: "<<n3<<"\n";
					cout<<"el numero medio es: "<<n1<<"\n";
					cout<<"el numero mayor es: "<<n2<<"\n";
				}
				else
					if((n3<n1)&&(n1<n2))
					{
						cout<<"5	231\n";
						cout<<"5el numero menor es: "<<n2<<"\n";
						cout<<"el numero medio es: "<<n3<<"\n";
						cout<<"el numero mayor es: "<<n1<<"\n";
					}
					else
						if((n3<n2)&&(n2<n1))
						{
							cout<<"6	321\n";
							cout<<"el numero menor es: "<<n3<<"\n";
							cout<<"el numero medio es: "<<n2<<"\n";
							cout<<"el numero mayor es: "<<n1<<"\n";
						}
						else
							if((n1==n2)||(n2==n3))
							{
								cout<<"por favor vuelva a ejecutar el proceso sin repetir numeros\n";
							}
							
}
