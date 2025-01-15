#include <stdio.h>
#include <stdlib.h>

// Questo programma simula un gioco di indovinelli numerici.
// L'utente deve indovinare il numero casuale generato dal programma.

int main() {
    int numero, tentativo, contatore = 0;
    srand(time(0));
    numero = rand() % 100 + 1;

    printf("Benvenuto al gioco di indovinelli numerici!\n");
    printf("Indovina il numero compreso tra 1 e 100: ");

    do {
        scanf("%d", &tentativo);
        contatore++;

        if (tentativo > numero)
            printf("Troppo alto. Riprova: ");
        else if (tentativo < numero)
            printf("Troppo basso. Riprova: ");
        else
            printf("Complimenti! Hai indovinato il numero in %d tentativi.\n", contatore);

    } while (tentativo != numero);

    return 0;
}
