#include <stdio.h>
#include <stdbool.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

bool rechercheEntier(Node* head, int valeur) {
    Node* current = head;
    
    while (current != NULL) {
        if (current->data == valeur) {
            return true;
        }
        current = current->next;
    }
    
    return false;
}
