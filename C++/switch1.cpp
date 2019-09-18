#include<iostream>
using namespace std;
main()
{
	char opcion;
	cout<<"vamosa trabajar con switch-case\n";
	cout<<"ingrese una opcion\n";
	cin>>opcion;
	switch(opcion)
	{
		case 's':
		case 'S':
			cout<<"estoy en \"s\" o \"S\"";
			break;
		case 2:
			cout<<"estoy en dos";
			break;
		case 3:
			cout<<"estoy en tres";
			break;
		default:
			cout<<"no estoy en nada";
			break;
	}
}
