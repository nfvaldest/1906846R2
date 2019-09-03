#include<iostream>
using namespace std;
main()
{
	int n1,n2;
	cout<<"ingrese un numero menor o igual a 123\n";
	cin>>n1;
	while (n1<=123)
	{
		n2=1;
		while (n2<21)
		{
			cout<<n2;
			n2=n2+1;
		}
	cout<<"\n\ningrese denuevo un numero menor o igual a 123\n";
	cin>>n1;
	}
}
