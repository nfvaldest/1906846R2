#include<iostream>
#include<locale.h>
using namespace std;

void suma();
void resta();
void mensaje();

void mensaje()
{
	cout<<"estoy en la funci�n mensaje\n";
}
void resta()
{
	cout<<"estoy en la funci�n resta\n";
}
void suma()
{
	cout<<"estoy en la funci�n suma\n";
}
main()
{
	setlocale(LC_CTYPE,"Spanish");
	resta();
	mensaje();
	suma();
	mensaje();
	mensaje();
}
