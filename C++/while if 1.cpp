#include<iostream>
using namespace std;
main()
{
	int n1,n2,n3;
	cout<<"ingrese un numero\n";
	cin>>n1;
	if (n1<=123)
	{
		while (n1<=123)
		{
			n2=1;
			while (n2<31)
			{
				cout<<n2<<"  ";
				n2=n2+1;
			}
		cout<<"\n\ningrese denuevo un numero igual o mennor a 123\n";
		cin>>n1;
		}
	}
	else 
	{
		if (n1>=124)
		{
			while (n1>=124)
			{
				n3=50;
				while (n3<100)
				{
					cout<<n3<<"  ";
					n3=n3+10;
				}
			cout<<"\n\ningrese denuevo un numero igual o mayor a 124\n";
			cin>>n1;
			}
		}
	}
}
