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
	cout<<"\nel resultado de la multiplicaci�n es:	"<<n3<<"\n";
}
void division()
{
	cout<<"ingrese el primer numero:	";
	cin>>n1;
	cout<<"ingrese el segundo numero:	";
	cin>>n2;
	n3=n1/n2;
	cout<<"\nel resultado de la divisi�n es:	"<<n3<<"\n";
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
	cout<<"ingrese una opci�n\n";
	cout<<"1: realizar una suma\n";
	cout<<"2: realizar una multiplicaci�n\n";
	cout<<"3: realizar una divisi�n\n";
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
			cout<<"opci�n invalida, vuelva a ejecutar";
			break;
	}
}
