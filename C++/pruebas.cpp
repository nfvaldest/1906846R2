#include<iostream>
using namespace std;
main()
{
	string salida1 = "Ejemplo de salida\n"; //El valor de esta variable se mostrará en pantalla
    int numero = 2; //Este valor también se mostrará en pantalla.
    string salida2 = "# 3"; //Estos valores se concatenarán en una única salida

    //Se concatenan y muestran los valores por pantalla con parámetros de printf
    printf("%s %d. %s \n", salida1.c_str(), numero, salida2.c_str());

}
