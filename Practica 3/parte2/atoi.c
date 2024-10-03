#include <stdio.h>
#include <limits.h>

int mi_atoi(char* str) {
    int res = 0;
    int signo = 1;
    int i = 0;

    // Ignorar espacios en blanco
    while (str[i] == ' ') {
        i++;
    }

    // Determinar el signo
    if (str[i] == '-') {
        signo = -1;
        i++;
    } else if (str[i] == '+') {
        i++;
    }

    // Saltar ceros precedentes
    while (str[i] == '0') {
        i++;
    }

    // Convertir caracteres numéricos a entero
    while (str[i] >= '0' && str[i] <= '9') {
        // Verificar si hay desbordamiento
        if (res > (INT_MAX - (str[i] - '0')) / 10) {
            return (signo == 1) ? INT_MAX : INT_MIN;
        }

        res = res * 10 + (str[i] - '0');
        i++;
    }

    return res * signo;
}

int main() {
    printf("Programa para convertir una cadena en un entero\n");
    char cadena[50];
    
    printf("Ingresa una cadena que contenga números: ");
    fgets(cadena, 50, stdin);
    
    // Eliminar el salto de línea al final de la cadena si existe
    int len = 0;
    while (cadena[len] != '\0') len++;
    if (cadena[len - 1] == '\n') {
        cadena[len - 1] = '\0';
    }

    printf("El número es: %d\n", mi_atoi(cadena));

    return 0;
}
