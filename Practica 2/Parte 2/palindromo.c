#include <stdio.h>
#include <string.h>

void palindromo(char arr[], int n) {
    int i;
    for (i = 0; i < n / 2; i++) {
        if (arr[i] != arr[n - 1 - i]) {
            printf("No es un palindromo\n");
            return;
        }
    }
    printf("Es un palindromo\n");
}

int main() {
    char arr[100];  // Espacio para almacenar la cadena ingresada
    printf("Introduce un texto: ");
    scanf("%s", arr);  // Captura la entrada del usuario (hasta el primer espacio)

    int n = strlen(arr);  // Longitud de la cadena

    palindromo(arr, n);

    return 0;
}
