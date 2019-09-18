#include<iostream>
using namespace std;
main()
{
	char opcion;
	int n1,n2,n3;
	cout<<"vamosa trabajar con switch-case\n";
	cout<<"ingrese una opcion\n";
	cout<<"1: realizar una suma\n";
	cout<<"2: realizar una multiplicacion\n";
	cout<<"3: realizar una division\n";
	cin>>opcion;
	cout<<"\n";
	switch(opcion)
	{
		case '1':
			cout<<"ingrese el primer numero:	";
			cin>>n1;
			cout<<"ingrese el segundo numero:	";
			cin>>n2;
			n3=n1+n2;
			cout<<"\nel resultado de la suma es:	"<<n3<<"\n";
			break;
		case '2':
			cout<<"ingrese el primer numero:	";
			cin>>n1;
			cout<<"ingrese el segundo numero:	";
			cin>>n2;
			n3=n1*n2;
			cout<<"\nel resultado de la multiplicacion es:	"<<n3<<"\n";
			break;
		case '3':
			cout<<"ingrese el primer numero:	";
			cin>>n1;
			cout<<"ingrese el segundo numero:	";
			cin>>n2;
			n3=n1/n2;
			cout<<"\nel resultado de la division es:	"<<n3<<"\n";
			break;
		default:
			cout<<"opcion invalida, vuelva a ejecutar";
			break;
	}
}
