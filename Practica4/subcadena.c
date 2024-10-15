#include <stdio.h>
#include <string.h>

int subcadena(char* s) {
    int maxLen = 0;
    int n = strlen(s);
    int stack[n + 1]; // Pila para almacenar índices
    int top = -1;     // Inicializa la pila vacía
    stack[++top] = -1; // Base para el cálculo de la longitud

    for (int i = 0; i < n; i++) {
        if (s[i] == '(') {
            // Empuja el índice de '(' en la pila
            stack[++top] = i;
        } else {
            // Si encontramos ')', eliminamos un índice de la pila
            top--;
            if (top == -1) {
                // Si la pila está vacía, agregamos el índice actual como base
                stack[++top] = i;
            } else {
                // Calculamos la longitud de la subcadena válida
                int len = i - stack[top];
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
    }

    return maxLen;
}

int main() {
    char s[100]; // Suponemos que la cadena no será mayor a 100 caracteres

    printf("Introduce una cadena de paréntesis: ");
    scanf("%s", s);

    printf("La longitud de la subcadena válida más larga es: %d\n", subcadena(s));

    return 0;
}
