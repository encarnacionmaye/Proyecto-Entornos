/*
Escribe letras y caracteres especiales en un fichero.
*/
#include <stdio.h>
main(){
	FILE *fichero;
	fichero = fopen("..\\daw2019.txt", "w");
	putc('F', fichero);
	putc(' ', fichero);
	putc('C', fichero);
	putc(' ', fichero);
	putc('B', fichero);
	putc('a', fichero);
	putc('r', fichero);
	putc('c', fichero);
	putc('e', fichero);
	putc('l', fichero);
	putc('o', fichero);
	putc('n', fichero);
	putc('a', fichero);
	putc('\n', fichero);
	int x;
	for(x=0; x<13; x++){
		putc('R', fichero);
		putc('e', fichero);
		putc('a', fichero);
		putc('l', fichero);
		putc(' ', fichero);
		putc('M', fichero);
		putc('a', fichero);
		putc('d', fichero);
		putc('r', fichero);
		putc('i', fichero);
		putc('d', fichero);
		putc('\n', fichero);
	}
	
	putc(';', fichero);
	putc(')', fichero);
	
	printf("Fichero creado correctamente!");
	
	fclose(fichero);
}

