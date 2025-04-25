package controllers;

import models.Book;

public class LibroController {

    // Método para ordenar libros por nombre en orden descendente
    public void sortByNameInserciónDescentente(Book[] libros) {
        // Implementación pendiente
    for (int i = 0; i < libros.length - 1; i++) {
        int Descendentemente = i;

        for (int j = i + 1; j < libros.length; j++) {
            if (libros[j].getNombre().compareTo(libros[Descendentemente].getNombre()) > 0) {
                Descendentemente = j;
            }
        }

        if (Descendentemente != i) {
            Book temp = libros[i];
            libros[i] = libros[Descendentemente];
            libros[Descendentemente] = temp;
            }
        }
    }


    // Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] libros, String name){
            // Implementación pendiente
            
        int bajo = 0;
        int alto= libros.length - 1;

        while (bajo <= alto){

            int center = (bajo + alto) /2;

            int comparar = libros[center].getNombre().compareTo(name);

            if (comparar == 0){
                return libros[center];
            }

            if (comparar < 0){
                bajo = center + 1;
            } else {
                alto = center - 1;
            }
        }
        return null;
    }

}
