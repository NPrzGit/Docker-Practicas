#!/bin/bash
nombre="Nery"
curso="Jenkins"
#Empezar el loop
for a in 1 2 3 4 5 6 7 8 10 11 12 13 14 15
do
	#if es igual a 8 el loop descansa
    if [ $a == 8 ]
    then
    	sleep 15
        echo "A descansar de clase $nombre"
    fi
    echo "Clase No. $a"
done
sleep 30
echo "Bien $nombre, terminamos las clases de $curso, nos vemos."