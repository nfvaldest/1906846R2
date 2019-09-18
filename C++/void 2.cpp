#include<iostream>
#include<locale.h>
using namespace std;

char opcion;
float n1,n2,n3;
	
void suma();
void division();
void multiplicacion();

void multiplicacion()
{
	cout<<"ingrese el primer numero:	";
	cin>>n1;
	cout<<"ingrese el segundo numero:	";
	cin>>n2;
	n3=n1*n2;
	cout<<"\nel resultado de la multiplicación es:	"<<n3<<"\n";
}
void division()
{
	cout<<"ingrese el primer numero:	";
	cin>>n1;
	cout<<"ingrese el segundo numero:	";
	cin>>n2;
	n3=n1/n2;
	cout<<"\nel resultado de la división es:	"<<n3<<"\n";
}
void suma()
{
	cout<<"ingrese el primer numero:	";
	cin>>n1;
	cout<<"ingrese el segundo numero:	";
	cin>>n2;
	n3=n1+n2;
	cout<<"\nel resultado de la suma es:	"<<n3<<"\n";
}
main()
{
	setlocale(LC_CTYPE,"Spanish");
	cout<<"ingrese una opción\n";
	cout<<"1: realizar una suma\n";
	cout<<"2: realizar una multiplicación\n";
	cout<<"3: realizar una división\n";
	cin>>opcion;
	cout<<"\n";
	switch(opcion)
	{
		case '1':
			suma();
			break;
		case '2':
			multiplicacion();
			break;
		case '3':
			division();
			break;
		default:
			cout<<"opción invalida, vuelva a ejecutar";
			break;
	}
}
