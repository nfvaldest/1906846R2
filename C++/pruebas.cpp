#include<iostream>
using namespace std;
main()
{
	string salida1 = "Ejemplo de salida\n"; //El valor de esta variable se mostrar� en pantalla
    int numero = 2; //Este valor tambi�n se mostrar� en pantalla.
    string salida2 = "# 3"; //Estos valores se concatenar�n en una �nica salida

    //Se concatenan y muestran los valores por pantalla con par�metros de printf
    printf("%s %d. %s \n", salida1.c_str(), numero, salida2.c_str());

}
