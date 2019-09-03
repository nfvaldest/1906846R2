#include<iostream>
using namespace std;
main()
{
	int edad;
	cout<<"Bienvenido a Cinefull\n";
	cout<<"ingrese su edad para el ingreso a la pelicula\n";
	cin>>edad;
	if(edad>=18)
	{
		cout<<"ingrese a la sala para adultos\n";
	}
	else
		if(edad<=0)
		{
			cout<<"edad invalida\n";
		}
		else
		{
			cout<<"ingrese a sala para menores\n";
		}
}
